package view_layer;
import java.awt.Color;
import java.awt.Graphics;

import model_layer.TagMan;

public class TagManPainterPlain {
	
	
	
	
	public void paint(Graphics g,int x, int y,int width, int height) {
	g.setColor(Color.red);
	g.fillOval(x, y, width, height);
	g.setColor(Color.ORANGE);
	g.fillOval(x+5,y+5, width-10, height-10);
	g.setColor(Color.yellow);
	g.fillOval(x+18,y+18, width-35, height-35);
	
	
	}
}
