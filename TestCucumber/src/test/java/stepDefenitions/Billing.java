package stepDefenitions;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Billing {
	
	double billingAmount ;
	double taxAmount;
	double finalAmount;
	
	@Given("person is on billing page")
	public void person_is_on_billing_page() {
    
	}

	@When("user enters billing amount {int}")
	public void user_enters_billing_amount(Integer billingAmount) {
	   this.billingAmount=billingAmount;
	}

	@When("usre enters tax amount {int}")
	public void usre_enters_tax_amount(Integer taxAmount) {
	    this.taxAmount=taxAmount;
	}

	@When("user clicks calculate button")
	public void user_clicks_calculate_button() {
	    
	}

	@Then("gives the final amount {int}")
	public void gives_the_final_amount(Integer finalAmount) {
	    this.finalAmount=this.billingAmount + this.taxAmount;
	    Assert.assertTrue(this.finalAmount==finalAmount);
	}

	@Then("gives the final amount {double}")
	public void gives_the_final_amount(Double finalAmount) {
		this.finalAmount=this.billingAmount + this.taxAmount;
	    Assert.assertTrue(this.finalAmount==finalAmount);
	}
	
}
