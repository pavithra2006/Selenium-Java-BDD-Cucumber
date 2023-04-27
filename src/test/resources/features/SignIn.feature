Feature: Login page

  Background:
    Given Navigate to Amazon home page
    Then Verify page title is "Amazon.in"

  Scenario: Verify login page

    When I click on "Sign in link"
    And User redirects to Sign in page
    Then Verify page title is "Amazon Sign In"
    Then Verify following fields present
      | Help text | Input box                    | Button   |
      | Sign In   | Email or mobile phone number | Continue |


