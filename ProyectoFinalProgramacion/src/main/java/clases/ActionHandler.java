package clases;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionHandler implements ActionListener {

	GameManager gm;

	public ActionHandler(GameManager gm) {

		this.gm = gm;
	}

	public void actionPerformed(ActionEvent e) {

		String yourChoice = e.getActionCommand();

		switch (yourChoice) {

		case "lookChest": gm.ev1.lookChest(); break;
		case "openChest": gm.ev1.openChest(); break; //terminar
		case "talkChest": gm.ev1.talkChest();break;	
		case "lookSeta": gm.ev1.lookSeta();break;
		case "attackSeta": gm.ev1.attackSeta();break;
		case "talkSeta": gm.ev1.talkSeta();break;
		case "lookMike": gm.ev1.lookMike();break;
		case "attackMike": gm.ev1.attackMike();break;
		case "talkMike": gm.ev1.talkMike();break;
		case "lookButtstallion": gm.ev1.lookButtstallion();break;
		case "attackButtstallion": gm.ev1.attackButtstallion();break;
		case "talkButtstallion": gm.ev1.talkButtstallion();break;
		
		
		//Change Region
		case "goRegion1": gm.rChanger.showRegion1();break;
		case "goRegion2": gm.rChanger.showRegion2();break;
		
		
		
		}

	}

}
