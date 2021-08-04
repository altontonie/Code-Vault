package test;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Frames extends JFrame {
	
	private JLabel item;
	
	public Frames() {
		super("i am title");
		setLayout(new FlowLayout());
		
		item = new JLabel("This is etxt");
		item.setToolTipText("this is pop up");
		add(item);
	}
	
}
