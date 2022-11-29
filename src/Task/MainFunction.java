package Task;

import java.io.IOException;
import java.util.Scanner;



public class MainFunction {

	
static void menueFunction() {
			
			System.out.println("____________________________________________");
			
			System.out.println("Select one of the options:");
			System.out.println("1.Get Request and write file ");
			System.out.println("2.Search ");
			System.out.println("3.Find a string word ");
			
			System.out.println("____________________________________________");
		}
	
	
		// TODO Auto-generated method stub
		 public static void main(String[] args) throws IOException, InterruptedException {
			 Scanner sc = new Scanner(System.in);
			 do {
				 menueFunction();
					
					int Menue = sc.nextInt();
					switch(Menue) {
					case 1:
						
						GetRequest userRequest=new GetRequest();
						 userRequest.GetRequestFunction();

						break;
					case 2:
						
						 SrearchWord searchObj=new SrearchWord();
						 searchObj.searchForName();
					
						break;
					
					case 3:
						
						FindingWordFromFile findObj=new FindingWordFromFile();
						 findObj.FindingWordFromFileMethod();
					
						break;
					
				}
					}while(true);
		 }}
		
