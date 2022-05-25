package principal;

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
		}

	}

}
