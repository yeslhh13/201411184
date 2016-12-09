package com.sd.fnl;
/**
 * GUI�� �̿��Ͽ� �ֻ��� ������ �ϴ� Ŭ����
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
 * 		Noh Ye-seul, 1.0, 2016.12.08 �ʱ��ۼ�
 * 		Noh Ye-seul, 1.1, 2016.12.09 ��ü ���� �ϼ�
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
	 * GUI ��ҵ��� �����ϱ� ���� �����̳� ����
	 * @since version 1.0
	 * @see javax.swing.JPanel 
	 */
	protected JPanel pnl;
	/**
	 * GUI�� ���� JLabel ������
	 * lbp1: ù ��° ����� �̸�, lbp2: �� ��° ����� �̸�, lbrs1: ù ��° ���, lbrs2: �� ��° ���, lbw: ����
	 * @since version 1.0
	 * @see javax.swing.JLabel 
	 */
	protected JLabel lbp1, lbp2, lbrs1, lbrs2, lbw;
	/**
	 * GUI�� ���� JTextField ������
	 * p1: ù ��° ����� �̸�, p2: �� ��° ����� �̸�, rs1: ù ��° ���, rs2: �� ��° ���, winner: ����
	 * @since version 1.0
	 * @see javax.swing.JTextField 
	 */
	protected JTextField p1, p2, rs1, rs2, winner;
	/**
	 * GUI�� ���� JButton ������
	 * startbtn: ������ �����ϴ� ��ư, clearbtn: �Է°��� �缳���ϴ� ��ư
	 * @since version 1.0
	 * @see javax.swing.JButton 
	 */
	protected JButton startbtn, clearbtn;
	
	/**
	 * ������ Ŭ����. �ֻ��� ������ �����ϱ� ���� GUI�� ����
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
		setTitle("�ֻ��� ����");
		pnl = new JPanel(new GridLayout(6, 2));
		getContentPane().add(pnl);
		
		lbp1 = new JLabel("1�� �÷��̾� �̸�: ");
		lbp2 = new JLabel("2�� �÷��̾� �̸�: ");
		lbrs1 = new JLabel("ù ���� ���: ");
		lbrs2 = new JLabel("�� ���� ���: ");
		lbw = new JLabel("����: ");
		
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
	 * ��ư�� ������ �� ������ �Լ� ����
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
				btn.setText("�÷��̾�� ����");
			else if (p1.getText().equals(p2.getText()))
				btn.setText("�÷��̾�� ����");
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