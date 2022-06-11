package clases;

/**
 * Clase cuya instancia representa al jugador
 * @author Duendeboss
 *
 */

public class Player extends EntityStatsAndItems {
	
	/**
	 * gm, tipo GameManager. Al llamarla (gm.) manejamos y controlamos todo el juego
	 */
	GameManager gm;
	
	/**
	 * funcion que al llamarla controlamos y manejamos al jugador
	 * @param gm
	 */
	
	public Player(GameManager gm) {
		
		this.gm=gm;
		
	}
	
	/**
	 * Metodo que establece las estadisticas y objetos del jugador nada mas empezar el juego
	 */
	public void setPlayerDefaultStatus() {
		
		playerMaxLife = 5;
		playerCurrentLife = 3;
	
		hasWeapon=0;
		hasDefense=0;
		hasItem=0;
		weaponPower=0;
		defensePower=0;
		
		defeatSeta = false;
		defeatSkeleton2 = false;
		defeatBoss = false;
		updatePlayerStatus();
		
	}
	/**
	 * Metodo que actualiza las estadisticas y objetos del jugador a lo largo del juego
	 */
	
	public void updatePlayerStatus() {


		
		//REMOVE ALL LIFE ICON
		short i=1;
		while(i<6) {
			gm.ui.lifeLabel[i].setVisible(false);
			i++;
		}
		
		short lifeCount=playerCurrentLife;
		
		while(lifeCount!=0) {
			gm.ui.lifeLabel[lifeCount].setVisible(true);
			lifeCount--;
		}
		
	
		
		//CHECK PLAYER ITEMS
		
		if(hasWeapon==0) {
			weaponPower=0;
			
			gm.ui.weaponLabel.setVisible(false);
		}
		
		if(hasWeapon==1) {
			weaponPower=3;
			gm.ui.weaponLabel.setVisible(true);
		}
		
		if(hasDefense==0) {
			defensePower=0;
			gm.ui.defenseLabel.setVisible(false);
		}
		
		if(hasDefense==1) {
			defensePower=1;
			gm.ui.defenseLabel.setVisible(true);
		}
		
		if(hasItem==0) {
			gm.ui.itemLabel.setVisible(false);
		}
		
		if(hasItem==1) {
			gm.ui.itemLabel.setVisible(true);
		}
		
	}
	
	
	
}