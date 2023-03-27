package com.dataDriven;

import org.json.JSONException;
import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DataProvider {

		@Test
		void postNewEmployee(String name, String sal, String age) throws JSONException {
			
			RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1";
			
			RequestSpecification httpRequest = RestAssured.given();
			
			//We are created the data for POST request
			JSONObject reqParam = new JSONObject();
			
			reqParam.put("name", name);
			reqParam.put("salary", sal);
			reqParam.put("age", age);
			
			//Add a header stating the body is JSON
			httpRequest.header("Content-Type","application/json");
			httpRequest.body(reqParam.toString());
			
			//Add the JSON to body of request
			httpRequest.body(reqParam.toString());
			
			//Post Request
			Response response = httpRequest.request(Method.POST,"/create");
			
			String respBody = response.getBody().asString();
			/*
			Assert.assertEquals(respBody.contains("will smith"), true);
				Assert.assertEquals(respBody.contains("23000"), true);
			Assert.assertEquals(respBody.contains("32"), true);
			Assert.assertEquals(response.getStatusCode(), 200);
			*/
		}
		
		String [][] getEmpData() {
			String empData [][] = {{"symond","30000","40"},{"duke","10000","20"},{"syed","15000","25"}};
			return (empData);
		}
}
