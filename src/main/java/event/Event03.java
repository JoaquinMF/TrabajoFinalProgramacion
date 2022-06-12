package event;

import java.util.Random;

import clases.GameManager;
import clases.Monster;
import clases.Skeleton2;
import exceptions.ExceptionSkeletonVivo;

/**
 * Clase donde esta todo lo necesario para controlar y que sean realizables todas las acciones que existen en el Event03 (3º pantalla)
 * @author Duendeboss
 *
 */
public class Event03 {

	/**
	 * gm, tipo GameManager. Al llamarla (gm.) manejamos y controlamos todo el juego
	 */
	public GameManager gm;
	/**
	 * El monstruo.
	 */
	Monster monster;
	/**
	 * Instancia del monstruo skeleton2
	 */

	Monster skeleton2 = new Skeleton2();
	
	/**
	 * Metodo que al llamarlo controla las acciones y eventos de Event03
	 * @param gm
	 */
	
	public Event03(GameManager gm) {
		this.gm = gm;
	}
	
	/**
	 * Metodo que sirve para realizar la accion lookSkeleton2 (look)
	 */
	public void lookSkeleton2() {
		if (gm.player.defeatSkeleton2 == false) {
			gm.ui.messages.setText("You look at the skeleton, so very smashable.");

		} else {
			gm.ui.messages.setText("Already crumbled.");
		}

	}
	
	/**
	 * Metodo que sirve para realizar la accion attackSkeleton2 (attack)
	 */
	
	public void attackSkeleton2() {

		skeleton2.monsterLife = skeleton2.monsterLife;
		monster = skeleton2;
		
		short playerDamage = (short) (gm.player.weaponPower - monster.monsterDefense);
		short monsterDamage = (short) (monster.monsterAttack - gm.player.defensePower);

		if(skeleton2.monsterLife>0) {
			if(gm.player.hasDefense==1) {
				if(gm.player.hasWeapon==0) {
					if(gm.player.playerCurrentLife!=1) {
						gm.ui.messages.setText("You don't have any weapon, the skeleton attacks you, your life decreases by 1.");
						gm.player.playerCurrentLife--;
						gm.playSE(gm.hittedSound);
						gm.player.updatePlayerStatus();
							
						
					}else if(gm.player.playerCurrentLife==1) {
						
						gm.ui.messages.setText("You don't have any weapon, the skeleton attacks you, you die.");
						gm.player.playerCurrentLife--;
						gm.rChanger.showGameOverScreen(3);
						gm.player.hasWeapon=0;
						gm.player.hasDefense=0;
						gm.player.hasItem=0;
						gm.player.updatePlayerStatus();
						
						
					}
					
				}else if(gm.player.hasWeapon==1) {
					if(gm.player.playerCurrentLife!=1) {
						skeleton2.monsterLife-=playerDamage;
						gm.player.playerCurrentLife-=monsterDamage;
						gm.ui.messages.setText("You attack and deal "+playerDamage+" damage! "+" and you recieve "+monsterDamage+" damage! ");
						gm.player.updatePlayerStatus();
						gm.playSE(gm.hitSound);
					
					}else if(gm.player.playerCurrentLife==1){
						skeleton2.monsterLife-=playerDamage;
						gm.player.hasWeapon=0;
						gm.player.hasDefense=0;
						gm.player.hasItem=0;
						gm.player.playerCurrentLife=0;
						gm.player.updatePlayerStatus();
						gm.rChanger.showGameOverScreen(3);
					}
					
				}
					
			}
			
		}else if(skeleton2.monsterLife<=0){
			
			gm.ui.messages.setText("You defeated the monster!");
			gm.player.updatePlayerStatus();
			gm.player.defeatSkeleton2=true;
		}

	}

	/**
	 * Metodo que sirve para realizar la accion talkSkeleton2 (talk)
	 */
	
	public void talkSkeleton2() {

		if (gm.player.defeatSkeleton2 == false) {
			gm.ui.messages.setText("You shout at the skeleton... you hear bones rattling");
			
		} else {
			gm.ui.messages.setText("Stop talking to dead things.");
		}

	}
	
	/**
	 * Metodo que sirve para realizar la accion lookTemple (look)
	 */

	public void lookTemple() {
		gm.ui.messages.setText("You look at the temple, with sweating hands, thinking about the baddie inside");

	}
	
	/**
	 * Metodo que sirve para realizar la accion talkTemple (talk)
	 */

	public void talkTemple() {
		gm.ui.messages.setText("You hear the echoes from within...");

	}
	
	/**
	 * metodo para realizar la accion enterTemple(enter)
	 * @throws ExceptionSkeletonVivo (Excepcion que salta cuando intentamos entrar al templo sin haber derrotado previamente al esqueleto (skeleton2)
	 */

	public void enterTemple() throws ExceptionSkeletonVivo {

		
		if(gm.player.hasItem==0) {
			gm.ui.messages.setText("You can't enter the temple right now...");
		}else if(gm.player.defeatSkeleton2==false) {
			gm.ui.messages.setText("This is the Exception. Kill the Skeleton to continue");
		}else {
			
			gm.rChanger.showRegion4();
		}	
  
	}

}