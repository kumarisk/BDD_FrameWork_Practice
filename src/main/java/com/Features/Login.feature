Feature: Jalesh login feature

@SmokeTest
Scenario: Login test scenario with valid credentials

Given User is on home page
When User click on the login
Then User enter username and password
	#or
#And user enters password
Then User click on the login button
And User is on the home page as user


@RegressionTest
Scenario: scenario to add max no of rooms

#Given User is on home page with login
Then user click on rooms
Then user click on add room2 button
Then user click on add room3 button
Then user click on add room4 button
Then user click on add room5 button
Then user click on save button
When user click on book button
Then user is on cruise list page


@SmokeTest @RegressionTest
Scenario: This is for logout test
When user clicks on the logout button


