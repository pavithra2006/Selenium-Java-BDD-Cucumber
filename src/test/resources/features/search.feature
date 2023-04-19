@All
Feature: Amazon search

#  Background:
#    Given Navigate to Amazon dashboard page
#    When I have a search text box field on Amazon page
#
#  @smoke
#  Scenario: Verify search box feature
#    And I search for product "Iphone12" and price 1000
#    Then Verify that "Iphone12" products displayed
#
#  @regression
#  Scenario: Verify search box feature
#    And I search for product "Samsung" and price 1000
#    Then Verify that "Samsung" products displayed
#
#  @smoke @regression
#  Scenario: Verify search box feature
#    And I search for product "Shirt" and price 1000
#    Then Verify that "Shirt" products displayed

  @Datatable
  Scenario: Data table
    When User enters following details
      | Name     | Age | City       |
      | Pavi     | 24  | Amabttur   |
      | Karthick | 27  | Madipakkam |
    Then Verify registration success

