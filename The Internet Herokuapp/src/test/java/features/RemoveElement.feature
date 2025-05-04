Feature: Add/Remove Element

  Background:
    Given User Already in Pages

  Scenario: User Want To Add Element
    When User Click Add Element
    Then Element Success To Add

  Scenario: User Want To Delete All Element
    When User Click Add Element
    And User Click Delete Element
    Then Element Success To Delete
