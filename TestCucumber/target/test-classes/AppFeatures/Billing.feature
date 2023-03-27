Feature: Billing Feature

Scenario Outline: billing amount
	Given person is on billing page
	When user enters billing amount <billingAmount>
	When usre enters tax amount <taxAmount>
	And user clicks calculate button
	Then gives the final amount <finalAmount>
	
	Examples:
			|billingAmount|taxAmount|finalAmount	|
			| 1000 				| 10  		| 1010  			|
			| 500  				| 20  		| 520   			|
			| 100  				| 5.5 		| 105.5 			|
		
	