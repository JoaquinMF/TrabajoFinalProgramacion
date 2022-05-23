package clases;

import java.util.ArrayList;
import java.util.HashMap;

import pantallas.WorldWindow;

public class World extends NamedEntity {
	
	private ArrayList<Quest> mainQuest;
	//private collections sideQuest;
	private WorldWindow worldMap;
	private HashMap<String, WorldWindow> region;
	
	public World(String name, ArrayList<Quest> mainQuest, WorldWindow worldMap, HashMap<String, WorldWindow> region) {
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

	public WorldWindow getWorldMap() {
		return worldMap;
	}

	public void setWorldMap(WorldWindow worldMap) {
		this.worldMap = worldMap;
	}

	public HashMap<String, WorldWindow> getRegion() {
		return region;
	}

	public void setRegion(HashMap<String, WorldWindow> region) {
		this.region = region;
	}
	
	
	
}
