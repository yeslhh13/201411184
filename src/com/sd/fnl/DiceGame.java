package com.sd.fnl;
/**
 * Dice Ŭ������ Player Ŭ������ �̿��Ͽ� �ֻ��� ������ �ϴ� Ŭ����
 * usage:
 * <pre>
 * 		DiceGame dg = new DiceGame("yeseul", "soyeon");
 *		dg.play();
 * </pre>
 * @author Noh Ye-seul
 * @version 1.1
 * <pre>
 * <b>History:</b>
 * 		Noh Ye-seul, 1.0, 2016.12.06 �ʱ��ۼ�
 *		Noh Ye-seul, 1.1, 2016.12.08 ��¹� ����, whoWins() �Լ� parameter ����
 * 		Noh Ye-seul, 1.2, 2016.12.09 play() �Լ� �ۼ�, whoWins() �Լ� ����
 * </pre>
 */
 
public class DiceGame {
	/**
	 * ù ��° �÷��̾� ����
	 * @since version 1.0
	 * @see com.sd.fnl.Player
	 */
	private Player p1;
	/**
	 * �� ��° �÷��̾� ����
	 * @since version 1.0
	 * @see com.sd.fnl.Player
	 */
	private Player p2;
	/**
	 * ù ��° �÷��̾��� ������ �����ϴ� int�� ����
	 * @since version 1.0
	 */
	protected int score1 = 0;
	/**
	 * �� ��° �÷��̾��� ������ �����ϴ� int�� ����
	 * @since version 1.0
	 */
	protected int score2 = 0;
	
	/**
	 * ������ Ŭ����. �ֻ��� ������ �����Ѵ�.
	 * @since version 1.0
	 * @param String name1 - ù ��° �÷��̾��� �̸�
	 * @param String name2 - �� ��° �÷��̾��� �̸�
	 * @see p1
	 * @see p2
	 * @see com.sd.fnl.Player
	 */
	public DiceGame(String name1, String name2) {
		p1 = new Player(name1);
		p2 = new Player(name2);
	}
	
	/**
	 * �÷��̾� �������� ������ �����ִ� �Լ�. �̱�� 50��, ���� 30��, ���� 0���� ��´�.
	 * @since version 1.0
	 * @param int num1 - ù ��° �÷��̾��� �ֻ��� ����
	 * @param int num2 - �� ��° �÷��̾��� �ֻ��� ����
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
	 * ���� ����!
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
	 * �÷��̾� ��ü�� �����´�
	 * @since version 1.0
	 * @see com.sd.fnl.Player
	 * @see p1
	 * @return p1
	 */
	public Player getP1() {
		return p1;
	}
	
	/**
	 * �÷��̾� ��ü�� �����´�
	 * @since version 1.0
	 * @see com.sd.fnl.Player
	 * @see p2
	 * @return p2
	 */
	public Player getP2() {
		return p2;
	}
	
	/**
	 * �̱� ����� �˾Ƴ��� �Լ�
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
			return "���º�";
	}
}