package clases;

import event.Event01;
import event.Event02;
import pantallas.UI;


public class GameManager {

	
	
	public ActionHandler aHandler = new ActionHandler(this);
	
	public UI ui = new UI(this);
	public Player player = new Player(this);
	public RegionChanger rChanger=new RegionChanger(this);

	public Event01 ev1=new Event01(this);
	public Event02 ev2=new Event02(this);
	
	public GameManager() {
		
		player.setPlayerDefaultStatus();
		rChanger.showRegion1();
	   
	}

}
