@Complete
Feature: Validate the Amazon Search Result Functionality

Background: Pre-Condition for all the scenario
 Given Navigate to Amazon URL

@Smoke
Scenario: Amazon Search with Hardcoded value from coding


When Search the amazon product and Select the Catagory
And Click on amaon Search Button
Then User should see the amazon search result
