package event;



import clases.Boss;
import clases.GameManager;
import clases.Monster;


public class Event04 {
	
	public GameManager gm;
	Monster monster;
	Boss boss = new Boss();
	
	public Event04(GameManager gm) {
		this.gm = gm;
	}
	
	public void lookBoss() {
		if (gm.player.defeatBoss == false) {
			gm.ui.messages.setText("You look at the final boss, he sure is ugly.");

		} else {
			gm.ui.messages.setText("Already dead.");
		}

	}

	public void attackBoss() {

		boss.monsterLife = boss.monsterLife;
		monster = boss;
		
		short playerDamage = (short) (gm.player.weaponPower - monster.monsterDefense);
		short monsterDamage = (short) (monster.monsterAttack - gm.player.defensePower);

		if(boss.monsterLife>0) {
			if(gm.player.hasDefense==1) {
				if(gm.player.hasWeapon==0) {
					if(gm.player.playerCurrentLife!=1) {
						gm.ui.messages.setText("You don't have any weapon, the skeleton attacks you, your life decreases by 1.");
						gm.player.playerCurrentLife--;
						gm.playSE(gm.hittedSound);
						gm.player.updatePlayerStatus();
							
						
					}else if(gm.player.playerCurrentLife==1) {
						
						gm.ui.messages.setText("You don't have any weapon, the skeleton attacks you, you die.");
						gm.player.playerCurrentLife--;
						gm.rChanger.showGameOverScreen(4);
						gm.player.hasWeapon=0;
						gm.player.hasDefense=0;
						gm.player.hasItem=0;
						gm.player.updatePlayerStatus();
						
						
					}
					
				}else if(gm.player.hasWeapon==1) {
					if(gm.player.playerCurrentLife!=1) {
						boss.monsterLife-=playerDamage;
						gm.player.playerCurrentLife-=monsterDamage;
						gm.ui.messages.setText("You attack and deal "+playerDamage+" damage! "+" and you recieve "+monsterDamage+" damage! ");
						gm.player.updatePlayerStatus();
						gm.playSE(gm.hitSound);
					
					}else if(gm.player.playerCurrentLife==1){
						boss.monsterLife-=playerDamage;
						gm.player.hasWeapon=0;
						gm.player.hasDefense=0;
						gm.player.hasItem=0;
						gm.player.playerCurrentLife=0;
						gm.player.updatePlayerStatus();
						gm.rChanger.showGameOverScreen(4);
					}
					
				}
					
			}
			
		}else if(boss.monsterLife<=0){
			
			gm.rChanger.showRegion5();
			gm.player.hasWeapon=0;
			gm.player.hasDefense=0;
			gm.player.hasItem=0;
			gm.player.playerCurrentLife=0;
			gm.player.updatePlayerStatus();
			gm.player.defeatBoss=true;
			
		}
		
	}

	public void talkBoss() {

		if (gm.player.defeatBoss == false) {
			gm.playSE(gm.bossAudio);
			
		} else {
			gm.ui.messages.setText("Stop talking to dead things.");
		}

	}

}
