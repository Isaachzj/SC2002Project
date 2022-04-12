package list_methods;

public interface RemoveGivenObject {
	/**
	 * calls removeEntry method which allows object to be added given no exception thrown (i.e. given no errors)
	 * @param object this is the object to be removed from the Entry
	 * @throws ArrayException occurs upon an error and error message would be printed accordingly
	 */
	public void removeEntry(Object object) throws ArrayException;
}
