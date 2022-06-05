package event;

import clases.GameManager;

public class Event02 {

	GameManager gm;

	public Event02(GameManager gm) {

		this.gm = gm;

	}

	public void lookMike() {
		gm.ui.messages.setText("You look at the guard, why is He so sparkling?");

	}

	public void attackMike() {
		gm.ui.messages.setText("-What are you doing? stop.");

	}

	public void talkMike() {
		gm.ui.messages.setText("-Hello there, thanks for your help...");

	}

	public void lookButtstallion() {
		gm.ui.messages.setText("You look at the diamond bicorn, your eyes hurt by the intense reflection of the sun in her shiny 'mane'");

	}

	public void attackButtstallion() {
		gm.ui.messages.setText("You attack bounce off her, Her Majesty thinks You are patting her.");

	}

	public void talkButtstallion() {
		gm.ui.messages.setText("Hello noble Adventure, please, search the Castle for a Rope, and continue to the west where the Mushroom was...");

	}

	public void lookCastle() {
		
		gm.ui.messages.setText("You look at the majestic Castle, is too big for a Bicorn though");
		
	}

	public void restCastle() {
		if(gm.player.playerCurrentLife!=gm.player.playerMaxLife) {
			gm.ui.messages.setText("You rest in a room You found(Your life has recovered)");
			gm.player.playerCurrentLife++;
			gm.player.updatePlayerStatus();
		}else {
			gm.ui.messages.setText("You are rested. (Your life is full)");
		}

	}

	public void searchCastle() {
		
		
		if(gm.player.hasItem==0) {
			gm.ui.messages.setText("You search the Castle for a rope. (You obtained rope).");
			gm.player.hasItem=1;
			gm.player.updatePlayerStatus();
		}else {
			gm.ui.messages.setText("You already searched the Castle... ");
		}
		
		
	}

}
