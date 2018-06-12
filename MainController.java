package control_layer;

import model_layer.Game;
import view_layer.MainFrame;

public class MainController {
	
	TimeController timeController = new TimeController(this);
	MainFrame mainFrame = new MainFrame();
	Game game = new Game();
	
}
