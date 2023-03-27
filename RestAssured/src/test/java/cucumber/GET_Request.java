package cucumber;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class GET_Request {
	
	@Test
	public void getWeatherDetails() {
		
		given()
		
		.when()
		
		.get("http://resapi.demoqa.com/utilities/weather/city/Hyderabad")
		.then()
		.statusCode(200);
	
	}
	

}
