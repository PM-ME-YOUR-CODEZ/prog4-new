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

public class GameView extends JPanel implements Observer  {
	JLabel score;
	JLabel scoreNum;
	JLabel level;	
	JLabel levelNum;
	Color labelBackgroundColor;
	
	public GameView() {
		labelBackgroundColor = new Color(30,40,58);
		score = new JLabel("score");//veranderen;
		scoreNum = new JLabel("0");
		scoreNum.setFont(new Font("Serif", Font.BOLD,40));
		level = new JLabel("level");
		levelNum = new JLabel("0");
		levelNum.setFont(new Font("Serif", Font.BOLD,40));
		score.setForeground(Color.YELLOW);
		scoreNum.setForeground(Color.YELLOW);
		level.setForeground(Color.YELLOW);
		levelNum.setForeground(Color.YELLOW);
		score.setAlignmentX(CENTER_ALIGNMENT);
		scoreNum.setAlignmentX(CENTER_ALIGNMENT);
		level.setAlignmentX(CENTER_ALIGNMENT);
		levelNum.setAlignmentX(CENTER_ALIGNMENT);
		
		this.setPreferredSize(new Dimension(100,200));
		this.setLayout(new BoxLayout(this,BoxLayout.PAGE_AXIS));
		this.setBackground(Color.BLACK);
//		this.add(Box.createRigidArea(new Dimension(100,200)));
		
		
		score.setAlignmentX(CENTER_ALIGNMENT);
		
		this.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		this.add(Box.createRigidArea(new Dimension(0,10)));
		this.add(score);
		this.add(Box.createRigidArea(new Dimension(0,10)));
		this.add(scoreNum);
		this.add(Box.createRigidArea(new Dimension(0,40)));
		this.add(level);
		this.add(Box.createRigidArea(new Dimension(0,10)));
		this.add(levelNum);
		this.add(Box.createRigidArea(new Dimension(0,10)));
		this.add(Box.createHorizontalGlue());
		
	}
	
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(labelBackgroundColor);
		g.fillRect(score.getX()-10, score.getY()-2, score.getWidth()+20, score.getHeight()+3);
		g.fillRect(scoreNum.getX()-30, scoreNum.getY()+5, scoreNum.getWidth()+60, scoreNum.getHeight()-5);
		g.fillRect(level.getX()-10, level.getY()-2, level.getWidth()+20, level.getHeight()+3);
		g.fillRect(levelNum.getX()-30, levelNum.getY()+5, levelNum.getWidth()+60, levelNum.getHeight()-5);

	}
	@Override
	public void update(Observable arg0, Object arg1) { // observt timeController
		// TODO Auto-generated method stub
		
	}

}
