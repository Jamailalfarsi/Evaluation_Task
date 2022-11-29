package Task;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FindingWordFromFile {

	public void FindingWordFromFileMethod()throws IOException,FileNotFoundException {
		//public static void main(String args[]) throws IOException , FileNotFoundException {	 
		 System.out.println("Enter the path to folder to search for files");
	      Scanner s1 = new Scanner(System.in);
	      String folderPath = s1.next();
	      File folder = new File(folderPath);
	      
	      if (folder.isDirectory()) {
	       File[] listOfFiles = folder.listFiles();
	         if (listOfFiles.length < 1)System.out.println( "There is no File inside Folder");
	         
	         else System.out.println("List of Files & Folder");
	         for (File file : listOfFiles) {
	            if(!file.isDirectory())System.out.println(file.getCanonicalPath().toString());
	          //Reading the word to be found from the user
	  	      Scanner sc1 = new Scanner(System.in);
	  	      System.out.println("*******************************");
	  	      System.out.println("Enter the word to be found");
	  	      String word = sc1.next();
	  	      boolean flag = false;
	  	      int count = 0;
	  	      System.out.println("Contents of the line");
	  	      //Reading the contents of the file
	  	     // Scanner sc2 = new Scanner(new FileInputStream("C:\\Users\\user021\\eclipse-workspace\\Jamail_course_Repo\\src\\JSONFile.txt"));
	  	      Scanner sc2 = new Scanner(new FileInputStream("C:\\Users\\user021\\eclipse-workspace\\Jamail_course_Repo\\src\\JSONFile.txt"));
	  	      while(sc2.hasNextLine()) {
	  	         String line = sc2.nextLine();
	  	         System.out.println(line);
	  	         if(line.indexOf(word)!=-1) {
	  	           flag = true;
	  	           count = count+1;
	  	         }
	  	      }
	  	      if(flag) {
	  	         System.out.println("File contains the specified word");
	  	         System.out.println("Number of occurrences is: "+count);
	  	      } else {
	  	         System.out.println("File does not contain the specified word");
	  	      }
	         } 
	      } 
	      else System.out .println("There is no Folder @ given path :" + folderPath);
		 
	     
	         
	   }
	}