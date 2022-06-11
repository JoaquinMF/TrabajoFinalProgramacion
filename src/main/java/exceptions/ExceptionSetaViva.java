package exceptions;
/**
 * Clase que contiene una excepcion propia
 * @author Duendeboss
 *
 */

public class ExceptionSetaViva extends Exception {
	/**
	 * metodo (exception) que salta cuando sucede la excepción
	 * @param msg es el mensaje que se enseña cuando salta la excepcion
	 */
	
	public ExceptionSetaViva(String msg) {
		super(msg);
	}

}
