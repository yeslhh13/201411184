package com.sd.fnl;
/**
 * �ֻ����� ������ ���
 * usage:
 * <pre>
 * 		Player p = new Player("yeseul");
 *		p.play(1);
 * </pre>
 * @author Noh Ye-seul
 * @version 1.1
 * @see com.sd.fnl.Dice
 * @see com.sd.fnl.Yoot
 * <pre>
 * <b>History:</b>
 * 		Noh Ye-seul, 1.0, 2016.12.06 �ʱ��ۼ�
 * 		Noh Ye-seul, 1.1, 2016.12.08 String ���� yoot,
 *			static ���� �ΰ� �߰�, play() �Լ��� play(int gNum)���� ����,
 *			getYoot() �Լ� �߰�
 *
 * </pre>
 */
class Player {
	/**
	 * �÷��̾��� �̸��� �����ϴ� ����
	 * @since version 1.0
	 */
	private String name = null;
	/**
	 * �ֻ����� ������ �� ������ ����
	 * @since version 1.0
	 * @see com.sd.fnl.Dice
	 */
	private int number = 0;
	/**
	 * ���� ������ �� ������ ���
	 * @since version 1.1
	 * @see com.sd.fnl.Yoot
	 */
	private String yoot = null;
	/**
	 * Game�� ������ �����ϱ� ���� ����.
	 * @since version 1.1
	 */
	private static final int DICE = 1, YOOT = 2;
	
	/**
	 * ������ Ŭ����. �÷��̾��� �̸��� ���� �ش�.
	 * @since version 1.0
	 * @see name
	 * @see #setName(String name)
	 * @param String name - �÷��̾��� �̸��� �����ϱ� ���� ����
	 */
	public Player(String name) {
		setName(name);
	}
	
	/**
	 * ������ 1�̸� �ֻ�����, 2�̸� ���� ������.
	 * @since version 1.0
	 * @param int gNum - �ֻ����� ������ ���� ������ �����ϱ� ���� ����
	 * @see com.sd.fnl.Dice
	 * @see com.sd.fnl.Dice#roll()
	 * @see com.sd.fnl.Yoot
	 * @see com.sd.fnl.Yoot#roll()
	 * @see number
	 * @see yoot
	 */
	public void play(int gNum) {
		switch(gNum) {
		case DICE:
			Dice d = new Dice();
			number = d.roll();
			break;
		case YOOT:
			Yoot y = new Yoot();
			number = y.roll();
			yoot = y.getYoot();
			break;
		default:
			break;
		}
	}
	
	/**
	 * �ֻ����� ���� ���� ���ڸ� �����´�
	 * @since version 1.0
	 * @see number
	 * @return number
	 */
	public int getNum() {
		return this.number;
	}
	
	/**
	 * ���� ���� ���� ����� �����´�
	 * @since version 1.1
	 * @see yoot
	 * @return yoot
	 */
	public String getYoot() {
		return this.yoot;
	}
	
	/**
	 * �÷��̾��� �̸��� �����´�
	 * @since version 1.0
	 * @see name
	 * @return name
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * �÷��̾��� �̸��� �����Ѵ�
	 * @since version 1.0
	 * @param String name - �缳���� �̸�
	 * @see name
	 */
	public void setName(String name) {
		this.name = name;
	}
}
