package com.sd.fnl;
/**
 * GUI를 이용하여 주사위 게임을 하는 클래스
 * usage:
 * <pre>
 *		DiceGameGUI dgg = new DiceGameGUI();
 *		dgg.setDefaultCloseOperation(EXIT_ON_CLOSE);
 *		dgg.pack();
 *		dgg.setVisible(true);
 * </pre>
 * @author Noh Ye-seul
 * @version 1.1
 * <pre>
 * <b>History:</b>
 * 		Noh Ye-seul, 1.0, 2016.12.08 초기작성
 * 		Noh Ye-seul, 1.1, 2016.12.09 전체 문서 완성
 * </pre>
 */
 
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class DiceGameGUI extends JFrame implements ActionListener {
	/**
	 * GUI 요소들을 수용하기 위한 컨테이너 변수
	 * @since version 1.0
	 * @see javax.swing.JPanel 
	 */
	protected JPanel pnl;
	/**
	 * GUI에 사용될 JLabel 변수들
	 * lbp1: 첫 번째 사용자 이름, lbp2: 두 번째 사용자 이름, lbrs1: 첫 번째 결과, lbrs2: 두 번째 결과, lbw: 승자
	 * @since version 1.0
	 * @see javax.swing.JLabel 
	 */
	protected JLabel lbp1, lbp2, lbrs1, lbrs2, lbw;
	/**
	 * GUI에 사용될 JTextField 변수들
	 * p1: 첫 번째 사용자 이름, p2: 두 번째 사용자 이름, rs1: 첫 번째 결과, rs2: 두 번째 결과, winner: 승자
	 * @since version 1.0
	 * @see javax.swing.JTextField 
	 */
	protected JTextField p1, p2, rs1, rs2, winner;
	/**
	 * GUI에 사용될 JButton 변수들
	 * startbtn: 게임을 시작하는 버튼, clearbtn: 입력값을 재설정하는 버튼
	 * @since version 1.0
	 * @see javax.swing.JButton 
	 */
	protected JButton startbtn, clearbtn;
	
	/**
	 * 생성자 클래스. 주사위 게임을 시작하기 위한 GUI를 선언
	 * @since version 1.0
	 * @see java.awt.GridLayout
	 * @see java.awt.event.ActionEvent
	 * @see java.awt.event.ActionListener
	 * @see javax.swing.JLabelx
	 * @see javax.swing.JPanel
	 * @see javax.swing.JTextField
	 * @see javax.swing.JButton
	 * @see java.awt.event.ActionListener#actionPerformed(ActionEvent e)
	 * @see javax.swing.JFrame#setTitle(String title)
	 */
	public DiceGameGUI() {
		setTitle("주사위 게임");
		pnl = new JPanel(new GridLayout(6, 2));
		getContentPane().add(pnl);
		
		lbp1 = new JLabel("1번 플레이어 이름: ");
		lbp2 = new JLabel("2번 플레이어 이름: ");
		lbrs1 = new JLabel("첫 게임 결과: ");
		lbrs2 = new JLabel("두 게임 결과: ");
		lbw = new JLabel("승자: ");
		
		p1 = new JTextField(10);
		p2 = new JTextField(10);
		rs1 = new JTextField(10);
		rs2 = new JTextField(10);
		winner = new JTextField(10);
		
		startbtn = new JButton("Game Start");
		clearbtn = new JButton("Clear");
		
		startbtn.addActionListener(this);
		clearbtn.addActionListener(this);
		
		pnl.add(lbp1);
		pnl.add(p1);
		pnl.add(lbp2);
		pnl.add(p2);
		pnl.add(lbrs1);
		pnl.add(rs1);
		pnl.add(lbrs2);
		pnl.add(rs2);
		pnl.add(lbw);
		pnl.add(winner);
		pnl.add(startbtn);
		pnl.add(clearbtn);		
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
	 * @see com.sd.fnl.DiceGame
	 * @see com.sd.fnl.DiceGame#play()
	 * @see com.sd.fnl.DiceGame#whoWins()
	 * @see com.sd.fnl.DiceGame#getP1()
	 * @see com.sd.fnl.DiceGame#getP2()
	 * @see com.sd.fnl.Player#getNum()
	 * @see p1
	 * @see p2
	 * @see rs1
	 * @see rs2
	 * @see winner
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
				
				DiceGame dg = new DiceGame(name1, name2);
				
				dg.play();
				rs1.setText(String.valueOf(dg.getP1().getNum()) + ", " + String.valueOf(dg.getP2().getNum()));
				
				dg.play();
				rs2.setText(String.valueOf(dg.getP1().getNum()) + ", " + String.valueOf(dg.getP2().getNum()));
				
				winner.setText(dg.whoWins());
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
		DiceGameGUI dgg = new DiceGameGUI();
		dgg.setDefaultCloseOperation(EXIT_ON_CLOSE);
		dgg.pack();
		dgg.setVisible(true);
	}
}