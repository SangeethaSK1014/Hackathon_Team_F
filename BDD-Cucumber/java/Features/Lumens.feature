Feature: Lumens login applicati

Scenario Outline: login to application using excel sheet

Given user should create an account
And enter login credentials from sheet "<SheetName>" and <RowNumber>
Then click on submit button
And user clicks on ligthing tab
Then user select on Chandeliers
And user selects on LargeChandeliers
Then user add filters and check filters

Examples:
|SheetName|RowNumber|
|signin|0|

