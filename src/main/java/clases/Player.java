package clases;

public class Player extends EntityStatsAndItems {
	
	GameManager gm;
	
	
	
	
	
	public Player(GameManager gm) {
		
		this.gm=gm;
		
	}
	
	public void setPlayerDefaultStatus() {
		
		playerMaxLife = 5;
		playerCurrentLife = 3;
		playerStrength = 5;
		playerEndurance = 0;
		
		hasWeapon=0;
		hasDefense=0;
		hasItem=0;
		weaponPower=1;
		defensePower=1;
		
		defeatSeta = false;
		defeatSkeleton1 = false;
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