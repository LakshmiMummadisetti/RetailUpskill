Feature: Reatil Upskill

  Scenario: Add Edit and Delete Coupon
    Given User Navigated to Login Page
    Then User Enter Login and password And click on Enter
    And Retail Login Page should load
    Given Click on Coupons
    Then Click on Add Coupon
    Then Enter all the Necessary details and Save
    And Verify the added Coupon
    Then Click Edit the added Coupon
    When Edit Coupon Page Loaded, Update the coupon name
    And Verify the Edited coupon in coupon list
    And Delete the coupon
