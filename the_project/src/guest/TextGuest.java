package guest;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

import enumeration.*;
import reservation.Reservation;

/**
 * This class is used for the purpose of serialization and deserialization
 * 
 * @author Isaac, YanKai, Tomoki, Davis, WenLu
 *
 */

public class TextGuest {
	/** 
	 * This is the separator that will be used to separate text information of the various object attributes in the serialization process
	 */
	public static final String SEPARATOR = "~";
	
	// READING
	/**
	 * This method is used to return an array of Guest objects and used in the deserialisation process
	 * @param fileName is the file that contains the information for the Guest objects
	 * @param ID is the array of Identity objects belonging to the Guests in this reservation
	 * @param CCD is the array containing all CreditCardInfo objects belonging to the Guests in this reservation
	 * @param CD is the array containing all ContactDetails objects belonging to the Guests in this reservation
	 * @returns returns the array of Guest objects in a particular reservation
	 * @throws IOException which is a checked exception
	 */
	public static ArrayList<Guest> readGuests(String filename, ArrayList<Identity> ID, ArrayList<CreditCardInfo> CCD, ArrayList<ContactDetails> CD) throws IOException {
		// read String from text file
		ArrayList stringArray = (ArrayList)read(filename);
		ArrayList alr = new ArrayList() ;// to store Guests data
	
	    for (int i = 0 ; i < stringArray.size() ; i++) {
				String st = (String)stringArray.get(i);
				// get individual 'fields' of the string separated by SEPARATOR
				StringTokenizer star = new StringTokenizer(st , SEPARATOR);	// pass in the string to the string tokenizer using delimiter ","
	
				//tokens
				String  name = star.nextToken().trim();	
				String  nationality = star.nextToken().trim();	
				TypeOfGender  gender = TypeOfGender.values()[Integer.parseInt(star.nextToken().trim())]; //string to int to enum	
				
				// create Guest object from file data 
				Guest guest = new Guest(name, nationality, gender, ID.get(i), CCD.get(i), CD.get(i), null);
				// add to Guest list
				alr.add(guest) ;
			}
			return alr ;
	}
	
	  /** 
	   * Read the contents of the given file. 
	   * @param fileName is the file that contains the information for the Guest object
	   * @return data is the data from the text file in an ArrayList
	   * @throws IOException which is a checked exception
	   * */
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
	   /**
	    *  This method is used to save the serialize the objects into a text file
	    *  @param fileName is the file that will contain the information for the Guest object
	    *  @param al is the array of Guest objects being passed in
	    */
		public static void saveGuests(String guestFilename, List al) throws IOException { //List is the list of guest objects (Hotel guest list)
			List alw = new ArrayList() ;// to store Guest data
		
		    for (int i = 0 ; i < al.size() ; i++) {
					Guest guest = (Guest)al.get(i);
					StringBuilder st =  new StringBuilder() ;
					st.append(guest.getName().trim());
					st.append(SEPARATOR);
					st.append(guest.getNationality().trim());
					st.append(SEPARATOR);
					st.append(Integer.toString(guest.getGender().ordinal()).trim()); //convert enum index (int) to string then trim
					
					//save identity, creditCardInfo, ContactDetails too			
						alw.add(st.toString()) ;
					}
					write(guestFilename,alw);
			}
		
		  /** 
		   * Write fixed content to the given file. 
		   * @param data is the list containing the Guest objects data in String format
		   * @param fileName is the file that will contain the information for the Guest object
		   * */
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

