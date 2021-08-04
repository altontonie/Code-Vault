package test;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Buttons extends JFrame{
	
	private JButton reg;
	private JButton custom;
	
	public Buttons() {
		super("title");
		setLayout(new FlowLayout());
		
		reg = new JButton("regular button");
		add(reg);
		
		Icon iconObj = new ImageIcon(getClass().getResource("icon.png"));
		Icon iconObj1 = new ImageIcon(getClass().getResource("icon2.png"));
		custom = new JButton("custom button",iconObj);
		custom.setRolloverIcon(iconObj1);
		add(custom);
		
		Handler theHandler = new Handler();
		reg.addActionListener(theHandler);
		custom.addActionListener(theHandler);
		
	}
	
	private class Handler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JOptionPane.showMessageDialog(null, String.format("%s", e.getActionCommand()));
		}
		
	}
	
}

















