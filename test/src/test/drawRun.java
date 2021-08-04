package test;
import javax.swing.*;

public class drawRun extends JFrame{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame x = new JFrame();
		x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		x.setSize(200,200);
		draw d = new draw();
		x.add(d);
		x.setVisible(true);
	}

}
