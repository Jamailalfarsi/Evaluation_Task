package Task;

import java.io.IOException;
import java.util.Scanner;



public class MainFunction {

	
static void menueFunction() {
			
			System.out.println("____________________________________________");
			
			System.out.println("Select one of the options:");
			System.out.println("1.Get Request and write txt file ");
			System.out.println("2.Search txt file ");
			System.out.println("3.Find word from txt file ");
			System.out.println("4.Final Solution for Search a string word in txt file ");
			System.out.println("5.Get Request for PDF file");
			System.out.println("6.Srearch word in PDF File");
			
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
						
                       case 4:
						
                    	   StringWord findObj1=new StringWord();
                    	   findObj1.searchFunction();
					
						break;
						
                       case 5:
   						
                    	   SimplePdfSearch findObj2=new SimplePdfSearch();
                    	   findObj2.GetRequestFunction2();
					
						break;
						
                       case 6:
      						
                    	   SearchWordPdf findObj3=new SearchWordPdf();
                    	   findObj3.searchFunction2();
					
						break;
						
                      
                      
					
					

					
				}
					}while(true);
		 }}
		
