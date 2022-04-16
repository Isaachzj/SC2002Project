package room_features;

import java.util.Scanner;

import list_methods.*;

/**
 * Follows the Single Responsibility Principle as it has the 
 * sole responsibility of manipulating the features of a room;
 */
public class FeatureManipulator implements AddStandard,RemoveStandard,Set, Reset {
	private RoomFeatures rf;
	
	/**
	 * # Constructor
	 */
	/**
	 * initiates a FeatureManipulator object by using a RoomFeatures object;
	 * @param rf RoomFeatures object;
	 */
	public FeatureManipulator(RoomFeatures rf) {
		this.rf = rf;
	}
	
//============================================================================================================================================	
	/**
	 * Adds a new feature to this room by taking in input feature name
	 * and status/quantity from the user (hotel staff member);
	 * Searches for existing features which matches input;
	 * If match is found, feature already exists in this room
	 * and error message asking if user wants to update feature quantity comes up;
	 * If match is not found, feature does not exist in this room
	 * and new feature object is created and instantiated,
	 * and number of features increments by 1;
	 */
	
	
	public void addEntry() throws ArrayException {
		boolean found = false;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter new Feature name:");
		String feature_name = sc.nextLine();
		System.out.println("Enter new Feature Status/Quantity (NA if irrelevant):");
		String status = sc.nextLine();
		
		//Check if such an entry exists!
		for (int i=0; i<rf.getArray().size(); i++) {
			Feature ff = rf.getArray().get(i);
			if (ff.getName().compareTo(feature_name) == 0) {
				found = true;	
				break;
			}//end if
		}//end for
		
		if (found) throw new ArrayException("Feature already exist! Do you want to update quantity instead?");
		
		Feature new_ff = new Feature(feature_name, status);
		rf.getArray().add(new_ff);	//getArray returns reference to ArrayList object
		rf.setNumFeatures(rf.getNumFeatures()+1);
	}

//============================================================================================================================================	
	/**
	 * Removes existing feature that is not a core feature;
	 * Searches for existing features which matches input feature_name;
	 * If found and feature_name is a core feature, error message is displayed;
	 * If found and feature_name is not a core feature,
	 * feature_name index is used to remove feature;
	 * If not found, error message is displayed;  
	 */
	
	public void removeEntry() throws ArrayException{
		boolean found = false;
		int index = 0;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Feature name:");
		String fn = sc.nextLine();
		
		/**
		 * # Check if feature_name is a core feature (cannot remove this)
		 */
		if (fn.compareTo("Bed")==0||fn.compareTo("View")==0||fn.compareTo("Wifi")==0||fn.compareTo("Smoking")==0||fn.compareTo("Number of Beds")==0)
		{
			System.out.println("Cannot remove core feature!");
			return;
		}
	
		/**
		 * # Finding feature in array of additional features
		 */
		for (int i=0; i<rf.getArray().size(); i++) {
			Feature ff = rf.getArray().get(i);
			if (ff.getName().compareTo(fn) == 0) {
				found = true; index = i;	
				break;
			}//end if
		}//end for
		
		/**
		 * # Throw exception if no such feature exists
		 * (Catch outside function and continue to reiterate while loop)
		 */
		if (!found) throw new ArrayException("No such additional feature exists!!");
		
		/**
		 * # Removing feature
		 */
		rf.getArray().remove(index);
		rf.setNumFeatures(rf.getNumFeatures()-1);
		return;
	}
	
//============================================================================================================================================	
	/**
	 * Updates feature status of existing non-core feature;
	 * Searches for existing features that matches input feature_name;
	 * If found and feature_name is a core feature, error message is displayed;
	 * If found and feature_name is not a core feature, a message displayed queues the user 
	 * for new status input for this feature;
	 * If not found, error message is displayed; 
	 */
	
	public void set() throws ArrayException {
		boolean found = false;
		int index = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the feature name:");
		String fn = sc.nextLine();
		
		if (fn.compareTo("Bed")==0||fn.compareTo("View")==0||fn.compareTo("Wifi")==0||fn.compareTo("Smoking")==0||fn.compareTo("Number of Beds")==0)
		{
			System.out.println("Cannot update standard features!");
			return;
		}
			
		/**
		 * # Finding feature entry in the array
		 */
		for (int i=0; i<rf.getArray().size(); i++) {
			Feature ff = rf.getArray().get(i);
			if (ff.getName().compareTo(fn) == 0) {
				found = true; index = i;
				System.out.println("Enter the new status/quantity:");
				String ss = sc.nextLine();
				
				/**
				 * # throw exception if new price is the same as before
				 */
				if (ss.compareTo(ff.getStatus())==0)
					throw new ArrayException("Status/Quantity is the same!!");
				
				/**
				 * # updating the price
				 */
				ff.setStatus(ss);
				return;
			}//end if
		}//end for
		
		/**
		 * # throw exception if feature entry not found
		 */
		if (!found) throw new ArrayException("No such additional feature exists!");
	}
	
//============================================================================================================================================		
	/**
	 * Resets array list containing room features that
	 * are not core features to default (cleared);
	 * If array list is empty, error message is displayed;
	 * If array list is not empty, array list is cleared;
	 */
	
	public void resetArray() {
		if (rf.getArray().size()==0) {
			System.out.println("- No additional room features!");
			return;
		}
		
		rf.getArray().clear();
		System.out.println("- Room Features reset to default!");
		
	}
	
}
