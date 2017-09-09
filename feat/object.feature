Feature: Perform Page object model 

Scenario: Login to Salesforce

Given Open the browser
When Give the username and Password
And Click login
Then logout of salesforce 

Scenario: Create an Asset 

Given Open the browser
When Give the username and Password
And Click login
And Create an asset 
Then logout of salesforce 