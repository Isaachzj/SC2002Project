package guest;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TextContactDetails {
	public static final String SEPARATOR = "~";

    // READING
	public static ArrayList readCDs(String filename) throws IOException {
		// read String from text file
		ArrayList stringArray = (ArrayList)read(filename);
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
	public static void saveCDs(String cdFilename, List al) throws IOException { //List is the list of guest objects (Hotel guest list)
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
				write(cdFilename,alw);
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
