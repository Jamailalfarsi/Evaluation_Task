package Task;

import java.io.IOException;
import java.util.Scanner;



public class MainFunction {

	
static void menueFunction() {
			
			System.out.println("____________________________________________");
			
			System.out.println("Select one of the options:");
			System.out.println("1.Get Request and write file ");
			System.out.println("2.Search ");
			
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
						
						 SrearchString searchObj=new SrearchString();
						 searchObj.searchForName();
					
						break;
					
					
					
				}
					}while(true);
		 }}
		
