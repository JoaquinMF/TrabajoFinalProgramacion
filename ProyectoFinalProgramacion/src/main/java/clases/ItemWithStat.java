package clases;

import java.awt.image.BufferedImage;

import enums.GearList;

public class ItemWithStat extends Item {
	
	private GearList itemSlot;
	private short stats;
	private BufferedImage icon;
	
	public ItemWithStat(String name, String info, Boolean isQuest, GearList itemSlot, short stats, BufferedImage icon) {
		super(name, info, isQuest);
		this.itemSlot = itemSlot;
		this.stats = stats;
		this.icon = icon;
	}

	public GearList getItemSlot() {
		return itemSlot;
	}

	public void setItemSlot(GearList itemSlot) {
		this.itemSlot = itemSlot;
	}

	public short getStats() {
		return stats;
	}

	public void setStats(short stats) {
		this.stats = stats;
	}

	public BufferedImage getIcon() {
		return icon;
	}

	public void setIcon(BufferedImage icon) {
		this.icon = icon;
	}


	

}
