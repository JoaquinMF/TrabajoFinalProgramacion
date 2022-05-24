package clases;

import java.util.ArrayList;

public class Quest extends NamedEntity{

	private String description;
	private Item reward;
	
	public Quest(String name, String description, Item reward) {
		super(name);
		this.description = description;
		this.reward = reward;
	}
	

	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}
	

	public Item getReward() {
		return reward;
	}


	public void setReward(Item reward) {
		this.reward = reward;
	}

	ArrayList<Quest> quests = new ArrayList<Quest>();
	
	Quest mainQuest1=new Quest("Jumpstart","If is not an adventure...",null);
	Quest mainQuest2=new Quest("Shock Value","Salutations, adventure...",null);
	Quest mainQuest3=new Quest("The End","This is very important adventure...",null);
	Quest sideQuest1=new Quest("Goblin","Please adventure...",null);
	Quest sideQuest2=new Quest("Orc","By all loot in the Wonderlands...",null);
	Quest sideQuest3=new Quest("Troll","Oh my god adventure...",null);
	
	

}
