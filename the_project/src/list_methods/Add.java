package list_methods;
/**
 * Follows the Interface Segregation Principle
 * Many smaller interface; inwhich this case is an extension of AddStandard and AddGivenObject class
 * Allows an object to be added as an entry
 * AddStandard throws in an Exception when duplicate entry is spotted upon adding of new entry
 * AddGivenObject calls addEntry method which allows object to be added given no duplicate entry found
 * 
 * @author Isaac, Yan kai, Davis, Wenlu, Tomoki
 * @version 7.0
 * @since 2022-03-15
 *
 */
public interface Add extends AddStandard, AddGivenObject{

}
