package event;

import clases.GameManager;

/**
 * Clase donde están contenidas todas las acciones que se pueden realizar en
 * Event02 (2º pantalla)
 * 
 * @author Duendeboss
 *
 */

public class Event02 {

	/**
	 * gm, tipo GameManager. Al llamarla (gm.) manejamos y controlamos todo el juego
	 */
	GameManager gm;

	/**
	 * Metodo que al llamarlo controla las acciones y eventos de Event02
	 * 
	 * @param gm
	 */
	public Event02(GameManager gm) {

		this.gm = gm;

	}

	/**
	 * metodo para realizar la accion lookMike(look)
	 */

	public void lookMike() {
		gm.ui.messages.setText("You look at the guard, why is He so sparkling?");

	}

	/**
	 * metodo para realizar la accion attackMike(attack)
	 */

	public void attackMike() {
		gm.ui.messages.setText("-What are you doing? stop.");
		gm.player.playerCurrentLife--;
		gm.player.updatePlayerStatus();

		gm.playSE(gm.hittedSound);

	}

	/**
	 * metodo para realizar la accion talkMike(talk)
	 */

	public void talkMike() {
		gm.ui.messages.setText("-Hello there, thanks for your help...");

	}

	/**
	 * metodo para realizar la accion lookButtstallion(look)
	 */

	public void lookButtstallion() {
		gm.ui.messages.setText(
				"You look at the diamond bicorn, your eyes hurt by the intense reflection of the sun in her shiny 'mane'");

	}

	/**
	 * metodo para realizar la accion attackButtstallion(attack)
	 */

	public void attackButtstallion() {
		gm.ui.messages.setText("You attack bounce off her, Her Majesty thinks You are patting her.");

	}

	/**
	 * metodo para realizar la accion talkButtstallion(talk)
	 */

	public void talkButtstallion() {
		gm.ui.messages.setText(
				"Hello noble Adventure, please, search the Castle for a Rope, and continue to the west where the Mushroom was...");

	}

	/**
	 * metodo para realizar la accion lookCastle(look)
	 */

	public void lookCastle() {

		gm.ui.messages.setText("You look at the majestic Castle, is too big for a Bicorn though");

	}

	/**
	 * metodo para realizar la accion restCastle(rest) Sirve para restaurar puntos de vida (iconos del corazon)
	 */

	public void restCastle() {
		if (gm.player.defeatBoss == true) {

		} else {

			if (gm.player.playerCurrentLife != gm.player.playerMaxLife) {
				gm.ui.messages.setText("You rest in a room You found(Your life has recovered)");
				gm.player.playerCurrentLife++;
				gm.player.updatePlayerStatus();
				gm.playSE(gm.healSound);

			} else {

				gm.ui.messages.setText("You are rested. (Your life is full)");
			}

		}
	}

	/**
	 * metodo para realizar la accion searchCastle(search) Sirve para encontar el item (rope) necesario para continuar al 
	 * Event03 (3º mapa) cuando realizamos la accion climbCliff(climb) en el Event01 (1º pantalla)
	 */

	public void searchCastle() {

		if (gm.player.hasItem == 0) {
			gm.ui.messages.setText("You search the Castle for a rope. (You obtained rope).");
			gm.player.hasItem = 1;
			gm.player.updatePlayerStatus();
			gm.playSE(gm.healSound);

		} else {
			gm.ui.messages.setText("You already searched the Castle... ");
		}

	}

}
