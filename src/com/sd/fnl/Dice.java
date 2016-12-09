package com.sd.fnl;
/**
 * �ֻ����� ������ ���ڸ� Ȯ���ϴ� Ŭ����
 * usage:
 * <pre>
 * 		Dice d = new Dice();
 * 		d.roll();
 * </pre>
 * @author Noh Ye-seul
 * @version 1.1
 * <pre>
 * <b>History:</b>
?* ??	Noh Ye-seul, 1.0, 2016.12.05 �ʱ��ۼ�
 * 		Noh Ye-seul, 1.1, 2016.12.08 roll() �Լ� �� ��¹� ����
?* </pre>
 */
public class Dice {
	/**
	 * �ֻ����� ������ �� ������ ����
	 * @since version 1.0
	 * @see roll();
	 * @see #getNumber(int number)
	 * @see #setNumber()
	 */
	private int number = 0;
	
	/**
	 * �ֻ����� ������ �Լ�
	 * @since version 1.0
	 * @see java.lang.Math
	 * @return number
	 */
	public int roll() {
		this.number = (int) (Math.random() * 6) + 1;
		return this.number;
	}
	
	/**
	 * �ֻ����� ���� ���ڸ� �缳���ϴ� �Լ�
	 * @param int number - �缳���� ����
	 * @since version 1.0
	 * @see number
	 */
	public void setNumber(int number) {
		this.number = number;
	}
	
	/**
	 * �ֻ������� ���� ���ڸ� Ȯ���ϴ� �Լ�
	 * @see number
	 * @since version 1.0
	 * @return number
	 */
	public int getNumber() {
		return number;
	}
}
