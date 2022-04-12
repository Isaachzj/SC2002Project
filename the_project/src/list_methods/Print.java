package list_methods;

public interface Print {
	/**
	 * calls printArray() method which prints the objects in the list (with exception would be thrown for any error message encountered)
	 * @throws ArrayException occurs when there are any errors upon the printing of objects in an array
	 */
	public void printArray() throws ArrayException;
}
