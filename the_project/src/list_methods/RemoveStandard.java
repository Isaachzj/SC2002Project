package list_methods;

public interface RemoveStandard {
	/**
	 *  #remove method
	 */
	/**
	 * Exception handling for entry removal
	 * i.e. when no entry is found upon removal of entry; exception (ArrayException) would be thrown
	 * @throws ArrayException occurs when no entry found for its request to be removed
	 */
	public void removeEntry() throws ArrayException;
}
