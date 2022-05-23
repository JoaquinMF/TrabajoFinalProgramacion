package clases;

public class Skill {
	
	private String whatDoes;
	private short passiveHp;
	private short passiveSp;
	private short passiveStrength;
	private short passiveStamina;
	private short passiveSpeed;
	
	public Skill(String whatDoes, short passiveHp, short passiveSp, short passiveStrength, short passiveStamina,
			short passiveSpeed) {
		super();
		this.whatDoes = whatDoes;
		this.passiveHp = passiveHp;
		this.passiveSp = passiveSp;
		this.passiveStrength = passiveStrength;
		this.passiveStamina = passiveStamina;
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

	public short getPassiveSp() {
		return passiveSp;
	}

	public void setPassiveSp(short passiveSp) {
		this.passiveSp = passiveSp;
	}

	public short getPassiveStrength() {
		return passiveStrength;
	}

	public void setPassiveStrength(short passiveStrength) {
		this.passiveStrength = passiveStrength;
	}

	public short getPassiveStamina() {
		return passiveStamina;
	}

	public void setPassiveStamina(short passiveStamina) {
		this.passiveStamina = passiveStamina;
	}

	public short getPassiveSpeed() {
		return passiveSpeed;
	}

	public void setPassiveSpeed(short passiveSpeed) {
		this.passiveSpeed = passiveSpeed;
	}
	
	

}
