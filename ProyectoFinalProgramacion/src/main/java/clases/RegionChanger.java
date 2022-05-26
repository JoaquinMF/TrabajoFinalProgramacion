package clases;

public class RegionChanger {

	GameManager gm;

	public RegionChanger(GameManager gm) {

		this.gm = gm;

	}

	public void showRegion1() {

		gm.ui.bgPanel[1].setVisible(true);
		gm.ui.bgPanel[2].setVisible(false);
		gm.ui.messages.setText("You arrive to Brightfoot, capital of the Wonderlands. Approaching it's gate, you start to hear screams and see scattered destruction. You focus your attention in the chest and mutant mushroom in front of You.");
	}

	public void showRegion2() {

		gm.ui.bgPanel[1].setVisible(false);
		gm.ui.bgPanel[2].setVisible(true);
		gm.ui.messages.setText("After your fight, you wandered around, until You found the main plaza... there, you spot a guard, and the majestuous ruler of the Wonderlands, Her Esteemed Queen Buttstallion, they look at You..");
		
		
		
	}

}
