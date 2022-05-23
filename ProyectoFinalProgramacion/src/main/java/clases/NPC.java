package clases;

import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.plaf.synth.Region;

public class NPC extends NamedEntity {
	
	private Region location;
	private boolean enemy;
	private ArrayList<Quest> give;
	private boolean boss;
	private ArrayList<Gear> loot;
	private short hp;
	private short damage;
	private short speed;
	
	public NPC(String name, Region location, boolean enemy, ArrayList<Quest> give, boolean boss, ArrayList<Gear> loot, short hp,
			short damage, short speed) {
		super(name);
		this.location = location;
		this.enemy = enemy;
		this.give = give;
		this.boss = boss;
		this.loot = loot;
		this.hp = hp;
		this.damage = damage;
		this.speed = speed;
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

	public ArrayList<Quest> getGive() {
		return give;
	}

	public void setGive(ArrayList<Quest> give) {
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

	public short getDamage() {
		return damage;
	}

	public void setDamage(short damage) {
		this.damage = damage;
	}

	public short getSpeed() {
		return speed;
	}

	public void setSpeed(short speed) {
		this.speed = speed;
	}
	
	
	
	

}
