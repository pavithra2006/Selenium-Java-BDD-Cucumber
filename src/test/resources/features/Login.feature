Background:
Given Navigate to Amazon home page

Scenario: Verify login page
  
When I click on Sign in link
Then User redirects to Sign in page
Then Verify following fields present
|Text|Input box|Button|
|Sign In|Email or mobile phone number|Continue|
