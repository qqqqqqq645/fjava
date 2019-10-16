package ch09.basic;


import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.*;

public class MySwingFirst extends JFrame {

	MySwingFirst(){
		setTitle("나의 첫번째 swing"); // 타이틀 설정
		JButton btn1 = new JButton("버튼클릭");
		Container c = getContentPane();
		c.setLayout(new FlowLayout);
		c.add(btn1);
		setSize(300, 400);
		setVisible(true);
	}
	public static void main(String[] args) {
		new MySwingFirst();
	}

}
