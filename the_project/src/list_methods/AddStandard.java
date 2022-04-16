package list_methods;

public interface AddStandard {
	/**
	 * Exception handling for duplicate entry
	 * i.e. when a duplicate entry is found upon adding of entry; exception
	 * (ArrayException) would be thrown
	 * @throws ArrayException occurs upon a duplicate entry
	 */
	public void addEntry() throws ArrayException;	//exception for duplicate entry
}
