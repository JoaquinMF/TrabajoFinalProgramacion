package event;

import clases.GameManager;

public class Event03 {
	
	public GameManager gm;
	
	public Event03(GameManager gm) {
		this.gm=gm;
	}
	
	public void lookSkeleton1() {
		gm.ui.messages.setText("You look at the mutant mushroom, you can't help but scream who let that abomination in.");

		
	}
	
	
	public void attackSkeleton1() {
		
		if(gm.player.hasDefense==0) {
			if(gm.player.hasWeapon==0) {
				if(gm.player.playerCurrentLife!=1) {
				gm.ui.messages.setText("You don't have any weapon, the mushroom attacks you, your life decreases by 1.");
				gm.playSE(gm.hittedSound);
				gm.player.playerCurrentLife--;
				gm.player.updatePlayerStatus();
				
				}else if(gm.player.playerCurrentLife==1) {
					gm.ui.messages.setText("You don't have any weapon, the mushroom attacks you, your die.");
					gm.player.playerCurrentLife--;
					gm.player.updatePlayerStatus();
					gm.rChanger.showGameOverScreen(1);
					
				}
			}else if(gm.player.hasWeapon==1) {
				gm.ui.messages.setText("You attack the mushroom with your dagger, you have defeated it.");
				gm.player.hasDefense=1;
				gm.playSE(gm.skeletonSound2);
				gm.player.updatePlayerStatus();
		}else {
			gm.ui.messages.setText("Is already dead.");
		}
	}
}
	
	public void talkSkeleton1() {
		gm.ui.messages.setText("You shout at the mushroom... you hear a growl in return. Maybe it's offended?");
		gm.playSE(gm.skeletonSound1);
		
	}
	
	public void lookSkeleton2() {
		gm.ui.messages.setText("You look at the mutant mushroom, you can't help but scream who let that abomination in.");

		
	}
	
	
	public void attackSkeleton2() {
		
		if(gm.player.hasDefense==0) {
			if(gm.player.hasWeapon==0) {
				if(gm.player.playerCurrentLife!=1) {
				gm.ui.messages.setText("You don't have any weapon, the mushroom attacks you, your life decreases by 1.");
				gm.playSE(gm.hittedSound);
				gm.player.playerCurrentLife--;
				gm.player.updatePlayerStatus();
				
				}else if(gm.player.playerCurrentLife==1) {
					gm.ui.messages.setText("You don't have any weapon, the mushroom attacks you, your die.");
					gm.player.playerCurrentLife--;
					gm.player.updatePlayerStatus();
					gm.rChanger.showGameOverScreen(1);
					
				}
			}else if(gm.player.hasWeapon==1) {
				gm.ui.messages.setText("You attack the mushroom with your dagger, you have defeated it.");
				gm.player.hasDefense=1;
				gm.playSE(gm.skeletonSound2);
				gm.player.updatePlayerStatus();
		}else {
			gm.ui.messages.setText("Is already dead.");
		}
	}
}
	
	public void talkSkeleton2() {
		gm.ui.messages.setText("You shout at the mushroom... you hear a growl in return. Maybe it's offended?");
		gm.playSE(gm.skeletonSound1);
		
	}
	
	public void lookTemple() {
		gm.ui.messages.setText("You look at the temple, with sweating hands, thinking about the baddie inside");
		
	}
	
	public void talkTemple() {
		gm.ui.messages.setText("You hear the echoes from within...");
		
	}
	
	public void climbTemple() {
		
		if(gm.player.hasItem2==0) {
			
			gm.ui.messages.setText("You can't enter the temple right now, you need a skeleton key.");
			
		}else {
			
			
		}
    }
	
	
}