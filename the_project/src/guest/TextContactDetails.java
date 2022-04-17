package guest;

import java.io.FileInputStream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * This class is used for the purpose of serialization and deserialization
 * 
 * @author Isaac, YanKai, Tomoki, Davis, WenLu
 *
 */
public class TextContactDetails {
	/** 
	 * This is the separator that will be used to separate text information of the various object attributes in the serialization process
	 */	
	public static final String SEPARATOR = "~";
	
	// READING
	/**
	 * This method is used to return an array of ContactDetails objects and used in the deserialisation process
	 * @param fileName is the file that contains the information for the ContactDetails objects
	 * @return alr is the array containing all ContactDetails objects belonging to the Guests in a particular reservation
	 * @throws IOException which is a checked exception
	 */
	public static ArrayList<ContactDetails> readCDs(String fileName) throws IOException {
		// read String from text file
		ArrayList stringArray = (ArrayList)read(fileName);
		ArrayList alr = new ArrayList() ;// to store Guests data
	
	    for (int i = 0 ; i < stringArray.size() ; i++) {
				String st = (String)stringArray.get(i);
				// get individual 'fields' of the string separated by SEPARATOR
				StringTokenizer star = new StringTokenizer(st , SEPARATOR);	// pass in the string to the string tokenizer using delimiter ","
	
				//tokens
				String  MN = star.nextToken().trim();	
				String  EA = star.nextToken().trim();	
				String  HA = star.nextToken().trim();
				String  country = star.nextToken().trim();
				
				// create Guest object from file data (Reservation attribute set to null first
				ContactDetails cd = new ContactDetails(MN, EA, HA, country);
				// add to Professors list
				alr.add(cd) ;
			}
			return alr ;
	}
	
	  /** 
	   * Read the contents of the given file. 
	   * @param fileName is the file that contains the information for the ContactDetails objects
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
	    *  @param fileName is the file that will contain the information for the ContactDetails objects
	    *  @param al which is the array of ContactDetails objects being passed in
	    *  @throws IOException which is a checked exception
	    */
		public static void saveCDs(String fileName, List al) throws IOException { //List is the list of guest objects (Hotel guest list)
				List alw = new ArrayList() ;// to store Guest data
		
		        for (int i = 0 ; i < al.size() ; i++) {
		        	ContactDetails cd = ((Guest)al.get(i)).getContacts();
						StringBuilder st =  new StringBuilder() ;
						st.append(cd.getMobileNumber().trim());
						st.append(SEPARATOR);
						st.append(cd.getEmailAddress().trim());
						st.append(SEPARATOR);
						st.append(cd.getHomeAddress().trim()); 
						st.append(SEPARATOR);
						st.append(cd.getCountry().trim()); 
				
						alw.add(st.toString()) ;
					}
					write(fileName,alw);
			}
		
		  /** 
		   * Write fixed content to the given file. 
		   * @param data is the list containing the ContactDetails objects data in String format
		   * @param fileName is the file that will contain the information for the ContactDetails objects
		   * @throws IOException which is a checked exception
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
