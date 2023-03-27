Feature: Home page

In order to check my order details 
as a register user
i want to specify the feature of order details page

Background:
	Given a registered user exist
	Given user is amazon login page
	When users enters username
	And users enters password
	And users click login button
	Then users navigates to order page
	
	Scenario: Check previous order details
		When user clicks on Order link 
		Then User clicks the previous order details 
	
	Scenario: Check open order details 
		When user clicks open order link
		Then user clicks the open order details 
	
	Scenario: Check cancel order details 
		When user clicks on cancel order link
		Then user clicks the cancel order details 
		
		