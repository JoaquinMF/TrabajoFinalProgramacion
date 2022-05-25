package clases;

import event.Event01;
import pantallas.UI;
import pantallas.Window;

public class GameManager {

	
	
	public ActionHandler aHandler = new ActionHandler(this);
	
	public UI ui = new UI(this);
	public RegionChanger rChanger=new RegionChanger(this);

	public Event01 ev1=new Event01(this);
	
	public GameManager() {
		
		rChanger.showRegion1();
	   
	}

}
