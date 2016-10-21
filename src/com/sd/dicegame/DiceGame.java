package com.sd.dicegame;

import java.text.DateFormat;

class DiceGame {
	private Player p1;
	private Player p2;
	private int score1 = 0;
	private int score2 = 0;
	
	long startTime;
	//�Լ������� ����ؾ� �ϹǷ� class ������ �ִ´�.
	
	public DiceGame(String name1, String name2) {
		p1 = new Player(name1);
		p2 = new Player(name2);
		//�÷��̾� �̸� ���Ƿ� �Է�
		
		startTime = System.currentTimeMillis();
		//ó�� ���� �ð� ���
		
		for (int i = 0; i < 2; i++) {
			//�ֻ����� �� �� ������ �ϹǷ� for ������ 2�� loop�� ���� �Ѵ�.
			p1.play();
			p2.play();
			//���� ����
			
			System.out.println("\n");
			
			scorePlus(p1.getNum(), p2.getNum());
		}
		
		whoWins(p1, p2);
		Times();
		//���� ������ �Ϻ��ϰ� ���� �ð����� ����ؾ� �ϹǷ� �������� �ִ´�.
	}
	
	public void Times() {
		//������ �� �ɸ� �ð��� ����ϴ� �Լ�
		System.out.println("This game started at " + DateFormat.getInstance().format(startTime));
		System.out.println("And it took " + ((System.currentTimeMillis() - startTime) / 60.0) + " seconds\n");
	}
	
	public void scorePlus(int num1, int num2) {
		//�÷��̾� �������� ������ �����ִ� �Լ�. �̱�� 50��, ���� 30��, ���� 0���� ��´�.
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
		//�̱� ����� �˾Ƴ��� �Լ�. ������ ū ������� �����Ͽ� ����ϴ� ���.
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
		//����
		new DiceGame("ys", "sy");
	}
}