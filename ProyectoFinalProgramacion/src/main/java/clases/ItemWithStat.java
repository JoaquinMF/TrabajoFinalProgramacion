package clases;

import java.awt.image.BufferedImage;

import enums.GearList;

public class ItemWithStat extends Item {
	
	private GearList itemSlot;
	private short passiveHp;
	private short passiveStrength;
	private short passiveSpeed;
	private BufferedImage icon;
	
	public ItemWithStat(String name, String info, Boolean isQuest, GearList itemSlot, short passiveHp,short passiveStrength, short passiveSpeed, BufferedImage icon) {
		super(name, info, isQuest);
		this.itemSlot = itemSlot;
		this.passiveHp = passiveHp;
		this.passiveStrength = passiveStrength;
		this.passiveSpeed = passiveSpeed;
		this.icon = icon;
	}

	public GearList getItemSlot() {
		return itemSlot;
	}

	public void setItemSlot(GearList itemSlot) {
		this.itemSlot = itemSlot;
	}

	public short getPassiveHp() {
		return passiveHp;
	}

	public void setPassiveHp(short passiveHp) {
		this.passiveHp = passiveHp;
	}

	public short getPassiveStrength() {
		return passiveStrength;
	}

	public void setPassiveStrength(short passiveStrength) {
		this.passiveStrength = passiveStrength;
	}

	public short getPassiveSpeed() {
		return passiveSpeed;
	}

	public void setPassiveSpeed(short passiveSpeed) {
		this.passiveSpeed = passiveSpeed;
	}

	public BufferedImage getIcon() {
		return icon;
	}

	public void setIcon(BufferedImage icon) {
		this.icon = icon;
	}
	
	
	

}
