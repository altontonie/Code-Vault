package test;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Radio extends JFrame{
	
	private JTextField tf;
	private Font pf;
	private Font itf;
	private Font bf;
	private Font bif;
	private JRadioButton pb;
	private JRadioButton bb;
	private JRadioButton ib;
	private JRadioButton bib;
	private ButtonGroup group;
	
	public Radio() {
		super("Title");
		setLayout(new FlowLayout());
		
		tf= new JTextField("I am text",20);
		add(tf);
		
		pb = new JRadioButton("plain",true);
		bb = new JRadioButton("bold",false);
		ib = new JRadioButton("italic",false);
		bib = new JRadioButton("bold&italic",false);
		add(pb);
		add(bb);
		add(ib);
		add(bib);
		
		group = new ButtonGroup();
		group.add(pb);
		group.add(bb);
		group.add(ib);
		group.add(bib);
		
		pf = new Font("Serif",Font.PLAIN,14);
		bf = new Font("Serif",Font.BOLD,14);
		itf = new Font("Serif",Font.ITALIC,14);
		bif = new Font("Serif",Font.BOLD + Font.ITALIC,14);
		
		tf.setFont(pf);
		
		pb.addItemListener(new Handler(pf));
		bb.addItemListener(new Handler(bf));
		ib.addItemListener(new Handler(itf));
		bib.addItemListener(new Handler(bif));
		
	}
	
	private class Handler implements ItemListener{

		private Font font;
		
		public Handler(Font f) {
			font = f;
		}
		
		public void itemStateChanged(ItemEvent e) {
			// TODO Auto-generated method stub
			tf.setFont(font);
			
		}
		
	}
	
}
















