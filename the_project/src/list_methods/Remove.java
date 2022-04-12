package list_methods;
/**
 * Follows the Interface Segregation Principle
 * Many smaller interface; inwhich this case is an extension of RemoveStandard and RemoveGivenObject class
 * Allows an object to be removed from the entry
 * RemoveStandard throws in an Exception when no entry is found upon its request of entry removal
 * RemoveGivenObject calls removeEntry method which allows object to be removed given entry found
 * 
 * @author Isaac, Yan kai, Davis, Wenlu, Tomoki
 * @version 7.0
 * @since 2022-03-15
 */
public interface Remove extends RemoveStandard, RemoveGivenObject{

}
