package view_layer;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.LayoutManager;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class ContentPane  extends JPanel{
	private InfoPanel infoPanel;
	TimeView timeView;
	GameView gameView;
	PlayView playView;
	
	public ContentPane() {
		
		this.setLayout(new BorderLayout());
		infoPanel = new InfoPanel();
		timeView = new TimeView();
		gameView = new GameView();
		playView = new PlayView();
		infoPanel.setLayout(new BoxLayout(infoPanel, BoxLayout.Y_AXIS));
		infoPanel.add(gameView);
		infoPanel.add(timeView);
		this.add(infoPanel, BorderLayout.WEST);
		this.add(playView, BorderLayout.CENTER );
		
		
		
	
		
//		this.add(gameView);
//		this.add(playView);
	}
}
