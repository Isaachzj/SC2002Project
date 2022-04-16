package list_methods;
/**
 * calls printArray() method which prints the objects in the array
 * (with exception would be thrown for any error message encountered)
 * 
 * @author Isaac, Yan kai, Davis, Wenlu, Tomoki
 * @version 7.0
 * @since 2022-03-15
 */
public interface Print {
	/**
	 * Prints the objects in the array
	 * (with exception would be thrown for any error message encountered)
	 * @throws ArrayException occurs when there are any errors upon the printing of objects in an array
	 */
	public void printArray() throws ArrayException;
}
