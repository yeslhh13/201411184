package com.sd.fnl;
/**
 * Dice 클래스와 Player 클래스를 이용하여 주사위 게임을 하는 클래스
 * usage:
 * <pre>
 * 		DiceGame dg = new DiceGame("yeseul", "soyeon");
 *		dg.play();
 * </pre>
 * @author Noh Ye-seul
 * @version 1.1
 * <pre>
 * <b>History:</b>
 * 		Noh Ye-seul, 1.0, 2016.12.06 초기작성
 *		Noh Ye-seul, 1.1, 2016.12.08 출력문 삭제, whoWins() 함수 parameter 제거
 * 		Noh Ye-seul, 1.2, 2016.12.09 play() 함수 작성, whoWins() 함수 수정
 * </pre>
 */
 
public class DiceGame {
	/**
	 * 첫 번째 플레이어 변수
	 * @since version 1.0
	 * @see com.sd.fnl.Player
	 */
	private Player p1;
	/**
	 * 두 번째 플레이어 변수
	 * @since version 1.0
	 * @see com.sd.fnl.Player
	 */
	private Player p2;
	/**
	 * 첫 번째 플레이어의 점수를 저장하는 int형 변수
	 * @since version 1.0
	 */
	protected int score1 = 0;
	/**
	 * 두 번째 플레이어의 점수를 저장하는 int형 변수
	 * @since version 1.0
	 */
	protected int score2 = 0;
	
	/**
	 * 생성자 클래스. 주사위 게임을 시작한다.
	 * @since version 1.0
	 * @param String name1 - 첫 번째 플레이어의 이름
	 * @param String name2 - 두 번째 플레이어의 이름
	 * @see p1
	 * @see p2
	 * @see com.sd.fnl.Player
	 */
	public DiceGame(String name1, String name2) {
		p1 = new Player(name1);
		p2 = new Player(name2);
	}
	
	/**
	 * 플레이어 각각에게 점수를 더해주는 함수. 이기면 50점, 비기면 30점, 지면 0점을 얻는다.
	 * @since version 1.0
	 * @param int num1 - 첫 번째 플레이어의 주사위 숫자
	 * @param int num2 - 두 번째 플레이어의 주사위 숫자
	 * @see score1
	 * @see score2
	 */
	public void scorePlus(int num1, int num2) {
		if (num1 > num2)
			score1 += 50;
		else if (num1 == num2) {
			score1 += 30;
			score2 += 30;
		}
		else
			score2 += 50;
	}
	
	/**
	 * 게임 실행!
	 * @since version 1.2
	 * @see com.sd.fnl.Player
	 * @see com.sd.fnl.Player#play(int gNum)
	 * @see com.sd.fnl.Player#getNum()
	 * @see #scorePlus(int num1, int num2)
	 * @see p1
	 * @see p2
	 */
	public void play() {
		p1.play(1);
		p2.play(1);
		
		int num1 = p1.getNum();
		int num2 = p2.getNum();
		
		scorePlus(num1, num2);
	}
	
	/**
	 * 플레이어 객체를 가져온다
	 * @since version 1.0
	 * @see com.sd.fnl.Player
	 * @see p1
	 * @return p1
	 */
	public Player getP1() {
		return p1;
	}
	
	/**
	 * 플레이어 객체를 가져온다
	 * @since version 1.0
	 * @see com.sd.fnl.Player
	 * @see p2
	 * @return p2
	 */
	public Player getP2() {
		return p2;
	}
	
	/**
	 * 이긴 사람을 알아내는 함수
	 * @since version 1.0
	 * @see com.sd.fnl.Player
	 * @see com.sd.fnl.Player#getName()
	 * @see p1
	 * @see p2
	 * @see score1
	 * @see score2
	 * @return name
	 */
	public String whoWins() {
		if (score1 > score2)
			return p1.getName();
		else if (score1 < score2)
			return p2.getName();
		else
			return "무승부";
	}
}