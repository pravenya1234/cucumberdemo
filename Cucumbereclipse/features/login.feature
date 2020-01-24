Feature: Testlogin functionality for demowebshop

@valid
Scenario: Test demowebhop with credentials
Given open chrome and start application
When I enter valid username and password
Then user should be able to login

@invalid
Scenario: Test demowebhop with credentials
Given start application
When I enter invalid username and password
Then user should not be able to login