package enumeration;

/**
 * enumerations for idType of an Identity object;
 * there are 2 types (DRIVING_LICENSE, NRIC, PASSPORT)
 * type of identification of a Room object;
 * @author Isaac, Yan kai, Davis, Wenlu, Tomoki
 */

public enum TypeOfID {
	/**
	 * idType of Identity object is Driving License;
	 * Driving License of guest is used as identification for checking in;
	 */
	DRIVING_LICENSE, 
	/**
	 * idType of Identity object is NRIC;
	 * NRIC of guest is used as identification for checking in;
	 */
	NRIC, 
	/**
	 * idType of Identity object is Passport;
	 * Passport of guest is used as identification for checking in;
	 */
	PASSPORT
}
