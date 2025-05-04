Feature: Checkbox Feature

  Background:
    Given User Already in Pages

  Scenario: User Want To Check Checkbox
    When User Click Blank Checkbox
    Then Checkbox Success To Check

  Scenario: User Want To Uncheck Checkbox
    When User Click Fill Checkbox
    Then Checkbox Success To Uncheck