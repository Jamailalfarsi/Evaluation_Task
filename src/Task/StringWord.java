package Task;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class StringWord {

	public void searchFunction() throws IOException {
		Scanner sc1 = new Scanner(System.in);
		// creating an ArrayList from user input
		ArrayList<String> userInputs = new ArrayList<String>(5);

		Set<String> userObject = new HashSet<>();

		boolean flag = true;
		while (flag) {
			System.out.println("Enter the word to be found");
			String word = sc1.next();
			userInputs.add(word);

			System.out.println("press 1 to continue , press 0 to exit");
			int exitInput = sc1.nextInt();

			// String v = Integer.toString(exitInput);

			if (exitInput == 0) {

				flag = false;
			}
			

		}

	}
}

// boolean flag = false;
// int count = 0;
// System.out.println("Contents of the line");
// Reading the contents of the file
// Scanner sc2 = new Scanner(new
// FileInputStream("C:\\Users\\user021\\eclipse-workspace\\Jamail_course_Repo\\src\\JSONFile.txt"));
// while(sc2.hasNextLine()) {
// String line = sc2.nextLine();
// System.out.println(line);
// if(line.indexOf(word)!=-1) {
// flag = true;
// count = count+1;
// }
// }
// if(flag) {
// System.out.println("File contains the specified word");
// System.out.println("Number of occurrences is: "+count);
// } else {
// System.out.println("File does not contain the specified word");
// }
// }
//}
