package event;

import java.util.Random;

import clases.GameManager;
import clases.Monster;
import clases.Seta;

public class Event01 {

	GameManager gm;

	Monster monster;
	Seta seta = new Seta();

	public Event01(GameManager gm) {

		this.gm = gm;

	}


	public void lookChest() {
		gm.ui.messages.setText("A sparkling chest, probably with shiny loot. What will you do?");

	}

	public void openChest() {

		if (gm.player.hasWeapon == 0) {
			gm.ui.messages.setText("You plunder the ol' sweet loot.\n(You take the shiny dagger inside... )");
			gm.player.hasWeapon = 1;
			gm.player.updatePlayerStatus();
			gm.playSE(gm.healSound);
		} else {
			gm.ui.messages.setText("You already looted the chest... ");
		}

	}

	public void talkChest() {
		gm.ui.messages.setText("You approach the chest. Then you recite to the RNG Goddess...");

	}

	public void lookSeta() {
		if (gm.player.defeatSeta == false) {
			gm.ui.messages.setText("You look at the mutant mushroom, you can't help but scream who let that abomination in.");
		} else {
			gm.ui.messages.setText("It's already dead");

		}

	}

	public void attackSeta() {
		
		seta.monsterLife = seta.monsterLife;
		monster = seta;
		
		short playerDamage = (short) (gm.player.weaponPower - monster.monsterDefense);
		short monsterDamage = (short) (monster.monsterAttack - gm.player.defensePower);

		if(seta.monsterLife>0) {
			if(gm.player.hasDefense==0) {
				if(gm.player.hasWeapon==0) {
					if(gm.player.playerCurrentLife!=1) {
						gm.ui.messages.setText("You don't have any weapon, the mushroom attacks you, your life decreases by 1.");
						gm.player.playerCurrentLife--;
						gm.playSE(gm.hittedSound);
						gm.player.updatePlayerStatus();
							
						
					}else if(gm.player.playerCurrentLife==1) {
						
						gm.ui.messages.setText("You don't have any weapon, the mushroom attacks you, you die.");
						gm.player.playerCurrentLife--;
						gm.player.hasWeapon=0;
						gm.player.hasDefense=0;
						gm.player.hasItem=0;
						gm.player.updatePlayerStatus();
						gm.rChanger.showGameOverScreen(1);
						
					}
					
				}else if(gm.player.hasWeapon==1) {
					if(gm.player.playerCurrentLife!=1) {
						seta.monsterLife-=playerDamage;
						gm.player.playerCurrentLife-=monsterDamage;
						gm.ui.messages.setText("You attack and deal "+playerDamage+" damage! "+" and you recieve "+monsterDamage+" damage! ");
						gm.player.updatePlayerStatus();
						gm.playSE(gm.hitSound);
					
					}else if(gm.player.playerCurrentLife==1){
						seta.monsterLife-=playerDamage;
						gm.player.hasWeapon=0;
						gm.player.hasDefense=0;
						gm.player.hasItem=0;
						gm.player.playerCurrentLife=0;
						gm.player.updatePlayerStatus();
						gm.rChanger.showGameOverScreen(1);
					}
					
				}	
				
			}
			
			
		}else if(seta.monsterLife<=0){
			
			gm.ui.messages.setText("You defeated the monster!");
			gm.player.hasDefense=1;
			gm.player.updatePlayerStatus();
			gm.player.defeatSeta=true;
		}

	}

	public void talkSeta() {

		if (gm.player.defeatSeta == false) {
			gm.ui.messages.setText("You shout at the mushroom... you hear a growl in return. Maybe it's offended?");
			gm.playSE(gm.setaSound);

		} else {
			gm.ui.messages.setText("Why talk to a dead monster?");

		}

	}

	public void lookCliff() {
		gm.ui.messages.setText("You look at the cliff in front of You, maybe You need something to climb it?");

	}

	public void talkCliff() {
		gm.ui.messages.setText("You hear the wind pass by...");

	}

	public void climbCliff() {

		if(gm.player.hasItem==0) {
			gm.ui.messages.setText("You can't climb the cliff right now...");
		}else if(gm.player.defeatSeta==false) {
			gm.ui.messages.setText("Kill the mushroom to keep going...");
			
		}else {
			
			gm.rChanger.showRegion3();
		}
		
  }
	
	
	
}
		