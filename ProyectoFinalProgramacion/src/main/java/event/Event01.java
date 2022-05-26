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
		gm.ui.messages.setText("You plunder the ol' sweet loot.\n(You take the shiny dagger inside... )");
		
	}

	public void talkChest() {
		gm.ui.messages.setText("You approach the chest, and clasp your hands together. Then you recite a pray to the RNG Goddess...");
		
		
	}
	
	public void lookSeta() {
		gm.ui.messages.setText("You look at the mutant mushroom, you can't help but scream who let that abomination in.");

		
	}
	
	
	public void attackSeta() {
		gm.ui.messages.setText("You slash at it's horrible face.\n (You deal )"); //Terminar
		
		
	}
	
	
	public void talkSeta() {
		gm.ui.messages.setText("You shout at the mushroom how can be so ugly... you hear a growl in return. Maybe it's offended?");
		
		
	}
	
	
	
	
	
	

}
