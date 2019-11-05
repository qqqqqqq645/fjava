package chEvnent;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.*;

public class TestClassListener extends JFrame {

	TestClassListener(){
		setTitle("리스너-독립");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JButton btn = new JButton("Action");
		btn.addActionListener(new MyActionListener());
		c.add(btn);
		
		setSize(350,150);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new TestClassListener();
		
	}

}
