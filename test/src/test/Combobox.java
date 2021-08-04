package test;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Combobox extends JFrame{
	
	private JComboBox box;
	private JLabel pic;
	
	private static String[] filename = {"icon.png", "icon2.png"};
	private Icon[] image = {new ImageIcon(getClass().getResource(filename[0])), new ImageIcon(getClass().getResource(filename[1]))};
	
	public Combobox() {
		super("Title");
		setLayout(new FlowLayout());
		
		box = new JComboBox(filename);
		box.addItemListener(
				new ItemListener() {
					public void itemStateChanged(ItemEvent e) {
						if(e.getStateChange()==ItemEvent.SELECTED)
							pic.setIcon(image[box.getSelectedIndex()]);
					}
				}
				);
		
		add(box);
		pic = new JLabel(image[0]);
		add(pic);
		
		
	}
}
