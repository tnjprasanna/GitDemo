package stepDefenitions;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Registration {
	
	@Given("User is on Registration page")
	public void user_is_on_registration_page() {
	    System.out.println("User navigates the page");
	}

	@When("User enters following user details")
	public void user_enters_following_user_details(DataTable dataTable) {
	   List<List<String>> userList = dataTable.asLists(String.class);
	    
	    for(List<String> eachData : userList) {
	    	System.out.println(eachData);
	    }
	}
	
	@When("User enters following user details with heading")
	public void user_enters_following_user_details_with_heading(DataTable dataTable) {
		
		List<Map<String, String>> userList =	dataTable.asMaps(String.class, String.class);
		System.out.println(userList);
		
		for(Map<String,String> eachData : userList) {
			System.out.println(eachData.get("FirstName"));
			System.out.println(eachData.get("Email"));
			System.out.println(eachData.get("Mobile"));
			System.out.println(eachData.get("City"));
		}
	}
	
	@Then("User Registration is successfull.")
	public void user_registration_is_successfull() {
	   System.out.println("User registration should be successfull");
	}
}
