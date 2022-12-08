Feature: Login functionality testing
	Scenario: Testing login functionality with valid credentials
		Given User is on Login screen
		When User enters "Admin" in UserName field
		And User enters "admin123" in Password field
		And User clicks on Login button
		Then Dashboard page should be opened 