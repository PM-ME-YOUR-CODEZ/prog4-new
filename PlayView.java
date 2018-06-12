package view_layer;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

public class PlayView extends JPanel implements Observer {

	TagManPainterPlain tagManPainterPlain = new TagManPainterPlain();
	Color backgroundColor;

	public PlayView() {
		backgroundColor = new Color(0, 2, 50);
		this.setBackground(backgroundColor);
	}

	
	// TO DO
	// wall class voor walls gebruiken (met POINTS is maybe makkelijker)
	//tag man custom colours
	// keylistener
	// walls laten moven
	// notification 
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		// this is a test
		g.setColor(Color.white);
		g.fillRect(0, 0, 50, this.getHeight() / 2 - 50 ); // upper left wall
		g.fillRect(0, this.getHeight() / 2 + 50, 50, this.getHeight() / 2 - 50); //down left wall
		g.fillRect(this.getWidth() - 50, 0, 50, this.getHeight() / 2 - 50);// upper right wall
		g.fillRect(this.getWidth() - 50, this.getHeight() / 2 + 50, 50, this.getHeight() / 2 - 50); // down right wall
		
		g.setColor(Color.DARK_GRAY);
		g.fillRect(5, 5, 40, this.getHeight() / 2 - 50 - 10); // upper left wall
		g.fillRect(5, this.getHeight() / 2 + 55, 40, this.getHeight() / 2 - 50-10 ); //down left wall
		g.fillRect(this.getWidth() - 45, 5, 40, this.getHeight() / 2 - 60);// upper right wall
		g.fillRect(this.getWidth() - 45, this.getHeight() / 2 + 55, 40, this.getHeight() / 2 - 50-10); // down right wall
		
		tagManPainterPlain.paint(g, 0, this.getHeight()/2-50+25, 50, 50);
		makeWallsLvlOne(g,this.getWidth()-75-75);
		
		
	
	}
	
	public void makeWallsLvlOne(Graphics g,int panelWidth) {
		for(int i = 1; i< 11; i++) {
			g.fillRect(panelWidth/10*i, 0, 15, 75);
		}
	}
	
	@Override
	public void update(Observable o, Object arg) { // observes Observer
		// TODO Auto-generated method stub

	}

}
