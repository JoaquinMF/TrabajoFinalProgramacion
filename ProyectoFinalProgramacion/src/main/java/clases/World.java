package clases;

import java.util.ArrayList;
import java.util.HashMap;

public class World extends NamedEntity {
	
	private ArrayList<Quest> mainQuest;
	//private collections sideQuest;
	private GameWindow worldMap;
	private HashMap<String, GameWindow> region;
	
	public World(String name, ArrayList<Quest> mainQuest, GameWindow worldMap, HashMap<String, GameWindow> region) {
		super(name);
		this.mainQuest = mainQuest;
		this.worldMap = worldMap;
		this.region = region;
	}

	public ArrayList<Quest> getMainQuest() {
		return mainQuest;
	}

	public void setMainQuest(ArrayList<Quest> mainQuest) {
		this.mainQuest = mainQuest;
	}

	public GameWindow getWorldMap() {
		return worldMap;
	}

	public void setWorldMap(GameWindow worldMap) {
		this.worldMap = worldMap;
	}

	public HashMap<String, GameWindow> getRegion() {
		return region;
	}

	public void setRegion(HashMap<String, GameWindow> region) {
		this.region = region;
	}
	
	
	
}
