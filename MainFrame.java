package view_layer;

import java.awt.Dimension;

import javax.swing.JFrame;

public class MainFrame  extends JFrame{
	
	ContentPane contentPane;
	
	
	public MainFrame() {
		contentPane = new ContentPane();
		this.setTitle("TagMan by Randy");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setPreferredSize(new Dimension(1300,800));
		
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		
		this.add(contentPane);
	}
}
