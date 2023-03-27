package stepDefenitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UberBookingSteps {
	
	@Given("^User wants to select car type \"([^\"]+)\" from Uber app$")
	public void user_wants_to_select_car_type_from_uber_app(String carType) {
	    System.out.println("Step 1: " +carType);
	}

	@When("user selects the car {string} and pickup point {string} drop to {string}")
	public void user_selects_the_car_and_pickup_point_drop_to(String carType, String pickPoint, String dropPoint) {
		System.out.println("Step 2: user selects the car "+carType+" pickup point "+pickPoint+" drop to "+dropPoint );
	}

	@Then("Driver starts the Journey")
	public void driver_starts_the_journey() {
		System.out.println("Step 3: Driver starts the Journey");
	}

	@Then("Driver ends the journey")
	public void driver_ends_the_journey() {
		System.out.println("Step 4: Driver ends the journey ");
	}

	@Then("user pay {int} USD")
	public void user_pay_usd(Integer price) {
		System.out.println("Step 5: user pay "+price +"USD");
	}

}