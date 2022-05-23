package clases;

import enums.GearList;
import java.awt.image.BufferedImage;

public class Gear extends ItemWithStat {
	
	private GearList itemSlot;
	private BufferedImage icon;
	
	public Gear(String name, String info, Boolean isQuest, short stats, GearList itemSlot, BufferedImage icon) {
		super(name, info, isQuest, stats);
		this.itemSlot = itemSlot;
		this.icon = icon;
	}

	public GearList getItemSlot() {
		return itemSlot;
	}

	public void setItemSlot(GearList itemSlot) {
		this.itemSlot = itemSlot;
	}

	public BufferedImage getIcon() {
		return icon;
	}

	public void setImage(BufferedImage icon) {
		this.icon = icon;
	}
	
	

}
