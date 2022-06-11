package clases;

import java.net.URL;

import event.Event01;
import event.Event02;
import event.Event03;
import event.Event04;
import pantallas.UI;

/**
 * Clase que controla todo el juego.
 * @author Duendeboss
 *
 */

public class GameManager {

	/**
	 * aHandler es la variable interna que sirve, al llamarla, para controlar una accion en el juego
	 */
	public ActionHandler aHandler = new ActionHandler(this);
	/**
	 * ui, es la variable que al instanciarse genera toda la INTERFAZ DE USUARIO
	 */
	public UI ui = new UI(this);
	/**
	 * el jugador, representa al jugador
	 */
	public Player player = new Player(this);
	/**
	 * rChanger, variable interna que al instanciarla y llamarla con gm.rChanger cambiar la region(pantalla)
	 */
	public RegionChanger rChanger=new RegionChanger(this);
	/**
	 * music, es la musica del juego
	 */
	Music music = new Music();
	/**
	 * se, son los efectos de sonido del juego
	 */
	SE se = new SE();
	/**
	 * ev1, es la variable interna donde están instanciados todos las acciones y eventos en el Event01 (que es la primera pantalla)
	 */
	public Event01 ev1=new Event01(this);
	/**
	 * ev2, es la variable interna donde están instanciados todos las acciones y eventos en el Event02 (que es la segunda pantalla)
	 */
	public Event02 ev2=new Event02(this);
	/**
	 * ev3, es la variable interna donde están instanciados todos las acciones y eventos en el Event03 (que es la tercera pantalla)
	 */
	public Event03 ev3=new Event03(this);
	/**
	 * ev4, es la variable interna donde están instanciados todos las acciones y eventos en el Event04 (que es la cuarta pantalla)
	 */
	public Event04 ev4=new Event04(this);
	
	// SOUND
	
	/**
	 * musica de la primera region (pantalla)
	 */
	public URL regionMusic = getClass().getClassLoader().getResource("audio//region1.wav");
	/**
	 * musica de la segunda region (pantalla)
	 */
	public URL regionMusic2 = getClass().getClassLoader().getResource("audio//region2.wav");
	/**
	 * musica de la tercera region (pantalla)
	 */
	public URL regionMusic3 = getClass().getClassLoader().getResource("audio//region3.wav");
	/**
	 * musica de la cuarta region (pantalla)
	 */
	public URL regionMusic4 = getClass().getClassLoader().getResource("audio//region4.wav");
	/**
	 * efecto de sonido de la seta al realizar talkSeta(talk)
	 */
	public URL setaSound = getClass().getClassLoader().getResource("audio//setaSound.wav");
	/**
	 * efecto de sonido del boss al realizar talkBoss(talk)
	 */
	public URL bossAudio = getClass().getClassLoader().getResource("audio//bossAudio.wav");
	/**
	 * efecto de sonido que se escucha cuando muere el jugador
	 */
	public URL deadSound = getClass().getClassLoader().getResource("audio//deadSound.wav");
	/**
	 * efecto de sonido cuando el jugador acierta un golpe a un enemigo
	 */
	public URL hitSound = getClass().getClassLoader().getResource("audio//hitSound.wav");
	/**
	 * efecto de sonido cuando el jugador recibe un golpe por un enemigo
	 */
	public URL hittedSound = getClass().getClassLoader().getResource("audio//hittedSound.wav");
	/**
	 * efecto de sonido que se produce cuando el jugador se cura/aumenta sus puntos de vida (restCastle, rest) 
	 */
	public URL healSound = getClass().getClassLoader().getResource("audio//healSound.wav");
	/**
	 * musica que suena actualmente
	 */
	public URL currentMusic;
	
	/**
	 * Metodo para llamar lo necesario para empezar el juego y enseñar la primera pantalla
	 */
	
	public GameManager() {
		
		//SET MUSIC
		currentMusic = regionMusic;
		playMusic(currentMusic);
		
		//SET REGION
		rChanger.showRegion1();
		player.setPlayerDefaultStatus();
		
		ui.window.setVisible(true);
	   
	}
	
	/**
	 * metodo para iniciar sound effects
	 * @param url (tipo URL)
	 */

	public void playSE(URL url) {
		
		se.setFile(url);
		se.play(url);
		
	}
	
	/**
	 * metodo para iniciar la musica
	 * @param url (tipo URL)
	 */
	public void playMusic(URL url) {
		
		music.setFile(url);
		music.play(url);
		music.loop(url);
		
	}
	/**
	 * metodo para parar la musica
	 * @param url (tipo URL)
	 */
	
	public void stopMusic(URL url) {
		
		music.stop(url);
		
	}
	
}
