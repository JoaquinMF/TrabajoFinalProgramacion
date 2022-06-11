package exceptions;

/**
 * Clase que contiene una excepcion propia
 * @author Duendeboss
 *
 */
public class ExceptionSkeletonVivo extends Exception {
	
	/**
	 * metodo (exception) que salta cuando sucede la excepci�n
	 * @param msg es el mensaje que se ense�a cuando salta la excepcion
	 */
	public ExceptionSkeletonVivo(String msg) {
		super(msg);
	}

}
