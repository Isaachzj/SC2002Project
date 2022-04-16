package reservation;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

import days_date_time.LengthOfStay;
import enumeration.AvailStatus;

import java.time.format.DateTimeFormatter;

import room.Room;
import guest.Guest;
import guest.TextGuest;


public class TextReservation {
	public static final String SEPARATOR = "~";
	
	/**
	 * This class is used for the purposes of serialization and deserialization
	 */

    // READING
	public static ArrayList<Reservation> readReservations(String filename, ArrayList<Room> room, ArrayList<ArrayList<Guest>> guestList) throws IOException {
		// read String from text file
		ArrayList stringArray = (ArrayList)read(filename);
		ArrayList alr = new ArrayList() ;// to store Guests data

        for (int i = 0 ; i < stringArray.size() ; i++) {
				String st = (String)stringArray.get(i);
				// get individual 'fields' of the string separated by SEPARATOR
				StringTokenizer star = new StringTokenizer(st , SEPARATOR);	// pass in the string to the string tokenizer using delimiter ","

				
				//tokens
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd   |   HH:mm"); //create formatter
				
				LocalDateTime checkInDateTime;
				if (i<5) {checkInDateTime = LocalDateTime.now();} //Those reservations that have checked in will check in upon running program
				else {checkInDateTime = LocalDateTime.now().plusDays(7);}//reservations not checked in will check in a week later from running program
				
				LocalDateTime  checkOutDateTime = checkInDateTime.plusDays(5); 
				long numOfWeekday = LengthOfStay.calcWeekDays(checkInDateTime.toLocalDate(), checkOutDateTime.toLocalDate()); //string to Long	
				long numOfWeekend = LengthOfStay.calcWeekEnds(checkInDateTime.toLocalDate(), checkOutDateTime.toLocalDate()); //string to Long
				int numOfGuest = Integer.parseInt(star.nextToken().trim()); //string to Integer
						
				//LocalDateTime.parse(star.nextToken().trim(), formatter)
				//Long.parseLong(star.nextToken().trim())
				// create Guest object from file data
				Reservation reservation = new Reservation(room.get(i), checkInDateTime, checkOutDateTime, numOfWeekday, numOfWeekend, numOfGuest);
				
				//set guest list in reservation
				reservation.setGuestList(guestList.get(i));
				
				//setting the reservationDetails attribute of each guest
				for (int y=0; y<guestList.get(i).size(); y++) {
					Guest curGuest = guestList.get(i).get(y);
					curGuest.setReservation(reservation);
				}
				
				//Assign reservation object to room
				room.get(i).setReservation(reservation);
				
				if(i<5) { //Last 3 reservations are only reserved (not checked in)
					//change avail status to OCCUPIED for those checked in
					room.get(i).setAvail(AvailStatus.OCCUPIED);
				}
				else {//Rest of rooms will be reserved since not checked in
					room.get(i).setAvail(AvailStatus.RESERVED);
				}
				
				// add to reservation list
				alr.add(reservation);
			}
			return alr ;
	}

	  /** Read the contents of the given file. */
	  public static List read(String fileName) throws IOException {
		List data = new ArrayList() ;
	    Scanner scanner = new Scanner(new FileInputStream(fileName));
	    try {
	      while (scanner.hasNextLine()){
	        data.add(scanner.nextLine());
	      }
	    }
	    finally{
	      scanner.close();
	    }
	    return data;
	  }	
	
	
	
	
	

	
	
	
	  // SAVING
	public static void saveReservations(String reservationFileName, List al) throws IOException { //List is the list of guest objects (Hotel guest list)
			List alw = new ArrayList() ;// to store Guest data
			//String file1 = "C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\guests";
			//String file2 = "C:\\Users\\sharo\\OneDrive - Nanyang Technological University\\Documents\\GitHub\\SC2002Project\\the_project\\src\\serialize_deserialize\\guests1";
			//String[] stringray = {file1, file2};
			
	        for (int i = 0 ; i < al.size() ; i++) {
	        		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd   |   HH:mm"); //create formatter
	        		
	        		Reservation reservation = (Reservation)al.get(i);
					StringBuilder st =  new StringBuilder() ;
					st.append(reservation.getNumOfGuest()); //int type don't need to trim
					alw.add(st.toString()) ;
					
				}
				write(reservationFileName,alw);
		}

	  /** Write fixed content to the given file. */
	  public static void write(String fileName, List data) throws IOException  {
	    PrintWriter out = new PrintWriter(new FileWriter(fileName));
	
	    try {
			for (int i =0; i < data.size() ; i++) {
	      		out.println((String)data.get(i));
			}
	    }
	    finally {
	      out.close();
	    }
	  }

}

	  
	  
	  
	  
	  
