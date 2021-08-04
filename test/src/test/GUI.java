package test;

import javax.swing.JOptionPane;

public class GUI {
	public static void main(String[] args) {
		String fn = JOptionPane.showInputDialog("Enter 1st number");
		String sn = JOptionPane.showInputDialog("Enter 2nd number");
		
		int num1 = Integer.parseInt(fn);
		int num2 = Integer.parseInt(sn);
		int sum = num1 + num2;
		
		JOptionPane.showMessageDialog(null, "the answer is "+sum,"title",JOptionPane.OK_OPTION);
		
	}
}
