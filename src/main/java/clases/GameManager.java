package clases;

import java.net.URL;

import event.Event01;
import event.Event02;
import event.Event03;
import event.Event04;
import pantallas.UI;


public class GameManager {

	public ActionHandler aHandler = new ActionHandler(this);
	
	public UI ui = new UI(this);
	public Player player = new Player(this);
	
	public RegionChanger rChanger=new RegionChanger(this);

	Music music = new Music();
	SE se = new SE();
	
	public BattleManager bm= new BattleManager(this);
	
	public Event01 ev1=new Event01(this);
	public Event02 ev2=new Event02(this);
	public Event03 ev3=new Event03(this);
	public Event04 ev4=new Event04(this);
	
	// SOUND
	
	public URL regionMusic = getClass().getClassLoader().getResource("audio//region1.wav");
	public URL regionMusic2 = getClass().getClassLoader().getResource("audio//region2.wav");
	public URL regionMusic3 = getClass().getClassLoader().getResource("audio//region3.wav");
	public URL regionMusic4 = getClass().getClassLoader().getResource("audio//region4.wav");
	public URL setaSound = getClass().getClassLoader().getResource("audio//setaSound.wav");
	public URL skeletonSound1 = getClass().getClassLoader().getResource("audio//skeletonSound1.wav");
	public URL bossSound = getClass().getClassLoader().getResource("audio//bossSound.wav");
	public URL deadSound = getClass().getClassLoader().getResource("audio//deadSound.wav");
	public URL hitSound = getClass().getClassLoader().getResource("audio//hitSound.wav");
	public URL hittedSound = getClass().getClassLoader().getResource("audio//hittedSound.wav");
	public URL healSound = getClass().getClassLoader().getResource("audio//healSound.wav");
	
	
	public URL currentMusic;
	
	public GameManager() {
		
		//SET MUSIC
		currentMusic = regionMusic;
		playMusic(currentMusic);
		
		//SET REGION
		rChanger.showRegion1();
		player.setPlayerDefaultStatus();
		
		ui.window.setVisible(true);
	   
	}
	

	public void playSE(URL url) {
		
		se.setFile(url);
		se.play(url);
		
	}
	
	
	public void playMusic(URL url) {
		
		music.setFile(url);
		music.play(url);
		music.loop(url);
		
	}
	
	public void stopMusic(URL url) {
		
		music.stop(url);
		
	}
	
}
