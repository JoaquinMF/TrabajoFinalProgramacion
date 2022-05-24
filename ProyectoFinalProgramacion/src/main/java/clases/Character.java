package clases;

import java.time.LocalDate;
import java.util.ArrayList;

import enums.GearList;

public class Character extends NamedEntity{
	
	private Class clase;
	private ArrayList<GearList> gearSlot;
	private ArrayList<Skill> passives;
	private short hp;
	private short sp;
	private short strength;
	private short stamina;
	private short speed;
	
	public Character(String name, Class clase, ArrayList<GearList> gearSlot, ArrayList<Skill> passives, short hp,
			short sp, short strength, short stamina, short speed) {
		super(name);
		this.clase = clase;
		this.gearSlot = gearSlot;
		this.passives = passives;
		this.hp = hp;
		this.sp = sp;
		this.strength = strength;
		this.stamina = stamina;
		this.speed = speed;
	}

	public Class getClase() {
		return clase;
	}

	public void setClase(Class clase) {
		this.clase = clase;
	}

	public ArrayList<GearList> getGearSlot() {
		return gearSlot;
	}

	public void setGearSlot(ArrayList<GearList> gearSlot) {
		this.gearSlot = gearSlot;
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

	public short getSp() {
		return sp;
	}

	public void setSp(short sp) {
		this.sp = sp;
	}

	public short getStrength() {
		return strength;
	}

	public void setStrength(short strength) {
		this.strength = strength;
	}

	public short getStamina() {
		return stamina;
	}

	public void setStamina(short stamina) {
		this.stamina = stamina;
	}

	public short getSpeed() {
		return speed;
	}

	public void setSpeed(short speed) {
		this.speed = speed;
	}
	
	
	
	
}

