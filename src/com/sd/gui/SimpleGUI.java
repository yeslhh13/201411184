package com.sd.gui;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Container;

public class SimpleGUI {
	public void sayHello() {
		JFrame frm = new JFrame();
		JButton btn = new JButton("Hello");		//JButton("button name");
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container pane = frm.getContentPane();
		pane.add(btn);
		frm.setSize(100, 100);
		frm.setVisible(true);
	}
}