package model_layer;

import java.util.Observable;

public class Game extends Observable {
	 TagMan tagMan = new TagMan();
	 Wall wall = new Wall();// meerdere keren aanmaken
	 Dash dash = new Dash(); // 10 keer aanmaken
}
