Feature: Dashboard page

  Background:
    Given Navigate to Amazon home page

  Scenario Outline: Search feature

    When I enter "<Products>"
    Then Verify user redirected to "<Products>" page

    Examples:
      | Products |
      | Bags     |
      | Watches  |