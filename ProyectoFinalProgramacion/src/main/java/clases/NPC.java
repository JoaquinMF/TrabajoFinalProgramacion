package clases;

import java.util.ArrayList;

import javax.swing.plaf.synth.Region;

public class NPC extends NamedEntity {
	
	private Region location;
	private boolean enemy;
	private Quest give;
	private boolean boss;
	private ArrayList<Gear> loot;
	private short hp;
	private short sp;
	private short strength;
	private short stamina;
	
	public NPC(String name, Region location, boolean enemy, Quest give, boolean boss, ArrayList<Gear> loot, short hp,
			short mp) {
		super(name);
		this.location = location;
		this.enemy = enemy;
		this.give = give;
		this.boss = boss;
		this.loot = loot;
		this.hp = hp;
		this.mp = mp;
	}

	public Region getLocation() {
		return location;
	}

	public void setLocation(Region location) {
		this.location = location;
	}

	public boolean isEnemy() {
		return enemy;
	}

	public void setEnemy(boolean enemy) {
		this.enemy = enemy;
	}

	public Quest getGive() {
		return give;
	}

	public void setGive(Quest give) {
		this.give = give;
	}

	public boolean isBoss() {
		return boss;
	}

	public void setBoss(boolean boss) {
		this.boss = boss;
	}

	public ArrayList<Gear> getLoot() {
		return loot;
	}

	public void setLoot(ArrayList<Gear> loot) {
		this.loot = loot;
	}

	public short getHp() {
		return hp;
	}

	public void setHp(short hp) {
		this.hp = hp;
	}

	public short getMp() {
		return mp;
	}

	public void setMp(short mp) {
		this.mp = mp;
	}
	
	

}
