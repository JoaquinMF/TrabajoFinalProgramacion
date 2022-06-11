package clases;

/**
 * Clase cuyas instancias sirven para cambiar de region (pantalla) a lo largo del juego
 * @author Duendeboss
 *
 */

public class RegionChanger {

	/**
	 * gm, tipo GameManager. Al llamarla (gm.) manejamos y controlamos todo el juego
	 */
	
	GameManager gm;

	/**
	 * metodo para controlar el cambio de region
	 * @param gm
	 */
	public RegionChanger(GameManager gm) {

		this.gm = gm;

	}
	/**
	 * Metodo que al llamarlo enseña la primera region (pantalla) con musica incluida
	 */

	public void showRegion1() {

		gm.ui.bgPanel[1].setVisible(true);
		gm.ui.bgPanel[2].setVisible(false);
		gm.ui.bgPanel[3].setVisible(false);
		gm.ui.bgPanel[4].setVisible(false);
		gm.ui.messages.setText("Welcome to this awesome adventure... You arrive at Brightfoot, capital of the realm. You hear sounds of fighting and spot a mutant mushroom. You also see a chest.");
	
		gm.stopMusic(gm.currentMusic);
		gm.currentMusic = gm.regionMusic;
		gm.playMusic(gm.currentMusic);
	}
	/**
	 * Metodo que al llamarlo enseña la segunda region (pantalla) con musica incluida
	 */

	public void showRegion2() {

		gm.ui.bgPanel[1].setVisible(false);
		gm.ui.bgPanel[2].setVisible(true);
		gm.ui.bgPanel[3].setVisible(false);
		gm.ui.bgPanel[4].setVisible(false);
		gm.ui.bgPanel[5].setVisible(false);
		gm.ui.messages.setText("You wandered around, until You found the main plaza... there, you spot a guard, and the majestuous ruler of the Wonderlands, Her Esteemed Queen Buttstallion, they look at You..");

		gm.stopMusic(gm.currentMusic);
		gm.currentMusic = gm.regionMusic2;
		gm.playMusic(gm.currentMusic);
	
	}

	/**
	 * Metodo que al llamarlo enseña la tercera region (pantalla) con musica incluida
	 */
	public void showRegion3() {

		gm.ui.bgPanel[1].setVisible(false);
		gm.ui.bgPanel[2].setVisible(false);
		gm.ui.bgPanel[3].setVisible(true);
		gm.ui.bgPanel[4].setVisible(false);
		gm.ui.bgPanel[5].setVisible(false);
		gm.ui.messages.setText("After you climb the cliff, you see a city in a bay, full off skeleton pirates, your objetive is in the emple at the north east of the city.");

		gm.stopMusic(gm.currentMusic);
		gm.currentMusic = gm.regionMusic3;
		gm.playMusic(gm.currentMusic);
	
	}
	/**
	 * Metodo que al llamarlo enseña la cuarta region (pantalla) con musica incluida
	 */
	
	public void showRegion4() {

		gm.ui.bgPanel[1].setVisible(false);
		gm.ui.bgPanel[2].setVisible(false);
		gm.ui.bgPanel[3].setVisible(false);
		gm.ui.bgPanel[4].setVisible(true);
		gm.ui.bgPanel[5].setVisible(false);
		gm.ui.messages.setText("You arrive at the temple, there, You see the baddie the Queen quested You to slay.");

		gm.stopMusic(gm.currentMusic);
		gm.currentMusic = gm.regionMusic4;
		gm.playMusic(gm.currentMusic);
	
	}
	
	public void showRegion5() {
		
		gm.ui.bgPanel[1].setVisible(false);
		gm.ui.bgPanel[2].setVisible(false);
		gm.ui.bgPanel[3].setVisible(false);
		gm.ui.bgPanel[4].setVisible(false);
		gm.ui.bgPanel[5].setVisible(true);
		gm.ui.messages.setText("You WON! THANKS FOR PLAYING!, please, close the window and open the game to play again.");
		gm.stopMusic(gm.currentMusic);
	}
	
	/**
	 * Metodo que al llamarlo enseña la pantalla de game over, con efecto de sonido propio incluido
	 */

	public void showGameOverScreen(int currentBgNum) {

		gm.ui.bgPanel[currentBgNum].setVisible(false);
		gm.ui.gameOverLabel.setVisible(true);
		gm.ui.gameOverLabel.setText("YOU DIED");
		gm.ui.restartButton.setVisible(true);
		gm.ui.restartButton.setText("Start again");
		
		gm.stopMusic(gm.currentMusic);
		gm.playSE(gm.deadSound);
		
	}
	/**
	 * Metodo que al llamarlo sirve para salir de la pantalla de game over y empezar de nuevo el juego desde el principio.
	 */
	
	public void exitGameOverScreen() {
		
		gm.ui.gameOverLabel.setVisible(false);
		gm.ui.restartButton.setVisible(false);
		gm.player.setPlayerDefaultStatus();
		
	}
	

}
