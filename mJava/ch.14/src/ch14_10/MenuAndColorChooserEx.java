package ch14_10;

import java.awt.*;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.Event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuAndColorChooserEx extends JFrame{
	private JLabel label = new JLabel("Hello");
	
	public MenuAndColorChooserEx() {
		setTitle("JColorChooser 활용 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Revie", Font.ITALIC, 30));
		c.add(label);
		createMenu();
		setSize(250,200);
		setVisible(true);
	}
	
	private void createMenu() {
		JMenuBar mb = new JMenuBar();
		JMenuItem colorMenuItem = new JMenuItem("Color");
		JMenu fileMenu = new JMenu("Text");
		
		colorMenuItem.addActionListener(new MenuActionListener());
		
		fileMenu.add(colorMenuItem);
		mb.add(fileMenu);
		this.setJMenuBar(mb);
		
		setJMenuBar(mb);
	}
	
	class MenuActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String cmd = e.getActionCommand();
			if(cmd.equals("Color")) {
				Color selectedColor = JColorChooser.showDialog(null,  "Color", Color.YELLOW);
				if(selectedColor != null)
					label.setForeground(selectedColor);
			}
		}
	}

	public static void main(String[] args) {
		new MenuAndColorChooserEx();
	}

}
