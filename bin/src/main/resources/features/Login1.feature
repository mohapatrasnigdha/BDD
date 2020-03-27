Feature: Wordpress Login Feature

Scenario: Wordpress Login Scenario
Given user is on Home page
And title of homepage is Wordpress.com
And user Taps on signin button 
When user enters username in textbox
And user enters password in textbox
Then user is taken to landing page
And user clicks on avatar icon
Then user taps on log out button