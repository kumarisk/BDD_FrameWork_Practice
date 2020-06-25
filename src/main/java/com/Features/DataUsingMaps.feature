Feature: Deal data creation 

Scenario: Free CRM Create a new deal scenario 

	Given user is already on CRM Login Page 
	When the title of login page is Free CRM 
	Then user enters valid username and password 
		| username | password|
		| 0abcdef098@gmail.com | Test@123 |
		
	Then user clicks on login button 
	Then user is on home page 
	Then user moves to new deal page 
	Then click on the new button
	Then user enters deal details 
		|title       | amount | probability | commission |
		| test deal1 | 1000 | 50 | 10 |
		| test deal2 | 2000 | 60 | 20 |
		| test deal3 | 3000 | 70 | 30 |
		
	Then click on save button
	#Then user moves to new deal page1
	#Then click on the new button1
	Then Close the browser1