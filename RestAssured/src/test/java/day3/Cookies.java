package day3;

import java.util.Map;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import io.restassured.response.Response;

public class Cookies {
	
	@Test
	void getCookies() {
		
		Response res = given()
			
		.when()
			.get("https://www.google.com/");
		
		//get single cookies info
		String cookie_value = res.getCookie("AEC");
		System.out.println("Single cookie "+cookie_value);
		
		Map<String, String> cookies_values = res.getCookies();
			
			for(String k : cookies_values.keySet()) {
					
				String cookie = res.getCookie(k);
				System.out.println(k +"          " +cookies_values);
			}
			
		
	}

}
