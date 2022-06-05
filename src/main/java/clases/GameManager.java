package clases;

import event.Event01;
import event.Event02;
import event.Event03;
import pantallas.UI;


public class GameManager {

	public ActionHandler aHandler = new ActionHandler(this);
	
	public UI ui = new UI(this);
	public Player player = new Player(this);
	
	public RegionChanger rChanger=new RegionChanger(this);

	public Event01 ev1=new Event01(this);
	public Event02 ev2=new Event02(this);
	public Event03 ev3=new Event03(this);
	
	public GameManager() {
		
		
		rChanger.showRegion1();
		player.setPlayerDefaultStatus();
		
	   
	}
	

}
