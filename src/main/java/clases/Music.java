package clases;

import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Music {
	
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

	public void stop(URL name) {

		clip.stop();

	}
	

}
