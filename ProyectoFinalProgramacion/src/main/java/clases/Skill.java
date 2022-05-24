package clases;

import java.util.ArrayList;

public class Skill {
	
	private String whatDoes;
	private short passiveHp;
	private short passiveStrength;
	private short passiveSpeed;
	
	public Skill(String whatDoes, short passiveHp, short passiveStrength, short passiveSpeed) {
		super();
		this.whatDoes = whatDoes;
		this.passiveHp = passiveHp;
		this.passiveStrength = passiveStrength;
		this.passiveSpeed = passiveSpeed;
	}

	public String getWhatDoes() {
		return whatDoes;
	}

	public void setWhatDoes(String whatDoes) {
		this.whatDoes = whatDoes;
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
	
	
	

}
