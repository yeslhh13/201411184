package com.sd.fnl;
/**
 * 윷을 던져 결과를 확인하는 클래스
 * usage:
 * <pre>
 * 		Yoot y = new Yoot();
 * 		y.roll();
 * </pre>
 * @author Noh Ye-seul
 * @version 1.1
 * @see com.sd.fnl.Dice
 * <pre>
 * <b>History:</b>
?* ??	Noh Ye-seul, 1.0, 2016.12.05 초기작성
 * 		Noh Ye-seul, 1.1, 2016.12.09 오류 제거, random number를 4에서 5까지로 변경, setYoot()의 파라미터 제거
?* </pre>
 */
 
public class Yoot extends Dice {
	/**
	 * 윷을 던졌을 때 나오는 값
	 * @since version 1.0
	 * @see roll();
	 * @see #setYoot(int number)
	 * @see #getYoot()
	 */
	private String yoot = null;
	
	/**
	 * 윷을 던지는 함수
	 * @since version 1.0
	 * @see #setYoot()
	 * @see com.sd.fnl.Dice#roll()
	 * @see com.sd.fnl.Dice#setNumber(int number)
	 * @see com.sd.fnl.Dice#getNumber()
	 * @see java.lang.Math
	 * @return number
	 */
	public int roll() {
		setNumber((int) (Math.random() * 5) + 1);
		setYoot();
		return getNumber();
	}
	
	/**
	 * 윷을 던져 나온 수에 따라 yoot 변수를 변경해주는 함수
	 * @since version 1.0
	 * @see yoot
	 */
	public void setYoot() {
		if (getNumber() == 1)
			yoot = "도";
		else if (getNumber() == 2)
			yoot = "개";
		else if (getNumber() == 3)
			yoot = "걸";
		else if (getNumber() == 4)
			yoot = "윷";
		else if (getNumber() == 5)
			yoot = "모";
		else 
			yoot = null;
	}
	
	/**
	 * 윷을 던져 나온 결과를 get하는 함수
	 * @since version 1.0
	 * @see yoot
	 * @return yoot
	 */
	public String getYoot() {
		return this.yoot;
	}
}