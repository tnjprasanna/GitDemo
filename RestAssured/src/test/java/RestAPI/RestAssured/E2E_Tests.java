package RestAPI.RestAssured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class E2E_Tests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String userID = "9b5f49ab-eea9-45f4-9d66-bcf56a531b85";
	     String userName = "TOOLSQA-Test";
	     String password = "Test@@123";
	     String baseUrl = "https://bookstore.toolsqa.com";
	     
	     RestAssured.baseURI = baseUrl;
	     
	     RequestSpecification request = RestAssured.given();
	     
	     request.header("Content-Type","application/json");
	     //Response response = request.body
	    		
	     

	}

}