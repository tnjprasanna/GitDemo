package day4;


import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.JSONException;
import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ParsingJSONResponseData {
	
	@Test(priority=1)
	void testJSONResponse() {
		
		given()
			.contentType(ContentType.JSON)
		.when()
			.get("http://localhost:3000/store")
		.then()
			.statusCode(200)
			.header("Content-Type","application/json; charset=utf-8")
			.body("book[3].title",equalTo("Lord of the Rings"));
			
	}
	
	@Test(priority=2)
	void testJSONResponseArray	() throws JSONException {
		
		Response res = given()
			.contentType(ContentType.JSON)
		.when()
			.get("http://localhost:3000/store");
		
		JSONObject jo = new JSONObject(res.toString());
		
		for(int i =0; i<jo.getJSONArray("book").length();i++) {
			String bookTitle = jo.getJSONArray("book").getJSONObject(i).get("title").toString();
			System.out.println(bookTitle);
		}
			
		/*	
		.then()
			.statusCode(200)
			.header("Content-Type","application/json; charset=utf-8")
			.body("book[3].title",equalTo("Lord of the Rings"));
			*/
	}

}
