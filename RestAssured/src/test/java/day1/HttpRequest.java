package day1;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;


/*
 	given()
 		content type, set cookies, add auth, add param, set header info 
 	When()
 		get, put, post, delete
 	then()
 		validate status code, extract response, extract headers cookies & Response body
 */
public class HttpRequest {
	
	int id;
	
	@Test(priority = 1)
	void getUser() {
		
		given()
		
		.when()
			.get("https://reqres.in/api/users?page=2")
		.then()
			.statusCode(200)
			.body("page",equalTo(2))
			.log().all();
	}
	
	@Test(priority=2)
	void createUser() {
		System.out.println("********Create Users ***********");
		HashMap data = new HashMap();
		data.put("name", "prasanna");
		data.put("job", "QA Manager");
		
		
		id = given()
			.contentType("application/json")
			.body(data)
			
		.when()
			.post("https://reqres.in/api/users")
			.jsonPath().getInt("id");
		
		/*.then()
			.statusCode(201)
			.log().all();
			*/
		System.out.println("********Create Users Ends ***********");
	}	
	
	@Test(priority=3,dependsOnMethods = {"createUser"})
	void updateUser() {
		System.out.println("********Update Users ***********");
		HashMap data = new HashMap();
		data.put("name", "prasanna");
		data.put("job", "QA Arch");
		
		
		given()
			.contentType("application/json")
			.body(data)
			
		.when()
			.post("https://reqres.in/api/users/"+id)
			.then()
			.statusCode(201)
			.log().all();
		System.out.println("********Update Users ends ***********");
	}
	
	@Test(priority=4)
	void deleteUser() {
		
		given()
		
		.when()
			.delete("https://reqres.in/api/users/"+id)
		.then()
			.statusCode(204)
			.log().all();
	}	

}
