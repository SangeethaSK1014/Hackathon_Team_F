Feature: Validation of Lumens application
  Scenario Outline: Account creation and Sign in
  
    Given Navigate to Lumen URL
    When Verify the Home Page
    Then User Sign in the application 
    And user fills the form from given sheetname "<SheetName>" and rownumber <RowNumber>
    Then User Search item in searchbar
    And User Click on Add to cart
    Then User Navigate to the Cart and validate the item
   
    
 Examples:
|SheetName|RowNumber|
|LoginDetails|0|


