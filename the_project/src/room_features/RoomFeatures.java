package room_features;
import java.util.ArrayList;
import enumeration.TypeOfBed;
import enumeration.ViewType;
import list_methods.*;

//Assumes all rooms of the same type share the exact same set of features
public class RoomFeatures {
	/**
	 * # Core Features (5)
	 */
	/**
	 * type of bed in this room (enumerations; SINGLE, DOUBLE, DELUXE, VIPSUITE); 
	 */
	private TypeOfBed bedType;
	/**
	 * type of view in this room (enumerations; STANDARD, OCEAN, CITY);
	 */
	private ViewType viewType;	
	/**
	 * number of beds in this room;
	 */
	private int numOfBed;
	/**
	 * availability of wifi in this room;
	 */
	private boolean wifi;
	/**
	 * availability of smoke out in this room;
	 */
	private boolean smokeOut;
	/**
	 * # Additional Features
	 */
	/**
	 * array list containing feature names and status of this room;
	 */
	private ArrayList<Feature> featureList;
	/**
	 * number of features in this room;
	 */
	private int numOfFeatures;
	
	
	/**
	 * # Constructor
	 */
	/**
	 * Instantiates 
	 * @param bedType
	 * @param viewType
	 * @param numOfBed
	 * @param wifi
	 * @param smokeOut
	 */
	public RoomFeatures(TypeOfBed bedType, ViewType viewType, int numOfBed, boolean wifi, boolean smokeOut) {
		this.featureList = new ArrayList<Feature>();
		this.bedType = bedType;
		this.viewType = viewType;		
		this.numOfBed = numOfBed;
		this.wifi = wifi;
		this.smokeOut = smokeOut;
		this.numOfFeatures = 5;
	}
	
	/**
	 * # get methods
	 */
	/**
	 * gets type of bed in this room;
	 * @return bedType of this room: SINGLE, DOUBLE, DELUXE, VIPSUITE;
	 */
	protected TypeOfBed getBedType() {return this.bedType;}
	/**
	 * gets type of view of this room;
	 * @return viewType of this room: STANDARD, OCEAN, CITY;
	 */
	protected ViewType getViewType() {return this.viewType;}
	/**
	 * gets number of beds in this room;
	 * @return numOfBed in this room;
	 */
	protected int getNumOfBed() {return this.numOfBed;}
	/**
	 * gets wifi availability of this room;
	 * @return wifi availability of this room: true, false;
	 */
	protected boolean getWifi() {return this.wifi;}
	/**
	 * gets availability of smoke out in this room;
	 * @return availability of smoke out in this room: true, false;
	 */
	protected boolean getSmokeOut() {return this.smokeOut;}
	/**
	 * gets array list containing additional features names and status in this room;
	 * @return array list containing additional features details;
	 */
	protected ArrayList<Feature> getArray() {return this.featureList;}
	/**
	 * gets number of features in this room;
	 * @return number of additional features in this room;
	 */
	protected int getNumFeatures() {return numOfFeatures;}
	
	/**
	 * # set methods
	 */
	/**
	 * updates number of features of this room;
	 * @param numOfFeatures variable containing current number of features in this room;
	 */
	protected void setNumFeatures(int numOfFeatures) {this.numOfFeatures = numOfFeatures;}
	
	
	/**
	 * # methods
	 */
	/**
	 * Adds new non-currently existing feature to this feature list;
	 * Creates a new FeatureManipulator object and instantiates it using argument RoomFeatures object;
	 * New Feature object is created and added into this feature list, number of features is incremented by 1;
	 * If feature already exists, error message is displayed.
	 * @throws ArrayException
	 */
	public void addFeatures() throws ArrayException{
		FeatureManipulator fm = new FeatureManipulator(this);
		fm.addEntry();
	}
	
	/**
	 * Removes existing non-core feature from this feature list;
	 * Creates a new FeatureManipulator object and instantiates it using argument RoomFeatures object;
	 * Feature object is removed from this feature list, number of features is incremented by 1;
	 * If feature does not exist or is a core feature, error message is displayed;
	 * @throws ArrayException
	 */
	public void removeFeatures() throws ArrayException{
		FeatureManipulator fm = new FeatureManipulator(this);
		fm.removeEntry();
	}
	/**
	 * Updates status/quantity of existing feature;
	 * Creates a new FeatureManipulator object and instantiates it using argument RoomFeatures object;
	 * If existing feature found and input feature_name is a core feature or feature not found, 
	 * error message is displayed;
	 * If found and feature_name is not a core feature, a message displayed queues the user 
	 * for new status input for this feature;
	 * @throws ArrayException
	 */
	public void updateFeatures() throws ArrayException{
		FeatureManipulator fm = new FeatureManipulator(this);
		fm.set();
	}
	
	/**
	 * Prints all core and additional features and feature details;
	 * Done by creating new DisplayFeatures object and instantiates using argument RoomFeatures object; 
	 * then calling printAll() function in DisplayFeatures object;
	 */
	public void info() {
		DisplayFeatures df = new DisplayFeatures(this);
		df.printAll();
	}
}
