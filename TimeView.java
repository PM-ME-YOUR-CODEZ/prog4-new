package view_layer;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class TimeView extends JPanel implements Observer {
	JLabel secondsLeft;
	JLabel seconds;
	Color labelBackgroundColor;
	public TimeView() {
		this.setPreferredSize(new Dimension(100, 600));
		this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		secondsLeft = new JLabel("30");
		secondsLeft.setFont(new Font("Serif", Font.BOLD, 40));
		seconds = new JLabel("seconds");
		seconds.setForeground(Color.yellow);

		this.setBackground(Color.BLACK);
		secondsLeft.setForeground(Color.yellow);
		secondsLeft.setAlignmentX(CENTER_ALIGNMENT);
		seconds.setAlignmentX(CENTER_ALIGNMENT);
	

	
		this.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		this.add(Box.createHorizontalGlue());
		this.add(Box.createRigidArea(new Dimension(0,20)));
		
		this.add(secondsLeft);
		labelBackgroundColor = new Color(30,40,58);
		
		
	
		this.add(Box.createRigidArea(new Dimension(0,450)));
		this.add(seconds);
		this.add(Box.createHorizontalGlue());
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Color tickerColor = new Color(0,200,245);
		g.setColor(tickerColor);
		System.out.println(this.getSize().getWidth());
		g.fillRect((int) (this.getSize().getWidth()/10*2.5), (int)this.getSize().getHeight()/10*2, (int)this.getSize().getWidth()/4*2, (int)this.getSize().getHeight()/10*7);
		g.setColor(Color.WHITE);
		g.drawRect((int) (this.getSize().getWidth()/10*2.5), (int)this.getSize().getHeight()/10*2, (int)this.getSize().getWidth()/4*2, (int)this.getSize().getHeight()/10*7);
		g.setColor(labelBackgroundColor);
		
		g.fillRect(seconds.getX()-10, seconds.getY()-2, seconds.getWidth()+20, seconds.getHeight()+3);
		g.fillRect(secondsLeft.getX()-20, secondsLeft.getY()+5, secondsLeft.getWidth()+40, secondsLeft.getHeight()-5);
		System.out.println(this.getWidth()+"WIDTH TIME");
	}

	@Override
	public void update(Observable arg0, Object arg1) { // observt timeController
		// TODO Auto-generated method stub

	}

}
