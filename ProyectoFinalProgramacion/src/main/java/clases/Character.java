package clases;

import java.time.LocalDate;
import java.util.ArrayList;

public class Character extends NamedEntity{
	
	private LocalDate save;
	private Class clase;
	private ArrayList<Skill> passives;
	private ArrayList<Item> inventory;
	private short hp;
	private short sp;
	private short strength;
	private short stamina;
	private short speed;
	
	public Character(String name, LocalDate save, Class clase, ArrayList<Skill> passives, ArrayList<Item> inventory,
			short hp, short sp, short strength, short stamina, short speed) {
		super(name);
		this.save = save;
		this.clase = clase;
		this.passives = passives;
		this.inventory = inventory;
		this.hp = hp;
		this.sp = sp;
		this.strength = strength;
		this.stamina = stamina;
		this.speed = speed;
	}

	public LocalDate getSave() {
		return save;
	}

	public void setSave(LocalDate save) {
		this.save = save;
	}

	public Class getClase() {
		return clase;
	}

	public void setClase(Class clase) {
		this.clase = clase;
	}

	public ArrayList<Skill> getPassives() {
		return passives;
	}

	public void setPassives(ArrayList<Skill> passives) {
		this.passives = passives;
	}

	public ArrayList<Item> getInventory() {
		return inventory;
	}

	public void setInventory(ArrayList<Item> inventory) {
		this.inventory = inventory;
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

