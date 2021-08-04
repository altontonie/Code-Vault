package test;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class mouseAdapter extends JFrame{
	
	private String text;
	private JLabel status;
	
	public mouseAdapter() {
		super("Title");
		
		status = new JLabel("Default");
		add(status, BorderLayout.SOUTH);
		addMouseListener(new mouseClass());
	}
	
	private class mouseClass extends MouseAdapter {
		public void mouseClicked(MouseEvent e) {
			text = String.format("You clicked %d ", e.getClickCount());
			
			if(e.isMetaDown())
				text += "times right mouse";
			else if(e.isAltDown())
				text += "times middle mouse";
			else
				text += "times left mouse";
			
			status.setText(text);
		}
	}
	
}
