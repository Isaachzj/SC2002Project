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

/**
 * This class is used for the purpose of serialization and deserialization
 * 
 * @author Isaac, YanKai, Tomoki, Davis, WenLu
 *
 */
public class TextIdentity {
	
/** 
 * This is the separator that will be used to separate text information of the various object attributes in the serialization process
 */	
public static final String SEPARATOR = "~";

	// READING
	/**
	 * This method is used to return an array of Identity objects and used in the deserialisation process
	 * @param fileName is the file that contains the information for the Identity objects
	 * @return alr is the array containing all Identity objects belonging to the Guests in a particular reservation
	 * @throws IOException which is a checked exception
	 */
	public static ArrayList<Identity> readIDs(String fileName) throws IOException {
		// read String from text file
		ArrayList stringArray = (ArrayList)read(fileName);
		ArrayList<Identity> alr = new ArrayList<Identity>() ;// to store ID data
	
	    for (int i = 0 ; i < stringArray.size() ; i++) {
				String st = (String)stringArray.get(i);
				// get individual 'fields' of the string separated by SEPARATOR
				StringTokenizer star = new StringTokenizer(st , SEPARATOR);	// pass in the string to the string tokenizer using delimiter ","
	
				//tokens
				String  idNumber = star.nextToken().trim();	
				TypeOfID  idType = TypeOfID.values()[Integer.parseInt(star.nextToken().trim())]; //string to int to enum
	
				// create Guest object from file data (Reservation attribute set to null first
				Identity id = new Identity(idNumber, idType);
				// add to Professors list
				alr.add(id) ;
			}
			return alr ;
	}
	
	  /** 
	   * Read the contents of the given file. 
	   * @param fileName is the file that contains the information for the Identity objects
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
	    *  @param fileName is the file that will contain the information for the Identity objects
	    *  @param al is the array of Identity objects being passed in
	    *  @throws IOException which is a checked exception
	    */
		public static void saveIDs(String fileName, List al) throws IOException { //List is the list of guest objects (Hotel guest list)
			List alw = new ArrayList() ;// to store Guest data
		
		    for (int i = 0 ; i < al.size() ; i++) {
					Identity id = ((Guest)al.get(i)).getIdentity();
					StringBuilder st =  new StringBuilder() ;
					st.append(id.getIdNumber().trim());
					
					st.append(SEPARATOR);
					
					st.append(Integer.toString(id.getIdType().ordinal()).trim()); //convert enum index (int) to string then trim						
						alw.add(st.toString()) ;
					}
					write(fileName,alw);
			}
		
		  /** 
		   * Write fixed content to the given file. 
		   * @param data is the list containing the Identity objects data in String format
		   * @param fileName is the file that will contain the information for the Identity objects
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


