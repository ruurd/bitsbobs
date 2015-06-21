Feature: Java Object Orientation
  Scenario:
    Given I am a n00b Java programmer
    When I want to know if DerivedClass IS_A BaseClass
    And the base type is in nl.rfpels.experiments
    And the derived type is in nl.rfpels.experiments
    Then I check if base type is a class
    Then I run a test to find out

  Scenario:
    Given I am a n00b Java programmer
    When I want to know if Implementor IMPLEMENTS_A Implementable
    And the base type is in nl.rfpels.experiments
    And the derived type is in nl.rfpels.experiments
    Then I check if base type is an interface
    Then I run a test to find out
