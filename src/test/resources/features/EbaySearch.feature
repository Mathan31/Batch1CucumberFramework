@Complete
Feature: Validate the Ebay Search Result Functionality

Background: Pre-Condition for all the scenario
	Given Navigate to Ebay URL

  @Smoke
  Scenario: Ebay Search with Hardcoded value from coding
  
  When Search the product and Select the Catagory
  And Click on Search Button
  Then User should see the search result

 
  Scenario Outline: Ebay Search with Hardcoded multiple value from feature file

  When Search the multiple product as <ProductName> and Select the multiple Catagory as <ProductCatagory>
  And Click on Search Button
  Then User should see the search result

  
  Examples:
  | ProductName | ProductCatagory               |
  | Selenium    | Books                         |
  | TShirt      | Clothing, Shoes & Accessories |
  
  @Sanity @Regression
  Scenario: Ebay Search with Hardcoded multiple value from feature file data table as List
    
    When Search the product from the below data table as List
      | Lenovo | Cell Phones & Accessories |
      | Java   | Books & Magazines         |
    And Click on Search Button
    Then User should see the search result


  