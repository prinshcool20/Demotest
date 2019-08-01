Feature: login to the system
As a user, I want to login into the system when i provide username and password.

@tag_login_email
Scenario Outline: Verify that can login gmail
Given I launch "Https://accounts.google.com" page
When I fill in "Email" with "<Email>"
And I fill "Passwd" with "<Password>"
And I click on "singin" button
Then I am on the "Home" page

Scenarios:
|Email								|Password	|
|kms.admin@gmail.com	|kms@2013	|
|kms.user@gmail.com		|kms@1234	|