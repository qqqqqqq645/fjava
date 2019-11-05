package swfram;

import java.awt.Color;

import java.awt.*;
import javax.swing.*;
public class ContentPaneeEx extends JFrame {

	public ContentPaneeEx() {
		setTitle("ContentPane 과 JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel pannal = new JPanel();
		pannal.setBackground(Color.ORANGE);
		
		pannal.add(new JButton("OK"));
		pannal.add(new JButton("Cancle"));
		pannal.add(new JButton("Ignore"));
		
		Container a  = getContentPane();
		a.add(pannal);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ContentPaneeEx();
	}

}
