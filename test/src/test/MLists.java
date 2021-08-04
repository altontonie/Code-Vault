package test;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class MLists extends JFrame {
	
	private JList leftList;
	private JList rightList;
	private JButton moveButton;
	private static String[] foods = {"beef","pork","chicken","ham","bacon"};
	
	public MLists() {
		super("Title");
		setLayout(new FlowLayout());
		
		leftList = new JList(foods);
		leftList.setVisibleRowCount(3);
		leftList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		add(new JScrollPane(leftList));
		
		moveButton = new JButton("Move -->");
		moveButton.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						rightList.setListData(leftList.getSelectedValues());
					}
					
				}
		);
		add(moveButton);
		
		rightList = new JList();
		rightList.setVisibleRowCount(3);
		rightList.setFixedCellWidth(110);
		rightList.setFixedCellHeight(17);
		add(new JScrollPane(rightList));
			
		
	}
}
