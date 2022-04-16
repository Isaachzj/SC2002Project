package list_methods;
/**
 * Follows the Interface Segregation Principle
 * Many smaller interface; inwhich this case is an extension of
 * Add, Remove, Get, Set, Print and Reset class
 * Add allows an object to be added to the entry using AddStandard and AddGivenObject class
 * Remove allows an object to be removed from the entry using
 * RemoveStandard and RemoveGivenObject class
 * Get allows an object to be retrieved from the entry using getEntry() method
 * Set allows overidding the entry in an array using set() method
 * Print allows the objects in the array to be printed using the printArray() method
 * Reset allows the array to be reset using the resetArray() method
 * 
 * @author Isaac, Yan kai, Davis, Wenlu, Tomoki
 * @version 7.0
 * @since 2022-03-15
 */
public interface ListMethods extends Add, Remove, Get, Set, Print, Reset{
	
}
