package list_methods;

public interface Reset {
	/**
	 * calls resetArray() method which resets the array (with exception would be thrown for any error message encountered)
	 * @throws ArrayException occurs when there are any errors upon the reset of the array
	 */
	public void resetArray() throws ArrayException;
}	
