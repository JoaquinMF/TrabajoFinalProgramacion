package clases;

/**
 * Clase que contiene stats e items a la vez
 * @author Duendeboss
 *
 */

public class EntityStatsAndItems {
	
	/**
	 * los puntos de vida del jugador, representa los puntos (iconos) de vida MAXIMA que puede tener el jugador
	 */
	public short playerMaxLife;
	/**
	 * los puntos de vida del jugador, representa los puntos (iconos) actuales que tiene el jugador
	 */
	public short playerCurrentLife;

	/**
	 * el arma, indica si el jugador posee o no un arma
	 */
	public short hasWeapon;
	/**
	 * la defensa, indica si el jugador posee o no una defensa
	 */
	public short hasDefense;
	/**
	 * objeto, indica si el jugador posee o no un objeto especial necesario para avanzar en el juego
	 */
	public short hasItem;
	/**
	 * poder de arma, indica el daño que va ha realizar el jugador
	 */
	public short weaponPower;
	/**
	 * poder de defensa, indica la defensa (daño evitable) del jugador
	 */
	public short defensePower;
	/**
	 * la seta, indica si la seta está derrotada
	 */
	public boolean defeatSeta;
	/**
	 * el esqueleto, indica si el esqueleto esta derrotado
	 */
	public boolean defeatSkeleton2;
	/**
	 * el jefe final, indica si el jefe final esta derrotado
	 */
	public boolean defeatBoss;

}
