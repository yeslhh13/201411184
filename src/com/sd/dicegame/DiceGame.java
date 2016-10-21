package com.sd.dicegame;

import java.text.DateFormat;

class DiceGame {
	private Player p1;
	private Player p2;
	private int score1 = 0;
	private int score2 = 0;
	
	long startTime;
	//함수에서도 사용해야 하므로 class 변수로 넣는다.
	
	public DiceGame(String name1, String name2) {
		p1 = new Player(name1);
		p2 = new Player(name2);
		//플레이어 이름 임의로 입력
		
		startTime = System.currentTimeMillis();
		//처음 시작 시간 기록
		
		for (int i = 0; i < 2; i++) {
			//주사위를 두 번 던져야 하므로 for 문으로 2번 loop를 돌게 한다.
			p1.play();
			p2.play();
			//게임 시작
			
			System.out.println("\n");
			
			scorePlus(p1.getNum(), p2.getNum());
		}
		
		whoWins(p1, p2);
		Times();
		//점수 계산까지 완벽하게 끝난 시간으로 계산해야 하므로 마지막에 넣는다.
	}
	
	public void Times() {
		//게임할 때 걸린 시간을 계산하는 함수
		System.out.println("This game started at " + DateFormat.getInstance().format(startTime));
		System.out.println("And it took " + ((System.currentTimeMillis() - startTime) / 60.0) + " seconds\n");
	}
	
	public void scorePlus(int num1, int num2) {
		//플레이어 각각에게 점수를 더해주는 함수. 이기면 50점, 비기면 30점, 지면 0점을 얻는다.
		if (num1 > num2)
			score1 += 50;
		else if (num1 == num2) {
			score1 += 30;
			score2 += 30;
		}
		else
			score2 += 50;
	}
	
	public void whoWins(Player p1, Player p2) {
		//이긴 사람을 알아내는 함수. 점수가 큰 사람부터 정렬하여 출력하는 방식.
		if (score1 > score2) {
			System.out.println("Player " + p1.getName() + "'s score: " + score1);
			System.out.println("Player " + p2.getName() + "'s score: " + score2);
			
			System.out.println("Player " + p1.getName() + " wins!");
		}
		else if (score1 == score2) {
			System.out.println("Player " + p1.getName() + "'s score: " + score1);
			System.out.println("Player " + p2.getName() + "'s score: " + score2);
			
			System.out.println("Draw!");
		}
		else {
			System.out.println("Player " + p2.getName() + "'s score: " + score2);
			System.out.println("Player " + p1.getName() + "'s score: " + score1);
			
			System.out.println("Player " + p2.getName() + " wins!");
		}
		
		System.out.println("\n");
	}
	
	public static void main(String[] args) {
		//메인
		new DiceGame("ys", "sy");
	}
}