package Task;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class SrearchWord {

	
	public void searchForName()throws IOException {
		   System.out.println("Please enter the name you would like to search for: ");
		    Scanner Sc = new Scanner(System.in);
		    String name = Sc.nextLine();

		    List<String> lines = Files.readAllLines(Paths.get("TaskFile.txt"));
		    for (String line : lines) {
		        if (line.contains(name)) {
		            System.out.println(line);
		        }
		        else {
		        	System.out.println("The file does not contain the word");
		    }
		        
	   } }
}
