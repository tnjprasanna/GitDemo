Feature: Login Feature

	Scenario Outline: login fail and possible conditions
		Given user is on application landing page
		When user clicks on Sign-In button
		Then user is displayed login screen
		When user enters "<userName>" in userName field
		And enters "<password>" in password field 
		And user clicks Sing-In button
		Then user gets login failed error message
		
			Examples:
					|userName|password |
					|wrongUN |wrongPwd |
					|test1   |test1    |