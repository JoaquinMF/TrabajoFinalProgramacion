package clases;

import enums.GearList;
import java.awt.image.BufferedImage;

public class Gear extends ItemWithStat {
	
	private GearList itemSlot;
	private BufferedImage image;
	
	public Gear(String name, String info, Boolean isQuest, short stats, GearList itemSlot, BufferedImage image) {
		super(name, info, isQuest, stats);
		this.itemSlot = itemSlot;
		this.image = image;
	}

	public GearList getItemSlot() {
		return itemSlot;
	}

	public void setItemSlot(GearList itemSlot) {
		this.itemSlot = itemSlot;
	}

	public BufferedImage getImage() {
		return image;
	}

	public void setImage(BufferedImage image) {
		this.image = image;
	}
	
	

}
