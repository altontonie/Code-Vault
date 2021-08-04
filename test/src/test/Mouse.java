package test;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Mouse extends JFrame {

	private JPanel mousePanel;
	private JLabel statusBar;
	
	public Mouse() {
		super("Title");
		
		mousePanel = new JPanel();
		mousePanel.setBackground(Color.WHITE);
		add(mousePanel, BorderLayout.CENTER);
		
		statusBar = new JLabel("Default");
		add(statusBar, BorderLayout.SOUTH);
		
		Handler theHandler = new Handler();
		mousePanel.addMouseListener(theHandler);
		mousePanel.addMouseMotionListener(theHandler);
		
	}
	
	private class Handler implements MouseListener, MouseMotionListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			statusBar.setText(String.format("Clicked at %d, %d", e.getX(),e.getY()));
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			statusBar.setText("You pressed down");
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			statusBar.setText("Mouse released");
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			statusBar.setText("mouse entered");
			mousePanel.setBackground(Color.BLUE);
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			statusBar.setText("mouse exited");
			mousePanel.setBackground(Color.WHITE);
		}

		@Override
		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub
			statusBar.setText("mouse being dragged");
			mousePanel.setBackground(Color.GREEN);
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub
			statusBar.setText("mouse is moving");
		}
		
	}
	

}
