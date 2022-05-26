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
		gm.ui.messages.setText("Bnnhghgh brbgrgrgr, nhnhnhng. (The Queen relays her words, you didn't undestarnd anything, but you know you have been quested.)");
		
		
	}

}
