package Task;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
	public static void main(String[] args)
	        throws IOException
	    {
	        // initialize a string
	        String str = "ABC";
	        try {
	  
	            // attach a file to FileWriter
	            FileWriter fw
	                = new FileWriter("https://api.genderize.io/?name=luc/TextFile.txt");
	  
	            // read each character from string and write
	            // into FileWriter
	            for (int i = 0; i < str.length(); i++)
	                fw.write(str.charAt(i));
	  
	            System.out.println("Successfully written");
	  
	            // close the file
	            fw.close();
	        }
	        catch (Exception e) {
	            e.getStackTrace();
	        }
	    }
	}

