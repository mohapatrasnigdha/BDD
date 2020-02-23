Feature: Google Login Feature

Scenario: Gmail Login Scenario
Given user is already on login page
When title of login Page is Gmail
Then user enters username and password
Then user clicks on login button
Then user should be on home page