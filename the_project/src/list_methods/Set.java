package list_methods;

public interface Set {
	/**
	 * # set (override entry)
	 */
	/**
	 * calls set() method which overrides the entry in the array
	 * (with exception would be thrown for any error message encountered)
	 * @throws ArrayException occurs when there are any errors
	 * upon the overriding of entry in the array
	 */
	public void set() throws ArrayException;
}
