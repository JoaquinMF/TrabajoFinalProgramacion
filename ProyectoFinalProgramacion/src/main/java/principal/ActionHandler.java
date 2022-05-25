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

		case "lookChest": break;
		case "openChest": break; //terminar
		case "talkChest": break;	
			

		}

	}

}
