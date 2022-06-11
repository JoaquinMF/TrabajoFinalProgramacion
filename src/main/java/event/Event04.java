package event;

import clases.GameManager;

public class Event04 {
	
	public GameManager gm;
	
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

		if (gm.player.defeatBoss == false) {
			gm.bm.setMonster();
		} else {
			
			gm.ui.messages.setText("It is already dead...");

		}
	}

	public void talkBoss() {

		if (gm.player.defeatBoss == false) {
			gm.ui.messages.setText("You talk to the... thing, but nothing occurs");

		} else {
			gm.ui.messages.setText("Stop talking to dead things.");
		}

	}

}
