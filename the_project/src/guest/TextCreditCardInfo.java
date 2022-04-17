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

public class TextCreditCardInfo {
	/** 
	 * This is the separator that will be used to separate text information of the various object attributes in the serialization process
	 */
	public static final String SEPARATOR = "~";
	
	/**
	 * This method is used to return an array of CreditCardInfo objects and used in the deserialisation process
	 * @param fileName is the file that contains the information for the CreditCardInfo objects
	 * @return alr is the array containing all CreditCardInfo objects belonging to the Guests in a particular reservation
	 * @throws IOException which is a checked exception
	 */
	// READING
	public static ArrayList<CreditCardInfo> readCCIs(String filename) throws IOException {
		// read String from text file
		ArrayList stringArray = (ArrayList)read(filename);
		ArrayList alr = new ArrayList() ;// to store CCI data
	
	    for (int i = 0 ; i < stringArray.size() ; i++) {
				String st = (String)stringArray.get(i);
				// get individual 'fields' of the string separated by SEPARATOR
				StringTokenizer star = new StringTokenizer(st , SEPARATOR);	// pass in the string to the string tokenizer using delimiter ","
	
				//tokens
				String  CCN = star.nextToken().trim();	
				String  CCB = star.nextToken().trim();	
				String  CCE = star.nextToken().trim();		
				
				// create Guest object from file data (Reservation attribute set to null first
				CreditCardInfo cci = new CreditCardInfo(CCN, CCB, CCE);
				// add to Professors list
				alr.add(cci) ;
			}
			return alr ;
	}
	
	  /** 
	   * Read the contents of the given file. 
	   * @param fileName is the file that contains the information for the CreditCardInfo object
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
	    *  @param fileName is the file that will contain the information for the CreditCardInfo object
	    *  @param al is the array of CreditCardInfo objects being passed in
	    */
		public static void saveCCIs(String cciFileName, List al) throws IOException { 
			List alw = new ArrayList() ;// to store CCI data
		
		    for (int i = 0 ; i < al.size() ; i++) {
		    		CreditCardInfo cci = ((Guest)al.get(i)).getCreditCardDetails();
					StringBuilder st =  new StringBuilder() ;
					
					if (cci!=null) {
						st.append(cci.getCreditCardNum().trim());	
						st.append(SEPARATOR);
						st.append(cci.getCreditCardBank().trim());
						st.append(SEPARATOR);
						st.append(cci.getCreditCardExpiry().trim()); 
					}
					
					else { //For guests
						st.append("nil");
						st.append(SEPARATOR);
						st.append("nil");
						st.append(SEPARATOR);
						st.append("nil");	
						}
				
						alw.add(st.toString()) ;
					}
		        
					write(cciFileName,alw);
			}
		
		  /** 
		   * Write fixed content to the given file. 
		   * @param data is the list containing the CreditCardInfo objects data in String format
		   * @param fileName is the file that will contain the information for the CreditCardInfo object
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
