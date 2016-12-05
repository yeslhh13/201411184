package com.sd.gui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class CalcAreaGUIMain2 extends JFrame implements ActionListener {
	private JPanel pnl;
	private JLabel lb1, lb2;
	private JTextField tf1, tf2;
	private JButton btn1, btn2;
	private Double radius, area;
	
	public CalcAreaGUIMain2() {
		pnl = new JPanel(new GridLayout(3, 2));
		getContentPane().add(pnl);
		
		lb1 = new JLabel("Radius");
		lb2 = new JLabel("Area");
		tf1 = new JTextField(10);
		tf2 = new JTextField(10);
		btn1 = new JButton("Compute");
		btn2 = new JButton("Cancel");
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		
		//first line
		pnl.add(lb1);
		pnl.add(tf1);
		//second line
		pnl.add(lb2);
		pnl.add(tf2);
		//third-button line
		pnl.add(btn1);
		pnl.add(btn2);
		
		//pack();
		//setSize(300, 150);
		//setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton)e.getSource();
		if (btn == btn1) {
			//Compute 버튼 클릭
			btn.setText("Complete.");
				
			radius = Double.parseDouble(tf1.getText());
			area = Math.pow(radius, 2) * Math.PI;
			
			//소숫점 2자리만 잘라서 나타낸다.
			tf2.setText(String.format("%.2f", area));
		}
		else if (btn == btn2) {
			//Cancel 버튼 클릭
			tf1.setText("");
			tf2.setText("");
		}
	}
	
	public static void main(String[] args) {
		CalcAreaGUIMain2 cag = new CalcAreaGUIMain2();
		cag.setDefaultCloseOperation(EXIT_ON_CLOSE);
		cag.pack();
		cag.setVisible(true);
	}
}