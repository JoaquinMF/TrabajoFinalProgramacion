package event;



import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

import clases.Boss;
import clases.GameManager;
import clases.Monster;

/**
 * Clase donde esta todo lo necesario para controlar y que sean realizables todas las acciones que existen en el Event04 (4º pantalla)
 * @author Duendeboss
 *
 */

public class Event04 {
	/**
	 * gm, tipo GameManager. Al llamarla (gm.) manejamos y controlamos todo el juego
	 */
	public GameManager gm;
	/**
	 * El monstruo.
	 */
	Monster monster;
	/**
	 * Instancia del monstruo boss
	 */
	Monster boss = new Boss();
	
	/**
	 * Metodo que al llamarlo controla las acciones y eventos de Event04
	 * @param gm
	 */
	public Event04(GameManager gm) {
		this.gm = gm;
	}
	
	/**
	 * Metodo que sirve para realizar la accion lookBoss (look)
	 */

	
	public void lookBoss() {
		if (gm.player.defeatBoss == false) {
			gm.ui.messages.setText("You look at the final boss, he sure is ugly.");

		} else {
			gm.ui.messages.setText("Already dead.");
		}

	}
	
	/**
	 * Metodo que sirve para realizar la accion attackBoss (attack) 
	 * Cuando vencemos al boss final la pantalla de END GAME se muestra automaticamente
	 * Cuando vencemos al boss final tambien se genera un archivo de .txt (FileWriter) en la carpeta del proyecto
	 */

	public void attackBoss() {

		boss.monsterLife = boss.monsterLife;
		monster = boss;
		
		short playerDamage = (short) (gm.player.weaponPower - monster.monsterDefense);
		short monsterDamage = (short) (monster.monsterAttack - gm.player.defensePower);

		if(boss.monsterLife>0) {
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
						gm.rChanger.showGameOverScreen(4);
						gm.player.hasWeapon=0;
						gm.player.hasDefense=0;
						gm.player.hasItem=0;
						gm.player.updatePlayerStatus();
						
						
					}
					
				}else if(gm.player.hasWeapon==1) {
					if(gm.player.playerCurrentLife!=1) {
						boss.monsterLife-=playerDamage;
						gm.player.playerCurrentLife-=monsterDamage;
						gm.ui.messages.setText("You attack and deal "+playerDamage+" damage! "+" and you recieve "+monsterDamage+" damage! ");
						gm.player.updatePlayerStatus();
						gm.playSE(gm.hitSound);
					
					}else if(gm.player.playerCurrentLife==1){
						boss.monsterLife-=playerDamage;
						gm.player.hasWeapon=0;
						gm.player.hasDefense=0;
						gm.player.hasItem=0;
						gm.player.playerCurrentLife=0;
						gm.player.updatePlayerStatus();
						gm.rChanger.showGameOverScreen(4);
					}
					
				}
					
			}
			
		}else if(boss.monsterLife<=0){
			
			gm.rChanger.showRegion5();
			gm.player.hasWeapon=0;
			gm.player.hasDefense=0;
			gm.player.hasItem=0;
			gm.player.playerCurrentLife=0;
			gm.player.updatePlayerStatus();
			gm.player.defeatBoss=true;
			
			try {
				
	            File informe = new File("./informe" + ".txt");
	            informe.createNewFile();
	            File carpetaInforme = new File("./");
	            File[] hijos = carpetaInforme.listFiles();
	            FileWriter escritor = new FileWriter("./informe.txt");
	            
	            for (byte i = 0; i < hijos.length; i++) {
	            if (hijos[i].isFile()) {
	    
	            escritor.write("\n"+"CONGRATULATIONS, YOU WON THE GAME!");
	           
	            } else {
	           
	            }
	            
	            }
	            
	            escritor.close();
	            
	            } catch (IOException e) {
	            System.out.println(e.getMessage());
	            }
			
		}
		
	}
	
	/**
	 * Metodo que sirve para realizar la accion talkBoss (talk)
	 */

	public void talkBoss() {

		if (gm.player.defeatBoss == false) {
			gm.playSE(gm.bossAudio);
			
		} else {
			gm.ui.messages.setText("Stop talking to dead things.");
		}

	}

}
