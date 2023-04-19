Feature: Amazon search

  Scenario: Verify search box feature

    Given I have a search text box field on Amazon page
    When I search for product "Iphone" and price 1000
    Then verify that "Iphone" products displayed
