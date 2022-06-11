package event;

import clases.GameManager;

public class Event03 {

	public GameManager gm;

	public Event03(GameManager gm) {
		this.gm = gm;
	}

	public void lookSkeleton2() {
		if (gm.player.defeatSkeleton1 == false) {
			gm.ui.messages.setText("You look at the skeleton, seems like a mage, so very smashable.");

		} else {
			gm.ui.messages.setText("Already crumbled.");
		}

	}

	public void attackSkeleton2() {

		if (gm.player.defeatSkeleton1 == false) {
			gm.bm.setMonster();
		} else {
			gm.ui.messages.setText("It is already dead...");

		}
	}

	public void talkSkeleton2() {

		if (gm.player.defeatSkeleton1 == false) {
			gm.ui.messages.setText("You shout at the skeleton... you hear bones rattling");
			gm.playSE(gm.skeletonSound1);

		} else {
			gm.ui.messages.setText("Stop talking to dead things.");
		}

	}

	public void lookTemple() {
		gm.ui.messages.setText("You look at the temple, with sweating hands, thinking about the baddie inside");

	}

	public void talkTemple() {
		gm.ui.messages.setText("You hear the echoes from within...");

	}

	public void enterTemple() {

		if (gm.player.hasItem == 0) {

			gm.ui.messages.setText("You can't enter the temple right now, you need a skeleton key.");

		} else {

			gm.rChanger.showRegion4();

		}
	}

}