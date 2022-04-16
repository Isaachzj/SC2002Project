package list_methods;
/**
 * Follows the Interface Segregation Principle
 * Many smaller interface; inwhich this case is
 * an extension of Exception class with methods of ArrayException
 * Uses of method overloading; if ArrayException does not contain
 * a message in its parameter, throw an Error message upon exception.
 * Else, if ArrayException contains a message in its parameter;
 * throw the given error message upon exception
 * 
 * @author Isaac, Yan kai, Davis, Wenlu, Tomoki
 * @version 7.0
 * @since 2022-03-15
 */
public class ArrayException extends Exception {
	/**
	 *  Exception Handling
	 * If ArrayException does not contain a message in its parameter;
	 * throw an Error message upon exception
	 */
	public ArrayException() {
		super("Error!!");
	}
	/**
	 *  Exception Handling
	 * If ArrayException contains a message in its parameter;
	 * throw the given error message upon exception
	 */
	public ArrayException(String message) {
		super(message);
	}
}
