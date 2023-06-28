Feature: Form page validation
validate the elements in Form page

  Scenario Outline: Title of your scenario
    Given open general store applicatiion
    When Enter drop down "<drop>"
    And Enter username "<name>"
    And Select gender "<gender>"
    Then click submit
   
		Examples:
		|drop|name|gender|
		|India|kiruba|male|
		|Pakisthan|rishitha|female|
		