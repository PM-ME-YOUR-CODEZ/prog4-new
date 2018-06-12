package control_layer;

import java.util.Observable;

public class TimeController extends Observable {
	
	
	MainController mainController;
	
	public TimeController(MainController mainControl) {
		mainController = mainControl;
	}
	
	
}
