package test;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class Events extends JFrame {
	
	private JTextField text1;
	private JTextField text2;
	private JTextField text3;
	private JPasswordField pwd;
	private JLabel txt1;
	
	public Events() {
		
		super("i am title");
		setLayout(new FlowLayout());
		
		txt1 = new JLabel("Enter your name:");
		text1 = new JTextField(10);
		add(txt1);
		add(text1);
		
		text2 = new JTextField("i am textfield");
		add(text2);
		
		text3 = new JTextField("uneditable",20);
		text3.setEditable(false);
		add(text3);
		
		pwd = new JPasswordField("my password");
		add(pwd);
		
		theHandler handler = new theHandler();
		text1.addActionListener(handler);
		text2.addActionListener(handler);
		text3.addActionListener(handler);
		pwd.addActionListener(handler);
		
	}
	
	private class theHandler implements ActionListener { 

		public void actionPerformed(ActionEvent event) {
			// TODO Auto-generated method stub
			String string = "";
			
			if(event.getSource()==text1)
				string = String.format("field 1 is %s", event.getActionCommand());
			else if(event.getSource()==text2)
				string = String.format("field 2 is %s", event.getActionCommand());
			else if(event.getSource()==text3)
				string = String.format("field 3 is %s", event.getActionCommand());
			else if(event.getSource()==pwd)
				string = String.format("passwaord is %s", event.getActionCommand());
			
			JOptionPane.showMessageDialog(null, string);
		}
	}

	
	
	
}
