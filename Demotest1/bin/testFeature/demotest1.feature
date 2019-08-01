Feature: LogIn and LogOut
As an Adminstrator
I want to restrict access to certain portions of my site
In order to prevent users from changing the content
Scenario:Logging in
Given I am not logged in as an administrator
When I go to the adminstrative page
And I fill in the fields
	|Username|admin|
	|Password|secret|
And I press "Log in"
Then I should be on the adminstrative page
And I should see "Log out"

Scenario: Logging out.......