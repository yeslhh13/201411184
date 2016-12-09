package com.sd.fnl;
/**
 * ���� ���� ����� Ȯ���ϴ� Ŭ����
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
?* ??	Noh Ye-seul, 1.0, 2016.12.05 �ʱ��ۼ�
 * 		Noh Ye-seul, 1.1, 2016.12.09 ���� ����, random number�� 4���� 5������ ����, setYoot()�� �Ķ���� ����
?* </pre>
 */
 
public class Yoot extends Dice {
	/**
	 * ���� ������ �� ������ ��
	 * @since version 1.0
	 * @see roll();
	 * @see #setYoot(int number)
	 * @see #getYoot()
	 */
	private String yoot = null;
	
	/**
	 * ���� ������ �Լ�
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
	 * ���� ���� ���� ���� ���� yoot ������ �������ִ� �Լ�
	 * @since version 1.0
	 * @see yoot
	 */
	public void setYoot() {
		if (getNumber() == 1)
			yoot = "��";
		else if (getNumber() == 2)
			yoot = "��";
		else if (getNumber() == 3)
			yoot = "��";
		else if (getNumber() == 4)
			yoot = "��";
		else if (getNumber() == 5)
			yoot = "��";
		else 
			yoot = null;
	}
	
	/**
	 * ���� ���� ���� ����� get�ϴ� �Լ�
	 * @since version 1.0
	 * @see yoot
	 * @return yoot
	 */
	public String getYoot() {
		return this.yoot;
	}
}