package clases;

import java.time.LocalDate;
import java.util.ArrayList;

import enums.GearList;

public class Character extends NamedEntity{
	
	private Class clase;
	private ArrayList<GearList> gearSlots;
	private ArrayList<Skill> passives;
	private short hp;
	private short damage;
	private short strength;
	private short speed;
	
	public Character(String name, Class clase, ArrayList<GearList> gearSlots, ArrayList<Skill> passives, short hp,
			short damage, short strength, short speed) {
		super(name);
		this.clase = clase;
		this.gearSlots = gearSlots;
		this.passives = passives;
		this.hp = hp;
		this.damage = damage;
		this.strength = strength;
		this.speed = speed;
	}

	public Class getClase() {
		return clase;
	}

	public void setClase(Class clase) {
		this.clase = clase;
	}

	public ArrayList<GearList> getGearSlots() {
		return gearSlots;
	}

	public void setGearSlots(ArrayList<GearList> gearSlots) {
		this.gearSlots = gearSlots;
	}

	public ArrayList<Skill> getPassives() {
		return passives;
	}

	public void setPassives(ArrayList<Skill> passives) {
		this.passives = passives;
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

	public short getStrength() {
		return strength;
	}

	public void setStrength(short strength) {
		this.strength = strength;
	}

	public short getSpeed() {
		return speed;
	}

	public void setSpeed(short speed) {
		this.speed = speed;
	}
	
	
	
	
}

