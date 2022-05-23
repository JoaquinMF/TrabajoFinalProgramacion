package clases;

public class ItemWithStat extends Item {
	
	private short stats;

	public ItemWithStat(String name, String info, Boolean isQuest, short stats) {
		super(name, info, isQuest);
		this.stats = stats;
	}

	public short getStats() {
		return stats;
	}

	public void setStats(short stats) {
		this.stats = stats;
	}
	
	

}
