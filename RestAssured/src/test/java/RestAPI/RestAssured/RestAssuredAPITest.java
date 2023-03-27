package RestAPI.RestAssured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssuredAPITest {
	
	@Test
	public void getBookDetails() {
		
		// Specify the base URL to the RESTful web service 
		RestAssured.baseURI =  "https://demoqa.com/BookStore/v1/Books"; 
		
		// Get the RequestSpecification of the request to be sent to the server. 
		RequestSpecification httpReq = RestAssured.given();
		
		Response response = httpReq.request(Method.GET,"");
		// Print the status and message body of the response received from the server 
		System.out.println("Status received => " + response.getStatusLine()); 
		System.out.println("Response=>" + response.prettyPrint());
	}

}
