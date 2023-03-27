package com.employeebase.testcase;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.employeebase.api.TestBase;

import io.restassured.RestAssured;
import io.restassured.http.Method;

public class TC001_Get_Call extends TestBase {

	@BeforeClass
	void getDetails() throws InterruptedException {
		
		//logger.info("***********started TC001 Get All Emp**********");
		
		RestAssured.baseURI = "https://reqres.in/";
		httpRequest = RestAssured.given();
		response =  httpRequest.request(Method.GET,"/api/users/2");
		Thread.sleep(100);
	}
	
	@Test
	void checkResponseBody() {
		//logger.info("************Check Response Body*************");
		String respBody = response.getBody().asString();
		//logger.info("Response Body ==>"+respBody);
		Assert.assertTrue(respBody!=null);
		
	}
	
	@Test(dependsOnMethods = "checkResponseBody")
	void checkStatusCode() {
	//	logger.info("**********Check Status Code*************");
		int statusCode = response.getStatusCode();
	//	logger.info("Resposne code ==>" + statusCode);
		Assert.assertEquals(statusCode, 200);
	}
	@Test
	void checkResponseTime() {
	//	logger.info("**********Check Status Code*************");
		long responseTime = response.getTime();
	//	logger.info("Resposne code ==>" + responseTime);
		//Assert.assertEquals(responseTime, 2285);
	}
	@Test
	void checkStatusLine() {
	//	logger.info("************Check Response Body*************");
		String statusLine = response.getStatusLine();
	//	logger.info("Response Body ==>"+statusLine);
		Assert.assertEquals(statusLine,"HTTP/1.1 200 OK");
		
	}
	@Test
	void checkContentType() {
		
	//	logger.info("************Check Response Body*************");
		String contentType = response.header("Content-Type");
	//	logger.info("Server Type is ==>"+ contentType);
		Assert.assertEquals(contentType, "application/json; charset=utf-8");
		
	}
	
}
