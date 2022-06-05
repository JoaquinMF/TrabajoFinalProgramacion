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
		}else {
			gm.ui.messages.setText("You already looted the chest... )");
		}
		
		
		
	}

	public void talkChest() {
		gm.ui.messages.setText("You approach the chest. Then you recite to the RNG Goddess...");
		
		
	}
	
	public void lookSeta() {
		gm.ui.messages.setText("You look at the mutant mushroom, you can't help but scream who let that abomination in.");

		
	}
	
	
	public void attackSeta() {
		gm.ui.messages.setText("You slash at it's horrible face.\n (You deal )"); //Terminar
		
		
	}
	
	
	public void talkSeta() {
		gm.ui.messages.setText("You shout at the mushroom... you hear a growl in return. Maybe it's offended?");
		
		
	}
	
	
	public void lookCliff() {
		
		
	}
	
	public void talkCliff() {
		
		
	}
	
	public void useRope() {
		
		
	}
	
	
	

}