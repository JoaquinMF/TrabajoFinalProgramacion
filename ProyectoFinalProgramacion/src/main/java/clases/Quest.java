package clases;

public class Quest extends NamedEntity{

	
	private Item reward;
	private String description;
	
	
	public Quest(String name, Item reward, String description) {
		super(name);
		this.reward = reward;
		this.description = description;
	}


	public Item getReward() {
		return reward;
	}


	public void setReward(Item reward) {
		this.reward = reward;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	

}
