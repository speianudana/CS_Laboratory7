Feature: Google search

  Scenario: Website header exists

    When Open google

    And Search computer

    Then Title should contain Google word
