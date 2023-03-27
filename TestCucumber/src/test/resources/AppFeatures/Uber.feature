Feature: Uber Booking Feature

@Somke
Scenario: Booking Cab Sedan
Given User wants to select car type "sedan" from Uber app
When user selects the car "sedan" and pickup point "Bangalore" drop to "Pune"
Then Driver starts the Journey
And Driver ends the journey 
Then user pay 1000 USD 

@Regression
Scenario: Booking Cab SUV
Given User wants to select car type "SUV" from Uber app
When user selects the car "sedan" and pickup point "Chennai" drop to "Trichy"
Then Driver starts the Journey
And Driver ends the journey 
Then user pay 1000 USD 

@Prod
Scenario: Booking Cab Mini
Given User wants to select car type "Mini" from Uber app
When user selects the car "sedan" and pickup point "Porur" drop to "Puzhal"
Then Driver starts the Journey
And Driver ends the journey 
Then user pay 1000 USD 