package event;

import clases.GameManager;

public class Event01 {

	GameManager gm;

	public Event01(GameManager gm) {

		this.gm = gm;

	}

	public void lookChest() {
		gm.ui.messages.setText("A sparkling chest, probably with shiny loot. What will you do?");

		
	}

	public void openChest() {
		
		if(gm.player.hasWeapon==0) {
			gm.ui.messages.setText("You plunder the ol' sweet loot.\n(You take the shiny dagger inside... )");
			gm.player.hasWeapon=1;
			gm.player.updatePlayerStatus();
			gm.playSE(gm.healSound);
		}else {
			gm.ui.messages.setText("You already looted the chest... ");
		}
		
		
		
	}

	public void talkChest() {
		gm.ui.messages.setText("You approach the chest. Then you recite to the RNG Goddess...");
		
		
	}
	
	public void lookSeta() {
		if(gm.player.defeatSeta==false) {
			gm.ui.messages.setText("You look at the mutant mushroom, you can't help but scream who let that abomination in.");
		}else {
			gm.ui.messages.setText("It's already dead");
		
		}
		
	}
	
	
	public void attackSeta() {
		
		if(gm.player.hasDefense==0) {
			if(gm.player.hasWeapon==0) {
				if(gm.player.playerCurrentLife!=1) {
					gm.ui.messages.setText("You don't have any weapon, the mushroom attacks you, your life decreases by 1.");
					gm.player.playerCurrentLife--;
					gm.player.updatePlayerStatus();
				}else if(gm.player.playerCurrentLife==1) {
					gm.ui.messages.setText("You don't have any weapon, the mushroom attacks you, your die.");
					gm.player.playerCurrentLife--;
					gm.player.updatePlayerStatus();
					
				}
				
				
			}else if(gm.player.hasWeapon==1) {
				
				gm.ui.messages.setText("You attack the mushroom with your dagger, you have defeated it.");
				gm.player.hasDefense=1;
				gm.player.updatePlayerStatus();
				
			}
			
			
		}else {
			gm.ui.messages.setText("Is already dead.");
			
		}
		
		
	}
	
	public void talkSeta() {
		
		if(gm.player.defeatSeta==true) {
			gm.ui.messages.setText("You shout at the mushroom... you hear a growl in return. Maybe it's offended?");
			gm.playSE(gm.setaSound);
			
		}else {
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
			
			gm.ui.messages.setText("You can't climb the cliff right now.");
			
		}else {
			
			gm.rChanger.showRegion3();
		}
		
		
	}
	
	
	

}