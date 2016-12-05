package com.sd.gui;

import javax.swing.JFrame;

public class HelloSwing extends JFrame {
	public HelloSwing() {
		//JFrame을 상속받았으므로 객체명을 넣지 않는다.
		setTitle("Hello");
		setSize(400, 400);
		setVisible(true);
	}
}