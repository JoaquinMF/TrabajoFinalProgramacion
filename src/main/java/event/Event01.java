package event;

import java.util.Random;

import clases.GameManager;
import clases.Monster;
import clases.Seta;
import exceptions.ExceptionSetaViva;

/**
 * Clase donde esta todo lo necesario para controlar y que sean realizables todas las acciones que existen en el Event01 (1º pantalla)
 * @author Duendeboss
 *
 */

public class Event01 {

	/**
	 * gm, tipo GameManager. Al llamarla (gm.) manejamos y controlamos todo el juego
	 */
	GameManager gm;
	/**
	 * El monstruo.
	 */
	Monster monster;
	/**
	 * Instancia del monstruo seta
	 */
	Seta seta = new Seta();

	/**
	 * Metodo que al llamarlo controla las acciones y eventos de Event01
	 * @param gm
	 */
	public Event01(GameManager gm) {

		this.gm = gm;

	}
	
	/**
	 * Metodo que sirve para realizar la accion lookChest (look)
	 */

	public void lookChest() {
		gm.ui.messages.setText("A sparkling chest, probably with shiny loot. What will you do?");

	}
	/**
	 * Metodo para realizar la accion openChest (open)
	 */

	public void openChest() {

		if (gm.player.hasWeapon == 0) {
			gm.ui.messages.setText("You plunder the ol' sweet loot.\n(You take the shiny dagger inside... )");
			gm.player.hasWeapon = 1;
			gm.player.updatePlayerStatus();
			gm.playSE(gm.healSound);
		} else {
			gm.ui.messages.setText("You already looted the chest... ");
		}

	}
	/**
	 * metodo para realizar la accion talkChest(talk)
	 */

	public void talkChest() {
		gm.ui.messages.setText("You approach the chest. Then you recite to the RNG Goddess...");

	}
	/**
	 * metodo para realizar la accion lookSeta (look)
	 */

	public void lookSeta() {
		if (gm.player.defeatSeta == false) {
			gm.ui.messages.setText("You look at the mutant mushroom, you can't help but scream who let that abomination in.");
		} else {
			gm.ui.messages.setText("It's already dead");

		}

	}
	
	/**
	 * Metodo para realizar la accion attackSeta(attack)
	 */

	public void attackSeta() {
		
		seta.monsterLife = seta.monsterLife;
		monster = seta;
		
		short playerDamage = (short) (gm.player.weaponPower - monster.monsterDefense);
		short monsterDamage = (short) (monster.monsterAttack - gm.player.defensePower);

		if(seta.monsterLife>0) {
			if(gm.player.hasDefense==0) {
				if(gm.player.hasWeapon==0) {
					if(gm.player.playerCurrentLife!=1) {
						gm.ui.messages.setText("You don't have any weapon, the mushroom attacks you, your life decreases by 1.");
						gm.player.playerCurrentLife--;
						gm.playSE(gm.hittedSound);
						gm.player.updatePlayerStatus();
							
						
					}else if(gm.player.playerCurrentLife==1) {
						
						gm.ui.messages.setText("You don't have any weapon, the mushroom attacks you, you die.");
						gm.player.playerCurrentLife--;
						gm.player.hasWeapon=0;
						gm.player.hasDefense=0;
						gm.player.hasItem=0;
						gm.player.updatePlayerStatus();
						gm.rChanger.showGameOverScreen(1);
						
					}
					
				}else if(gm.player.hasWeapon==1) {
					if(gm.player.playerCurrentLife!=1) {
						seta.monsterLife-=playerDamage;
						gm.player.playerCurrentLife-=monsterDamage;
						gm.ui.messages.setText("You attack and deal "+playerDamage+" damage! "+" and you recieve "+monsterDamage+" damage! ");
						gm.player.updatePlayerStatus();
						gm.playSE(gm.hitSound);
					
					}else if(gm.player.playerCurrentLife==1){
						seta.monsterLife-=playerDamage;
						gm.player.hasWeapon=0;
						gm.player.hasDefense=0;
						gm.player.hasItem=0;
						gm.player.playerCurrentLife=0;
						gm.player.updatePlayerStatus();
						gm.rChanger.showGameOverScreen(1);
					}
					
				}	
				
			}
			
			
		}else if(seta.monsterLife<=0){
			
			gm.ui.messages.setText("You defeated the monster!");
			gm.player.hasDefense=1;
			gm.player.updatePlayerStatus();
			gm.player.defeatSeta=true;
		}

	}
	
	/**
	 * Metodo Para realizar la accion talkSeta (talk)
	 */

	public void talkSeta() {

		if (gm.player.defeatSeta == false) {
			gm.ui.messages.setText("You shout at the mushroom... you hear a growl in return. Maybe it's offended?");
			gm.playSE(gm.setaSound);

		} else {
			gm.ui.messages.setText("Why talk to a dead monster?");

		}

	}
	
	/**
	 * metodo para realizar la accion lookCliff(look)
	 */

	public void lookCliff() {
		gm.ui.messages.setText("You look at the cliff in front of You, maybe You need something to climb it?");

	}
	
	/**
	 * metodo para realizar la accion talkCliff(talk)
	 */

	public void talkCliff() {
		gm.ui.messages.setText("You hear the wind pass by...");

	}
	
	/**
	 * metodo para realizar la accion climbCliff (climb)
	 * @throws ExceptionSetaViva (excepcion que salta si intentas climbCliff (climb) antes de derrotar a la Seta (Mushroom))
	 */

	public void climbCliff() throws ExceptionSetaViva{

		if(gm.player.hasItem==0) {
			gm.ui.messages.setText("You can't climb the cliff right now...");
		}else if(gm.player.defeatSeta==false) {
			gm.ui.messages.setText("This is the Exception. Kill the mushroom to continue");
		}else {
			
			gm.rChanger.showRegion3();
		}	
  }
	
	
	
	
}
		