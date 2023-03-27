package RestAPI.RestAssured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class WeatherMessageBody {
	
	@Test
	public void WeatherMessageBody(){
		
		RestAssured.baseURI =  "https://demoqa.com/BookStore/v1/Books"; 
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.get("website");
		
		ResponseBody responseBody = response.body();
		String body = responseBody.asString();
		System.out.println("Response Body : "+body);
		
		JsonPath jsonPathEvaluator = new JsonPath (body);
		String website = jsonPathEvaluator.getString("website");
		
		System.out.println(website);
	}

}
