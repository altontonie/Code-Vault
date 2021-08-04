package test;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Checkbox extends JFrame{
	private JTextField tf;
	private JCheckBox boldBox;
	private JCheckBox italicBox;
	
	public Checkbox() {
		super("Title");
		setLayout(new FlowLayout());
		
		tf = new JTextField("This is a sentence...",20);
		tf.setFont(new Font("Serif", Font.PLAIN, 14));
		add(tf);
		
		boldBox = new JCheckBox("Bold");
		italicBox = new JCheckBox("Italic");
		add(boldBox);
		add(italicBox);
		
		Handler theHandler = new Handler();
		boldBox.addItemListener(theHandler);
		italicBox.addItemListener(theHandler);
		
	}
	
	private class Handler implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			// TODO Auto-generated method stub
			Font font = null;
			
			if(boldBox.isSelected() && italicBox.isSelected())
				font = new Font("Serif", Font.BOLD + Font.ITALIC,14);
			else if(boldBox.isSelected())
				font = new Font("Serif", Font.BOLD,14);
			else if(italicBox.isSelected())
				font = new Font("Serif",Font.ITALIC,14);
			else
				font = new Font("Serif", Font.PLAIN, 14);
			
			tf.setFont(font);
				
		}
		
	}
	
}
