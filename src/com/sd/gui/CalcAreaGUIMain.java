package com.sd.gui;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class CalcAreaGUIMain extends JFrame {
	public CalcAreaGUIMain() {
		JPanel pnl = new JPanel(new GridLayout(3, 2));
		getContentPane().add(pnl);
		
		JLabel lb1 = new JLabel("Radius");
		JLabel lb2 = new JLabel("Area");
		JTextField tf1 = new JTextField(10);
		JTextField tf2 = new JTextField(10);
		JButton btn1 = new JButton("Compute");
		JButton btn2 = new JButton("Cancel");
		
		//first line
		pnl.add(lb1);
		pnl.add(tf1);
		//second line
		pnl.add(lb2);
		pnl.add(tf2);
		//third-button line
		pnl.add(btn1);
		pnl.add(btn2);
		
		pack();
		setSize(300, 150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		CalcAreaGUIMain cag = new CalcAreaGUIMain();
	}
}