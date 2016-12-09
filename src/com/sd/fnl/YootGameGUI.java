package com.sd.fnl;
/**
 * GUI를 이용하여 주사위 게임을 하는 클래스
 * usage:
 * <pre>
 *		YootGameGUI ygg = new YootGameGUI();
 *		ygg.setDefaultCloseOperation(EXIT_ON_CLOSE);
 *		ygg.pack();
 *		ygg.setVisible(true);
 * </pre>
 * @author Noh Ye-seul
 * @version 1.0
 * <pre>
 * <b>History:</b>
 * 		Noh Ye-seul, 1.0, 2016.12.09 초기작성
 * </pre>
 */
 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;

public class YootGameGUI extends DiceGameGUI {
	/**
	 * 생성자 클래스. 윷 게임을 시작하기 위한 GUI를 선언
	 * @since version 1.0
	 * @see com.sd.fnl.DiceGameGUI
	 * @see javax.swing.JFrame#setTitle(String title)
	 */
	public YootGameGUI() {
			super();
			setTitle("윷놀이");
	}
	
	/**
	 * 버튼이 눌렸을 때 실행할 함수 선언
	 * @since version 1.0
	 * @param ActionEvent e
	 * @see java.awt.event.ActionEvent
	 * @see java.awt.event.ActionListener
	 * @see javax.swing.JTextField
	 * @see javax.swing.JButton
	 * @see java.awt.event.ActionEvent#getSource()
	 * @see com.sd.fnl.YootGame
	 * @see com.sd.fnl.YootGame#play()
	 * @see com.sd.fnl.YootGame#whoWins()
	 * @see com.sd.fnl.YootGame#getP1()
	 * @see com.sd.fnl.YootGame#getP2()
	 * @see com.sd.fnl.Player#getYoot()
	 * @see com.sd.fnl.DiceGameGUI#p1
	 * @see com.sd.fnl.DiceGameGUI#p2
	 * @see com.sd.fnl.DiceGameGUI#rs1
	 * @see com.sd.fnl.DiceGameGUI#rs2
	 * @see com.sd.fnl.DiceGameGUI#winner
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton)e.getSource();
		if (btn == startbtn) {
			if (p1.getText().equals("") || p2.getText().equals(""))
				btn.setText("플레이어명 누락");
			else if (p1.getText().equals(p2.getText()))
				btn.setText("플레이어명 동일");
			else {
				btn.setText("Game End");
				String name1 = p1.getText();
				String name2 = p2.getText();
				
				YootGame yg = new YootGame(name1, name2);
				
				yg.play();
				rs1.setText(yg.getP1().getYoot() + ", " + yg.getP2().getYoot());
				
				yg.play();
				rs2.setText(yg.getP1().getYoot() + ", " + yg.getP2().getYoot());
				
				winner.setText(yg.whoWins());
			}
		}
		else if (btn == clearbtn) {
			p1.setText("");
			p2.setText("");
			rs1.setText("");
			rs2.setText("");
			winner.setText("");
		}
	}
	
	public static void main(String[] args) {
		YootGameGUI ygg = new YootGameGUI();
		ygg.setDefaultCloseOperation(EXIT_ON_CLOSE);
		ygg.pack();
		ygg.setVisible(true);
	}
}