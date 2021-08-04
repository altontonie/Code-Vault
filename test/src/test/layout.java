package test;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class layout extends JFrame{
	private JButton rb;
	private JButton lb;
	private JButton cb;
	private Container container;
	private FlowLayout layout;
	
	public layout() {
		super("Title");
		layout = new FlowLayout();
		container = getContentPane();
		setLayout(layout);
		
		lb = new JButton("left");
		lb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				layout.setAlignment(FlowLayout.LEFT);
				layout.layoutContainer(container);
			}
		});
		add(lb);
		
		cb = new JButton("center");
		cb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				layout.setAlignment(FlowLayout.CENTER);
				layout.layoutContainer(container);
			}
		});
		add(cb);
		
		rb = new JButton("right");
		rb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				layout.setAlignment(FlowLayout.RIGHT);
				layout.layoutContainer(container);
			}
		});
		add(rb);
	}
	
}
