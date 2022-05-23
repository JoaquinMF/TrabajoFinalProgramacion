package clases;

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


	
	
	
	

}
