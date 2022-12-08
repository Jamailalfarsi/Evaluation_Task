package Task;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class SearchWordPdf {

	public void searchFunction2() throws IOException {
		Scanner sc1 = new Scanner(System.in);
		// creating an ArrayList from user input
		List<String> userInputs = new ArrayList<>();

		Set<String> uniqueWords = new HashSet<>();

		boolean flag = true;

		do {
			System.out.println("Enter the word to be found");
			String word = sc1.next();
			userInputs.add(word);
			System.out.println("press 1 to continue , press 0 to exit");
			int exitInput = sc1.nextInt();
			if (exitInput == 0) {
				flag = false;
			}
		} while (flag);

		System.out.println("list of all words : " + userInputs);

		for (String inputObj : userInputs) {
			String[] words = null;
			String s;
			int count = 0;
			FileReader fr = new FileReader("TaskFile.pdf"); // Creation of File Reader object
			BufferedReader br = new BufferedReader(fr); // Creation of BufferedReader object


			while ((s = br.readLine()) != null) // Reading Content from the file
			{
				s = s.replaceAll("\\W", " ");
				words = s.split(" "); // Split the word using space
				// System.out.println(s);
				for (String wd : words) {
					if (wd.equals(inputObj)) // Search for the given word
					{
						count++; // If Present increase the count by one
					}
				}
			}
			if (count == 1) // Check for count not equal to zero
			{
				System.out.println(" The given word ( " + inputObj + " ) is unique.");
				uniqueWords.add(inputObj);
				Path temp = Files.move 
				       (Paths.get("C:\\Users\\user021\\Desktop\\TaskFile.pdf"),  
				       Paths.get("C:\\Users\\user021\\Desktop\\NewFile\\TaskFile2.pdf")); 
				  
				       if(temp != null) 
				       { 
				           System.out.println("File renamed and moved successfully"); 
				       } 
			} else {
				System.out.println("The given word ( " + inputObj + " ) is not present in the file");
			}
			
			
			fr.close();
		}
	}
}
