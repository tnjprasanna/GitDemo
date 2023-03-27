package day5;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.List;

import org.testng.annotations.Test;

import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;
import junit.framework.Assert;


public class ParsingXMLResponse {
	
	//@Test
	void testXMLResponse() {
		
		given()
		
		.when()
			.get("http://restapi.adequateshop.com/api/Traveler?Page=1")
		.then()
			.statusCode(200)
			.header("Content-Type", "application/xml; charset=utf-8")
			.body("TravelerinformationResponse.page", equalTo("1"))
			.body("TravelerinformationResponse.travelers.Travelerinformation[0].name", equalTo("Developer"));
	}
	
	//@Test
	void testXMLResponseAssert() {
		
		Response res = given()
		
		.when()
			.get("http://restapi.adequateshop.com/api/Traveler?Page=1");
		
		Assert.assertEquals(res.getStatusCode(), 200);
		Assert.assertEquals(res.header("Content-Type"), "application/xml; charset=utf-8");
		
		String pageNo = res.xmlPath().get("TravelerinformationResponse.page").toString();
		Assert.assertEquals(pageNo, "1");
		
		String travelName = res.xmlPath().get("TravelerinformationResponse.travelers.Travelerinformation[0].name").toString();
		Assert.assertEquals(travelName, "Developer");
	}
	
	@Test
	void testXMLResponseBody() {
		
		Response res = given()
				
				.when()
					.get("http://restapi.adequateshop.com/api/Traveler?Page=1");
		
		XmlPath xmlObj = new XmlPath(res.asString());
		
	 	List<String> travellers =	xmlObj.getList("TravelerinformationResponse.travelers.Travelerinformation");
		Assert.assertEquals(travellers.size(), 10);
		
		List<String> names = xmlObj.getList("TravelerinformationResponse.travelers.Travelerinformation.name");
		
		boolean status=false;
		
		for(String name : names) {
			//System.out.println(name);
			if(name.equals("Ashor")) {
				status = true;
			}
		}
		Assert.assertEquals(status, true);
	}

}
