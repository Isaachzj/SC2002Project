package list_methods;

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
