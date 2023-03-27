package day7;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class Authentications {
	
	//@Test(priority=1)
	void testBasicAuthentications() {
		
		System.out.println("testBasicAuthentications");
		given()
			.auth().basic("postman", "password")
		.when()
			.get("https://postman-echo.com/basic-auth")
		.then()
			.statusCode(200)
			.body("authenticated", equalTo(true))
			.log()
			.all();
	}
	
	//@Test(priority=2)
	void testDiggestAuthentications() {
		
		System.out.println("testDiggestAuthentications");
		given()
			.auth().digest("postman", "password")
		.when()
			.get("https://postman-echo.com/basic-auth")
		.then()
			.statusCode(200)
			.body("authenticated", equalTo(true))
			.log()
			.all();
	}
	
	//@Test(priority=3)
	void testPreemptiveAuthentications() {
		
		System.out.println("testPreemptiveAuthentications");
		given()
			.auth().preemptive().basic("postman", "password")
		.when()
			.get("https://postman-echo.com/basic-auth")
		.then()
			.statusCode(200)
			.body("authenticated", equalTo(true))
			.log()
			.all();
	}
	
	//@Test(priority=4)
	void testBarrerAuth() {
		
		System.out.println("Barrer Token");
		
		String barrer_Token = "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";
		given()
			.headers("Authroization","Bearer "+barrer_Token)
			
		.when()
			.get("https://api.github.com/users/repos")
		.then()
			.statusCode(200)
			.log().all();
	}
	
	void testOauth() {
		
		given()
			.auth().oauth("consumerKey", "consumerSecret", "accessToken", "tokenSecret")
		.when()
			.get("url")
		.then()
			.statusCode(200)
			.log().all();
	}
	
	

}
