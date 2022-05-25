package event;

import principal.GameManager;

public class Event01 {

	GameManager gm;

	public Event01(GameManager gm) {

		this.gm = gm;

	}

	public void lookChest() {
		gm.ui.messages.setText("A sparkling chest, probably with shiny loot. What will you do?");

		
	}

	public void openChest() {
		gm.ui.messages.setText("You plunder the ol' sweet loot.\n(You take ");
		
	}

	public void talkChest() {
		gm.ui.messages.setText("You approach the chest, and clasp your hands together. Then you recite a pray to the RNG Goddess...");
		
		
	}
	
	

}
