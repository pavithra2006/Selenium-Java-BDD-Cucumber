Feature: Login page

  Background:
    Given Navigate to Amazon home page
    Then Verify page title is "Amazon.in"

  Scenario: Verify login page

    When I click on Sign in link
    Then User redirects to Sign in page
    Then Verify following fields present
      | Text    | Input box                    | Button   |
      | Sign In | Email or mobile phone number | Continue |
