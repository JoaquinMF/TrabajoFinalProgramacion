package clases;

public class Player {
	
	GameManager gm;
	
	public short playerMaxLife;
	public short playerCurrentLife;
	public int playerStrength = 3;
	public int playerEndurance = 1;
	public int playerAttack;
	public int playerDefense;
	
	public short hasWeapon;
	public short hasDefense;
	public short hasItem;
	public int weaponPower;
	public int defensePower;
	
	public boolean defeatSeta = false;
	public boolean defeatSkeleton1 = false;
	public boolean defeatSkeleton2 = false;
	public boolean defeatBoss = false;
	
	public Player(GameManager gm) {
		
		this.gm=gm;
		
	}
	
	public void setPlayerDefaultStatus() {
		
		playerMaxLife = 5;
		playerCurrentLife = 3;
		playerStrength = 3;
		playerEndurance = 1;
		
		hasWeapon=0;
		hasDefense=0;
		hasItem=0;
		weaponPower=0;
		defensePower=0;
		
		defeatSeta = false;
		defeatSkeleton1 = false;
		defeatSkeleton2 = false;
		defeatBoss = false;
		updatePlayerStatus();
		
	}
	
	public void updatePlayerStatus() {
		
		//REMOVE ALL LIFE ICON
		short i=1;
		while(i<6) {
			gm.ui.lifeLabel[i].setVisible(false);
			i++;
		}
		
		short lifeCount=playerCurrentLife;
		while(lifeCount!=0) {
			gm.ui.lifeLabel[lifeCount].setVisible(true);
			lifeCount--;
		}
		
		playerAttack = playerStrength + weaponPower;
		playerDefense = playerEndurance + defensePower;
		
		//CHECK PLAYER ITEMS
		
		if(hasWeapon==0) {
			gm.ui.weaponLabel.setVisible(false);
		}
		
		if(hasWeapon==1) {
			gm.ui.weaponLabel.setVisible(true);
		}
		
		if(hasDefense==0) {
			gm.ui.defenseLabel.setVisible(false);
		}
		
		if(hasDefense==1) {
			gm.ui.defenseLabel.setVisible(true);
		}
		
		if(hasItem==0) {
			gm.ui.itemLabel.setVisible(false);
		}
		
		if(hasItem==1) {
			gm.ui.itemLabel.setVisible(true);
		}
		
	}
	
	
	
}