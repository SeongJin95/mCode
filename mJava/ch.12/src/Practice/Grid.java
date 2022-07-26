package Practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Grid extends JFrame {
	public Grid() {
		super("격자 그리기");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		setSize(300,300);
		setVisible(true);
		
		getContentPane().setFocusable(true);
		getContentPane().requestFocus();
	}
		
	class MyPanel extends JPanel{
		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			int dw = getWidth()/10;
			for(int i=1;i<=9;i++){
				g.drawLine(i*dw,0,i*dw,getHeight());
			}
			int dh = getHeight()/10;
			for(int i=1;i<=9;i++)
				g.drawLine(0,i*dh,getWidth(),i*dh);
		}
	}
	
	public static void main(String[] args) {
		new Grid();
	}

}


