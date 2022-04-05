package room_features;
import java.util.ArrayList;
import enumeration.TypeOfBed;
import enumeration.ViewType;
import list_methods.*;

//Assumes all rooms of the same type share the exact same set of features
public class RoomFeatures {
	//Core Features (5)
	private TypeOfBed bedType;
	private ViewType viewType;	
	private int numOfBed;
	private boolean wifi;
	private boolean smokeOut;
	//Additional Features
	private ArrayList<Feature> featureList;
	//Number of Features
	private int numOfFeatures;
	
	// Constructor
	public RoomFeatures(TypeOfBed bedType, ViewType viewType, int numOfBed, boolean wifi, boolean smokeOut) {
		this.featureList = new ArrayList<Feature>();
		this.bedType = bedType;
		this.viewType = viewType;		
		this.numOfBed = numOfBed;
		this.wifi = wifi;
		this.smokeOut = smokeOut;
		this.numOfFeatures = 5;
	}
	
	// get methods
	protected TypeOfBed getBedType() {return this.bedType;}
	protected ViewType getViewType() {return this.viewType;}
	protected int getNumOfBed() {return this.numOfBed;}
	protected boolean getWifi() {return this.wifi;}
	protected boolean getSmokeOut() {return this.smokeOut;}
	protected ArrayList<Feature> getArray() {return this.featureList;}
	protected int getNumFeatures() {return numOfFeatures;}
	
	//set methods
	protected void setBedType(TypeOfBed bedType) {this.bedType = bedType;}
	protected void setViewType(ViewType viewType) {this.viewType = viewType;}
	protected void setNumOfBed(int numOfBed) {this.numOfBed = numOfBed;}
	protected void setWifi(boolean wifi) {this.wifi = wifi;}
	protected void setSmokeOut(boolean smokeOut) {this.smokeOut = smokeOut;}
	protected void setNumFeatures(int numOfFeatures) {this.numOfFeatures = numOfFeatures;}
	
	//Methods
	public void addFeatures() throws ArrayException{
		FeatureManipulator fm = new FeatureManipulator(this);
		fm.addList();
	}
	
	public void removeFeatures() throws ArrayException{
		FeatureManipulator fm = new FeatureManipulator(this);
		fm.removeEntry();
	}
	
	public void updateFeatures() throws ArrayException{
		FeatureManipulator fm = new FeatureManipulator(this);
		fm.set();
	}
	
	//print all features (info)
	public void info() {
		DisplayFeatures df = new DisplayFeatures(this);
		df.printAll();
	}
}
