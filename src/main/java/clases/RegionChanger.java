package clases;

public class RegionChanger {

	GameManager gm;

	public RegionChanger(GameManager gm) {

		this.gm = gm;

	}

	public void showRegion1() {

		gm.ui.bgPanel[1].setVisible(true);
		gm.ui.bgPanel[2].setVisible(false);
		gm.ui.bgPanel[3].setVisible(false);
		gm.ui.bgPanel[4].setVisible(false);
		gm.ui.messages.setText("You arrive to Brightfoot, capital of the Wonderlands. Approaching it's gate, you start to hear screams and see scattered destruction. You focus your attention in the chest and mutant mushroom in front of You.");
	
		gm.stopMusic(gm.currentMusic);
		gm.currentMusic = gm.regionMusic;
		gm.playMusic(gm.currentMusic);
	}

	public void showRegion2() {

		gm.ui.bgPanel[1].setVisible(false);
		gm.ui.bgPanel[2].setVisible(true);
		gm.ui.bgPanel[3].setVisible(false);
		gm.ui.bgPanel[4].setVisible(false);
		gm.ui.messages.setText("You wandered around, until You found the main plaza... there, you spot a guard, and the majestuous ruler of the Wonderlands, Her Esteemed Queen Buttstallion, they look at You..");

		gm.stopMusic(gm.currentMusic);
		gm.currentMusic = gm.regionMusic2;
		gm.playMusic(gm.currentMusic);
	
	}

	public void showRegion3() {

		gm.ui.bgPanel[1].setVisible(false);
		gm.ui.bgPanel[2].setVisible(false);
		gm.ui.bgPanel[3].setVisible(true);
		gm.ui.bgPanel[4].setVisible(false);
		gm.ui.messages.setText("After you climb the cliff, you see a city in a bay, full off pirates, your objetive is in the emple at the end of the city.");

		gm.stopMusic(gm.currentMusic);
		gm.currentMusic = gm.regionMusic3;
		gm.playMusic(gm.currentMusic);
	
	}
	
	public void showRegion4() {

		gm.ui.bgPanel[1].setVisible(false);
		gm.ui.bgPanel[2].setVisible(false);
		gm.ui.bgPanel[3].setVisible(false);
		gm.ui.bgPanel[4].setVisible(true);
		gm.ui.messages.setText("After you climb the cliff, you see a city in a bay, full off pirates, your objetive is in the emple at the end of the city.");

		gm.stopMusic(gm.currentMusic);
		gm.currentMusic = gm.regionMusic4;
		gm.playMusic(gm.currentMusic);
	
	}
	
	

	public void showGameOverScreen(int currentBgNum) {

		gm.ui.bgPanel[currentBgNum].setVisible(false);
		gm.ui.gameOverLabel.setVisible(true);
		gm.ui.gameOverLabel.setText("YOU DIED");
		gm.ui.restartButton.setVisible(true);
		gm.ui.restartButton.setText("Start again");
		
		gm.stopMusic(gm.currentMusic);
		gm.playSE(gm.deadSound);
		
	}
	
	public void exitGameOverScreen() {
		
		gm.ui.gameOverLabel.setVisible(false);
		gm.ui.restartButton.setVisible(false);
		gm.player.setPlayerDefaultStatus();
		
	}
	
	public void showEndScreen(int currentBgNum) {
		
		gm.ui.bgPanel[currentBgNum].setVisible(false);
		//gm.ui.titleLabel.setVisible(true);
		//gm.ui.titleLabel.setText("Congratz!");
		gm.ui.messages.setText("You have completed the Awesome Quest III!\nThanks for playing!");
		
		gm.stopMusic(gm.regionMusic4);

	}
	

}
