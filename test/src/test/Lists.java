package test;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Lists extends JFrame{
	
	private JList list;
	private String[] colornames = {"black","red","blue","green"};
	private Color[] colors = {Color.BLACK,Color.RED,Color.BLUE,Color.GREEN};
	
	public Lists() {
		super("Title");
		setLayout(new FlowLayout());
		
		list = new JList(colornames);
		list.setVisibleRowCount(3);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		add(new JScrollPane(list)); 
		
		list.addListSelectionListener(
				new ListSelectionListener() {
					public void valueChanged(ListSelectionEvent e) {
						getContentPane().setBackground(colors[list.getSelectedIndex()]);
					}
				}
		);
	}
	
}
