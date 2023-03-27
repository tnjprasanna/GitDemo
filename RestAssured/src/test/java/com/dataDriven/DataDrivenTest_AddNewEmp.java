package com.dataDriven;

import org.json.JSONException;
import org.json.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class DataDrivenTest_AddNewEmp {
	
	@Test
	void postNewEmployee() throws JSONException {
		
		RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1";
		
		RequestSpecification httpRequest = RestAssured.given();
		
		//We are created the data for POST request
		JSONObject reqParam = new JSONObject();
		
		reqParam.put("name", "will smith");
		reqParam.put("salary", "23000");
		reqParam.put("age", "32");
		
		//Add a header stating the body is JSON
		httpRequest.header("Content-Type","application/json");
		httpRequest.body(reqParam.toString());
		
		//Add the JSON to body of request
		httpRequest.body(reqParam.toString());
		
		//Post Request
		Response response = httpRequest.request(Method.POST,"/create");
		
		String respBody = response.getBody().asString();
		System.out.println(respBody);
		/*
		Assert.assertEquals(respBody.contains("will smith"), true);
			Assert.assertEquals(respBody.contains("23000"), true);
		Assert.assertEquals(respBody.contains("32"), true);
		Assert.assertEquals(response.getStatusCode(), 200);
		*/
	}
	
	@DataProvider(name="empDataProvider")
	String [][] getEmpData() {
		
		String path = System.getProperty("user.dir")+ "/src/test/resources/empdata.xls";
		
		String empData [][] = {{"symond","30000","40"},{"duke","10000","20"},{"syed","15000","25"}};
		return (empData);
	}

	

}
