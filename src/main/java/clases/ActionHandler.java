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
		case "lookCliff": gm.ev1.lookCliff();break;
		case "talkCliff":gm.ev1.talkCliff();break;
		case "useRope":gm.ev1.useRope();break;
		
		
		case "lookMike": gm.ev2.lookMike();break;
		case "attackMike": gm.ev2.attackMike();break;
		case "talkMike": gm.ev2.talkMike();break;
		case "lookButtstallion": gm.ev2.lookButtstallion();break;
		case "attackButtstallion": gm.ev2.attackButtstallion();break;
		case "talkButtstallion": gm.ev2.talkButtstallion();break;
		
		
		//Change Region
		case "goRegion1": gm.rChanger.showRegion1();break;
		case "goRegion2": gm.rChanger.showRegion2();break;
		
		
		
		}

	}

}
