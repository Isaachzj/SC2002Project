package list_methods;

public interface AddGivenObject {
	/**
	 * calls addEntry method which allows object to be added given no exception thrown (i.e. given no errors)
	 * @param object this is the object to be added into the Entry
	 * @throws ArrayException occurs upon an error and error message would be printed accordingly
	 */
	public void addEntry(Object object) throws ArrayException;
}
