package day2;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.Test;



import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;


/*
 	Post req body using Hashmap
 	Post req body creation using org.json
 	post req body creation using POJO (Plain Old Java Object)
 	Post req body using external JSON file 
 */


public class PostRequestBody {
	
	//@Test(priority=1)
	void testPostUsingHashMap() {
		
		HashMap data = new HashMap();
		data.put("name", "Scott");
		data.put("location", "France");
		data.put("phone", "12345");
		
		String courseArr[] = {"C","C++"};
		data.put("courses", courseArr);
		
		given()
			.contentType("application/json")
			.body(data)
		.when()
			.post("http://localhost:3000/student")
			
		.then()
			.statusCode(201)
			.body("name", equalTo("Scott"))
			.body("location", equalTo("France"))
			.body("phone", equalTo("123456"))
			.body("courses[0]", equalTo("C"))
			.body("courses[1]", equalTo("C++"))
			.header("Content-Type","application/json; charset=utf-8")
			.log().all();
			
	}
	
	//@Test(priority=2)
	void testPOSTUsingJSONObj() throws JSONException {
		
		JSONObject data = new JSONObject();
		data.put("name", "Scott");
		data.put("location", "France");
		data.put("phone", "12345");
		
		String courseArr[] = {"C","C++"};
		data.put("courses", courseArr);
		
		given()
			.contentType("application/json")
			.body(data.toString())
		.when()
			.post("http://localhost:3000/student")
			
		.then()
			.statusCode(201)
			.body("name", equalTo("Scott"))
			.body("location", equalTo("France"))
			.body("phone", equalTo("123456"))
			.body("courses[0]", equalTo("C"))
			.body("courses[1]", equalTo("C++"))
			.header("Content-Type","application/json; charset=utf-8")
			.log().all();
	}
	
	//@Test(priority=3)
	void testPostUsingPOJO() throws JSONException {
		
		POJORequest data = new POJORequest();
		
		data.setName("Scott");
		data.setLocation("France");
		data.setPhone("12345");
		
		String courseArr[] = {"C","C++"};
		data.setCourses(courseArr);
		
		given()
			.contentType("application/json")
			.body(data)
		.when()
			.post("http://localhost:3000/student")
			
		.then()
			.statusCode(201)
			.body("name", equalTo("Scott"))
			.body("location", equalTo("France"))
			.body("phone", equalTo("123456"))
			.body("courses[0]", equalTo("C"))
			.body("courses[1]", equalTo("C++"))
			.header("Content-Type","application/json; charset=utf-8")
			.log().all();
	}
	
	@Test(priority=4)
	void testPostExtJSON() throws JSONException, FileNotFoundException {
		
		File f = new File(".\\body.json");
		FileReader fr = new FileReader(f);
		JSONTokener jt = new JSONTokener(fr);
		JSONObject data = new JSONObject(jt);
		
		given()
			.contentType("application/json")
			.body(data.toString())
		.when()
			.post("http://localhost:3000/student")
			
		.then()
			.statusCode(201)
			.body("name", equalTo("Scott"))
			.body("location", equalTo("France"))
			.body("phone", equalTo("123456"))
			.body("courses[0]", equalTo("C"))
			.body("courses[1]", equalTo("C++"))
			.header("Content-Type","application/json; charset=utf-8")
			.log().all();
	}
	
	
}
