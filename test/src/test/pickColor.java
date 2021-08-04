package test;
import java.awt.*;
import java.awt.color.ColorSpace;
import java.awt.event.*;
import javax.swing.*;

public class pickColor extends JFrame{
	private JPanel panel;
	private JButton b;
	private Color color = Color.WHITE;
	
	public pickColor() {
		super("Title");
		panel = new JPanel();
		panel.setBackground(color);
		
		b = new JButton("Choose color");
		b.addActionListener(
				new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						color = JColorChooser.showDialog(null, "Pick color", color);
						if(color==null)
							color = Color.WHITE;
						
						panel.setBackground(color);
					}
				}
			);
		add(panel, BorderLayout.CENTER);
		add(b, BorderLayout.SOUTH);
		setSize(200,200);
		setVisible(true);
	}
	
}
