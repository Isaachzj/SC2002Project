package testing;

import enumeration.AvailStatus;
import enumeration.TypeOfBed;
import enumeration.TypeOfRoom;
import enumeration.ViewType;
import food_related.*;
import room_features.*;
import room_rate.*;
import list_methods.*;
import room.*;

public class TestRoom {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true) {
			try{
			SingleRoom ss = new SingleRoom(1, 1);
			DisplayRoom.info(ss);
			RoomFeatures rf = ss.getRoomFeatures();
			FeatureManipulator fm = new FeatureManipulator(rf);
			fm.addList();
			fm.addList();
			DisplayRoom.info(ss);
			fm.removeEntry();
			DisplayRoom.info(ss);
			fm.set();
			DisplayRoom.info(ss);
			}
			catch(ArrayException e) {System.out.println(e.getMessage());continue;}	
		}
	}
}