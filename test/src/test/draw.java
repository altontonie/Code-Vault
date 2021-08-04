package test;
import java.awt.*;
import javax.swing.*;

public class draw extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.setBackground(Color.WHITE);
		
		g.setColor(Color.BLUE);
		g.fillRect(30, 30, 100, 30);
		
		g.setColor(new Color(200,10,150));
		g.fillRect(30, 80, 120, 20);
		
		g.setColor(Color.GREEN);
		g.drawString("Get me the fuck out of this room rn", 80, 105);
	}
}
