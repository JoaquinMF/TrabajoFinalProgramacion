package clases;

import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
/**
 * Clase cuyas instancias representan los efectos de sonido del juego
 * @author Duendeboss
 *
 */
public class SE {

	/**
	 * clip, es la variable interna de tipo CLIP que usaremos para los sonidos y musica
	 */
	Clip clip;

	/**
	 * Metodo para settear el file necesario
	 * @param name (nombre del archivo de sonido)
	 */
	
	public void setFile(URL name) {

		try {
			AudioInputStream sound = AudioSystem.getAudioInputStream(name);
			clip = AudioSystem.getClip();
			clip.open(sound);
		} catch (Exception e) {

		}
	}

	/**
	 * metodo que empieza (play) el sonido
	 * @param name (nombre del archivo de sonido)
	 */
	
	public void play(URL name) {

		clip.setFramePosition(0);
		clip.start();

	}
	
	/**
	 * metodo para loopear el sonido
	 * @param name (nombre del archivo de sonido)
	 */

	public void loop(URL name) {

		clip.loop(Clip.LOOP_CONTINUOUSLY);

	}
	
	/**
	 * metodo que al llamarlo detiene los efectos de sonido
	 * @param name (nombre del archivo de sonido)
	 */
	
	public void stop(URL name) {

		clip.stop();

	}

}