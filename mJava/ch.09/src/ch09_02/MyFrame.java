package ch09_02;

import java.awt.*;
import javax.swing.*;

public class MyFrame extends JFrame{
	public MyFrame() {
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		
		setLayout(new FlowLayout());
		JButton button = new JButton("버튼");
		this.add(button);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		MyFrame f= new MyFrame();
	}

}
