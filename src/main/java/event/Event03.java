package event;

import clases.GameManager;

public class Event03 {
	
	public GameManager gm;
	
	public Event03(GameManager gm) {
		this.gm=gm;
	}
	
	public void lookSkeleton1() {
		if(gm.player.defeatSkeleton1==true) {
			gm.ui.messages.setText("Already crumbled.");
		}else {
			gm.ui.messages.setText("You look at the skeleton, seems like a mage, so very smashable.");
		}
		
		
	}
	
	
	public void attackSkeleton1() {
		
		if(gm.player.defeatSkeleton1==true) {
			gm.ui.messages.setText("It is already dead...");
		}
		else {
			gm.bm.setMonster();
		}
}
	
	public void talkSkeleton1() {
		
		if(gm.player.defeatSkeleton1==true) {
			gm.ui.messages.setText("Stop talking to dead things.");
		}else {
			gm.ui.messages.setText("You shout at the skeleton... you hear bones rattling");
			gm.playSE(gm.skeletonSound1);
		}
		
	}
	
	public void lookSkeleton2() {
		if(gm.player.defeatSkeleton1==true) {
			gm.ui.messages.setText("Already smashed.");
		}else {
			gm.ui.messages.setText("You look at the Skeleton Warrior... you're glad you have armor");
		}
		

		
	}
	
	
	public void attackSkeleton2() {
		
		if(gm.player.defeatSkeleton1==true) {
			gm.ui.messages.setText("It is already dead...");
		}
		else {
			gm.bm.setMonster();
		}
}
	
	public void talkSkeleton2() {
		
		if(gm.player.defeatSkeleton1==true) {
			gm.ui.messages.setText("Stop talking to dead things.");
		}else {
			gm.ui.messages.setText("You shout at the skeleton... you hear bones rattling");
			gm.playSE(gm.skeletonSound1);
		}
		
	}
	
	public void lookTemple() {
		gm.ui.messages.setText("You look at the temple, with sweating hands, thinking about the baddie inside");
		
	}
	
	public void talkTemple() {
		gm.ui.messages.setText("You hear the echoes from within...");
		
	}
	
	public void enterTemple() {
		
		if(gm.player.hasItem==0) {
			
			gm.ui.messages.setText("You can't enter the temple right now, you need a skeleton key.");
			
		}else {
			
			
		}
    }
	
	
}