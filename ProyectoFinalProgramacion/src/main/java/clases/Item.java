package clases;

public class Item extends NamedEntity {

	private String info;
	private Boolean isQuest;
	
	public Item(String name, String info, Boolean isQuest) {
		super(name);
		this.info = info;
		this.isQuest = isQuest;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public Boolean getQuest() {
		return isQuest;
	}

	public void setQuest(Boolean isQuest) {
		this.isQuest = isQuest;
	}
	
	
	
	
	
}
