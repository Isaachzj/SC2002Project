package room_features;

import java.util.Scanner;

import list_methods.*;

public class FeatureManipulator implements AddStandard,RemoveStandard,Set, Reset {
	private RoomFeatures rf;
	
	public FeatureManipulator(RoomFeatures rf) {
		this.rf = rf;
	}
	
//============================================================================================================================================	
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
	public void removeEntry() throws ArrayException{
		boolean found = false;
		int index = 0;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Feature name:");
		String fn = sc.nextLine();
		
		//Check if feature_name is a core feature (cannot remove this)
		if (fn.compareTo("Bed")==0||fn.compareTo("View")==0||fn.compareTo("Wifi")==0||fn.compareTo("Smoking")==0||fn.compareTo("Number of Beds")==0)
		{
			System.out.println("Cannot remove core feature!");
			return;
		}
	
		//Finding feature in array of additional features
		for (int i=0; i<rf.getArray().size(); i++) {
			Feature ff = rf.getArray().get(i);
			if (ff.getName().compareTo(fn) == 0) {
				found = true; index = i;	
				break;
			}//end if
		}//end for
		
		//Throw exception if no such feature exists (Catch outside function and continue to reiterate while loop)
		if (!found) throw new ArrayException("No such additional feature exists!!");
		
		//Removing food
		rf.getArray().remove(index);
		rf.setNumFeatures(rf.getNumFeatures()-1);
		return;
	}
	
//============================================================================================================================================	
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
			
		//Finding feature entry in the array
		for (int i=0; i<rf.getArray().size(); i++) {
			Feature ff = rf.getArray().get(i);
			if (ff.getName().compareTo(fn) == 0) {
				found = true; index = i;
				System.out.println("Enter the new status/quantity:");
				String ss = sc.nextLine();
				
				//throw exception if new price is the same as before
				if (ss.compareTo(ff.getStatus())==0)
					throw new ArrayException("Status/Quantity is the same!!");
				
				//updating the price
				ff.setStatus(ss);
				return;
			}//end if
		}//end for
		
		//throw exception if feature entry not found
		if (!found) throw new ArrayException("No such additional feature exists!");
	}
	
//============================================================================================================================================		
	public void resetArray() {
		if (rf.getArray().size()==0) {
			System.out.println("- No additional room features!");
			return;
		}
		
		rf.getArray().clear();
		System.out.println("- Room Features reset to default!");
		
	}
	
}
