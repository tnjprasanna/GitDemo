
Feature: User Registration

  Scenario: User Registration with different data
    Given User is on Registration page
    
    When User enters following user details 
  		
      | name1 | name1@gamil.com | 707008 | Bangalore |
      | name2 | name2@gmail.com | 797979 | Delhi |
      | name3 | name3@gmail.com | 797979 | Mumbai |
      | name4 | name4@gmail.com | 797979 | Pune |
      
    Then User Registration is successfull. 
    
    Scenario: User Registration with different data with columns
    Given User is on Registration page
    
    When User enters following user details with heading
  		| FirstName | Email | Mobile | City | 
      | name5 | name1@gamil.com | 707008 | Bangalore |
      | name6 | name2@gmail.com | 797979 | Delhi |
      | name7 | name3@gmail.com | 797979 | Mumbai |
      | name8 | name4@gmail.com | 797979 | Pune |
      
    Then User Registration is successfull. 
   

 

   
      
