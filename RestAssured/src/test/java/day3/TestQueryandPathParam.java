package day3;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class TestQueryandPathParam {
	
	@Test
	void qpParam() {
		
		given()
			//.pathParam("mypath1", "api")
			.pathParam("mypath2", "users")
			.queryParam("page", 2)
			.queryParam("id", 5)
		.when()
			.get("https://reqres.in/api/{mypath2}")
		.then()
			.statusCode(200)
			.log().all();
	}

}
