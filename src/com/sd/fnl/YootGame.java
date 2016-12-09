package com.sd.fnl;
/**
 * Yoot 클래스와 Player 클래스를 이용하여 주사위 게임을 하는 클래스
 * usage:
 * <pre>
 * 		YootGame yg = new YootGame("yeseul", "soyeon");
 *		yg.play();
 * </pre>
 * @author Noh Ye-seul
 * @version 1.1
 * <pre>
 * <b>History:</b>
 * 		Noh Ye-seul, 1.0, 2016.12.06 초기작성
 * 		Noh Ye-seul, 1.1, 2016.12.09 전체 완성
 * </pre>
 */
 
public class YootGame extends DiceGame {
	public YootGame(String name1, String name2) {
		super(name1, name2);
	}
	
	/**
	 * 게임 실행!
	 * @since version 1.1
	 * @see com.sd.fnl.Player
	 * @see com.sd.fnl.Player#play(int gNum)
	 * @see com.sd.fnl.Player#getNum()
	 * @see com.sd.fnl.DiceGame#scorePlus(int num1, int num2)
	 * @see com.sd.fnl.DiceGame#p1
	 * @see com.sd.fnl.DiceGame#p2
	 */
	public void play() {
		getP1().play(2);
		getP2().play(2);
		
		int num1 = getP1().getNum();
		int num2 = getP2().getNum();
		
		scorePlus(num1, num2);
	}
}