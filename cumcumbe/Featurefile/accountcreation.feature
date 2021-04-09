Feature: LumensApplication
  I want to use this template to validate AccountCreation

 
  Scenario: Account Creation
  
    Given I open browser with URL
    And User should create an account
    And Login to application
    Then user verify the title of the url
    Then User add the product to cart and remove it
    Then User apply coupon code
    Then User perform scrollup and scroll down action
    And User logout the page
    
    

  