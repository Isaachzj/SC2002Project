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
import java.time.format.DateTimeFormatter;

import room.Room;
import guest.Guest;
import guest.TextGuest;


public class TextReservation {
	public static final String SEPARATOR = "~";

    // READING
	public static ArrayList readReservations(String filename, Room room, ArrayList<Guest> guestList) throws IOException {
		// read String from text file
		ArrayList stringArray = (ArrayList)read(filename);
		ArrayList alr = new ArrayList() ;// to store Guests data

        for (int i = 0 ; i < stringArray.size() ; i++) {
				String st = (String)stringArray.get(i);
				// get individual 'fields' of the string separated by SEPARATOR
				StringTokenizer star = new StringTokenizer(st , SEPARATOR);	// pass in the string to the string tokenizer using delimiter ","

				
				//tokens
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd   |   HH:mm"); //create formatter
				LocalDateTime  checkInDateTime = LocalDateTime.parse(star.nextToken().trim(), formatter); //string to LocalDateTime
				LocalDateTime  checkOutDateTime = LocalDateTime.parse(star.nextToken().trim(), formatter); //string to LocalDateTime
				long numOfWeekday = Long.parseLong(star.nextToken().trim()); //string to Long	
				long numOfWeekend = Long.parseLong(star.nextToken().trim()); //string to Long
				int numOfGuest = Integer.parseInt(star.nextToken().trim()); //string to Integer
						
				
				// create Guest object from file data (Reservation attribute set to null first
				Reservation reservation = new Reservation(room, checkInDateTime, checkOutDateTime, numOfWeekday, numOfWeekend, numOfGuest);
				reservation.setGuestList(guestList);
				
				// add to reservation list
				alr.add(reservation) ;
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
					st.append(reservation.getCheckInDateTime().format(formatter).trim()); //LocalDateTime to string
					st.append(SEPARATOR);
					st.append(reservation.getCheckOutDateTime().format(formatter).trim()); //LocalDateTime to string
					st.append(SEPARATOR);
					st.append(Long.toString(reservation.getNumOfWeekday()).trim()); 
					st.append(Long.toString(reservation.getNumOfWeekend()).trim()); //This may cause error
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



	  
	  
	  
	  
	  
	  
	public static void main(String[] aArgs)  {
	    	GuestText gt = new GuestText();
	    	String filename = "C:\\Users\\sharo\\eclipse-workspace\\Serializer and Deserializer\\src\\codes\\professor.txt" ;
			try {
				// read file containing Professor records.
				ArrayList al = gt.readGuests(filename) ;
				for (int i = 0 ; i < al.size() ; i++) {
						Professor prof = (Professor)al.get(i);
						System.out.println("Name " + prof.getName() );
						System.out.println("Contact " + prof.getContact() );
				}
				Professor p1 = new Professor("Joseph","jos@ntu.edu.sg",67909999);
				// al is an array list containing Professor objs
				al.add(p1);
				// write Professor record/s to file.
				TextDB.saveProfessors(filename, al);
			}
			catch (IOException e) {
				System.out.println("IOException > " + e.getMessage());
			}
	}
}
