package clases;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import exceptions.ExceptionSetaViva;
import exceptions.ExceptionSkeletonVivo;

/**
 * Clase que va a manejar las accciones realizadas.
 * Unica variable interna gm, de tipo GameManager
 * implements ActionListener (The listener interface for receiving action events.)
 * @author Duendeboss
 *
 */

public class ActionHandler implements ActionListener {

	/**
	 * el gm, que sirve para llamarlo cuando querramos controlar un aspecto en concreto del juego
	 */
	GameManager gm;
	
	/**
	 * metodo para llamar a gm
	 * @param gm (tipo GameManager)
	 */

	public ActionHandler(GameManager gm) {

		this.gm = gm;
	}
	
	/**
	 * metodo para realizar las acciones.
	 * switch (yourChoice). Switch que contiene todas las acciones que se pueden realizar en el juego
	 *  @param e (tipo ActionEvent)
	 */

	public void actionPerformed(ActionEvent e) {

		String yourChoice = e.getActionCommand();

		switch (yourChoice) {
		
		//REGION 1
		case "lookChest": gm.ev1.lookChest(); break;
		case "openChest": gm.ev1.openChest(); break;
		case "talkChest": gm.ev1.talkChest();break;	
		case "lookSeta": gm.ev1.lookSeta();break;
		case "attackSeta": gm.ev1.attackSeta();break;
		case "talkSeta": gm.ev1.talkSeta();break;
		case "lookCliff": gm.ev1.lookCliff();break;
		case "talkCliff":gm.ev1.talkCliff();break;
		case "climbCliff":try {
				gm.ev1.climbCliff();
			} catch (ExceptionSetaViva e1) {
				gm.ui.messages.setText("This is the Exception. Kill the mushroom to continue");
			}break;
		//REGION 2
		case "lookCastle":gm.ev2.lookCastle();break;
		case "restCastle":gm.ev2.restCastle();break;
		case "searchCastle":gm.ev2.searchCastle();break;
		case "lookMike": gm.ev2.lookMike();break;
		case "attackMike": gm.ev2.attackMike();break;
		case "talkMike": gm.ev2.talkMike();break;
		case "lookButtstallion": gm.ev2.lookButtstallion();break;
		case "attackButtstallion": gm.ev2.attackButtstallion();break;
		case "talkButtstallion": gm.ev2.talkButtstallion();break;
		//REGION 3
		case "lookSkeleton2": gm.ev3.lookSkeleton2();break;
		case "attackSkeleton2":gm.ev3.attackSkeleton2();break;
		case "talkSkeleton2": gm.ev3.talkSkeleton2();break;
		case "lookTemple": gm.ev3.lookTemple();break;
		case "talkTemple":gm.ev3.talkTemple();break;
		case "enterTemple":try {
				gm.ev3.enterTemple();
			} catch (ExceptionSkeletonVivo e1) {
				
				System.err.println("This is the Exception. Kill the Skeleton to continue");
			}break;
		//REGION 4
		case "lookBoss": gm.ev4.lookBoss();break;
		case "attackBoss": gm.ev4.attackBoss();break;
		case "talkBoss": gm.ev4.talkBoss();break;
		
		//Change Region
		
		case "goRegion1": gm.rChanger.showRegion1();break;
		case "goRegion2": gm.rChanger.showRegion2();break;
		case "goRegion3": gm.rChanger.showRegion3();break;
		case "goRegion4": gm.rChanger.showRegion4();break;
		case "goRegion5": gm.rChanger.showRegion5();break;
		
		//OTHERS
		case "restart": gm.rChanger.exitGameOverScreen();
						gm.rChanger.showRegion1();
						break;
		
		
		}

	}

}
