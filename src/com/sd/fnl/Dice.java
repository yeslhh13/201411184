package com.sd.fnl;
/**
 * 주사위를 굴리고 숫자를 확인하는 클래스
 * usage:
 * <pre>
 * 		Dice d = new Dice();
 * 		d.roll();
 * </pre>
 * @author Noh Ye-seul
 * @version 1.1
 * <pre>
 * <b>History:</b>
?* ??	Noh Ye-seul, 1.0, 2016.12.05 초기작성
 * 		Noh Ye-seul, 1.1, 2016.12.08 roll() 함수 내 출력문 삭제
?* </pre>
 */
public class Dice {
	/**
	 * 주사위를 굴렸을 때 나오는 숫자
	 * @since version 1.0
	 * @see roll();
	 * @see #getNumber(int number)
	 * @see #setNumber()
	 */
	private int number = 0;
	
	/**
	 * 주사위를 굴리는 함수
	 * @since version 1.0
	 * @see java.lang.Math
	 * @return number
	 */
	public int roll() {
		this.number = (int) (Math.random() * 6) + 1;
		return this.number;
	}
	
	/**
	 * 주사위에 나온 숫자를 재설정하는 함수
	 * @param int number - 재설정할 숫자
	 * @since version 1.0
	 * @see number
	 */
	public void setNumber(int number) {
		this.number = number;
	}
	
	/**
	 * 주사위에서 나온 숫자를 확인하는 함수
	 * @see number
	 * @since version 1.0
	 * @return number
	 */
	public int getNumber() {
		return number;
	}
}
