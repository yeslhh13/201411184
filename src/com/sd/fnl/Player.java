package com.sd.fnl;
/**
 * 주사위를 굴리는 사람
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
 * 		Noh Ye-seul, 1.0, 2016.12.06 초기작성
 * 		Noh Ye-seul, 1.1, 2016.12.08 String 변수 yoot,
 *			static 변수 두개 추가, play() 함수를 play(int gNum)으로 변경,
 *			getYoot() 함수 추가
 *
 * </pre>
 */
class Player {
	/**
	 * 플레이어의 이름을 저장하는 변수
	 * @since version 1.0
	 */
	private String name = null;
	/**
	 * 주사위를 굴렸을 때 나오는 숫자
	 * @since version 1.0
	 * @see com.sd.fnl.Dice
	 */
	private int number = 0;
	/**
	 * 윷을 던졌을 때 나오는 결과
	 * @since version 1.1
	 * @see com.sd.fnl.Yoot
	 */
	private String yoot = null;
	/**
	 * Game의 종류를 결정하기 위한 변수.
	 * @since version 1.1
	 */
	private static final int DICE = 1, YOOT = 2;
	
	/**
	 * 생성자 클래스. 플레이어의 이름을 정해 준다.
	 * @since version 1.0
	 * @see name
	 * @see #setName(String name)
	 * @param String name - 플레이어의 이름을 설정하기 위한 변수
	 */
	public Player(String name) {
		setName(name);
	}
	
	/**
	 * 변수가 1이면 주사위를, 2이면 윷을 던진다.
	 * @since version 1.0
	 * @param int gNum - 주사위를 던질지 윷을 던질지 결정하기 위한 변수
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
	 * 주사위를 던져 나온 숫자를 가져온다
	 * @since version 1.0
	 * @see number
	 * @return number
	 */
	public int getNum() {
		return this.number;
	}
	
	/**
	 * 윷을 던져 나온 결과를 가져온다
	 * @since version 1.1
	 * @see yoot
	 * @return yoot
	 */
	public String getYoot() {
		return this.yoot;
	}
	
	/**
	 * 플레이어의 이름을 가져온다
	 * @since version 1.0
	 * @see name
	 * @return name
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * 플레이어의 이름을 변경한다
	 * @since version 1.0
	 * @param String name - 재설정할 이름
	 * @see name
	 */
	public void setName(String name) {
		this.name = name;
	}
}
