package RestAPI.RestAssured;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class RestAssuredTestResponse {
	
	//@Test
	public void getBookDetails() {
		
		RestAssured.baseURI = "https://demoqa.com/BookStore/v1/Books";
		RequestSpecification httpRequest = RestAssured.given();
		
		Response response = httpRequest.get("test");
		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, 200);
	}
	
	//@Test
	public void IteratingHeaders() {
		
		RestAssured.baseURI = "https://demoqa.com/BookStore/v1/Books";
		RequestSpecification httpRequest = RestAssured.given();
		
		Response response = httpRequest.get();
		Headers allHeaders = response.headers();
		System.out.println("*****************************************");
		for(Header header : allHeaders) {
			
			System.out.println("Key: "+ header.getName() + "Value: " +header.getValue());
			
		}System.out.println("*****************************************\n");
		
	}
	
	@Test
	public void GetBookHeaders() {
		
		RestAssured.baseURI = "https://demoqa.com/BookStore/v1/Books";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.get("");
		
		String contentType = response.header("Content-Type");
		System.out.println("Content Type "+contentType);
		String serverType = response.header("Server");
		System.out.println("Server Type "+serverType);
		String acceptLanguage = response.header("Content-Encoding");
		System.out.println("Content Encoding "+acceptLanguage);
	}

}
