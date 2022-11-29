package Task;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;




public class GetRequest {

	 public static void main(String[] args) throws IOException, InterruptedException {

	        HttpClient client = HttpClient.newHttpClient();
	        HttpRequest request = HttpRequest.newBuilder()
	                .uri(URI.create("https://api.genderize.io/?name=luc"))
	                .build();

	        HttpResponse<String> response = client.send(request,
	                HttpResponse.BodyHandlers.ofString());
	        String tryDataObject = response.body();
	      System.out.println( response.body());
	      
	      try {
	        	FileWriter file = new FileWriter("TaskFile.txt"); {
	        		file.write(tryDataObject.toString());
	        		file.close();
	        }
	        }
	        	catch (IOException e) {
	            e.printStackTrace();
	        }
	        System.out.println("The file created");
	           
	    
	        	
	    }
	}

