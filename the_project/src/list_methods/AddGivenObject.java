package list_methods;

public interface AddGivenObject {
	/**
	 * calls addEntry method which allows object to be added given no duplicate entry found
	 * @param object this is the object to be added into the Entry
	 * @throws ArrayException occurs upon a duplicate entry
	 */
	public void addEntry(Object object) throws ArrayException;
}
