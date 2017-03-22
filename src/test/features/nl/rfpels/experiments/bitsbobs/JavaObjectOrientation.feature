Feature: Java Object Orientation
  Scenario: A n00b tests inheritance
    Given I am a n00b Java programmer
    When I want to know if DerivedClass IS_A BaseClass
    And the base type is in nl.rfpels.bitsbobs.experiments
    And the derived type is in nl.rfpels.bitsbobs.experiments
    Then I check if base type is a class
    Then I run a test to find out

  Scenario: A n00b tests interface implementation
    Given I am a n00b Java programmer
    When I want to know if Implementor IMPLEMENTS_A Implementable
    And the base type is in nl.rfpels.bitsbobs.experiments
    And the derived type is in nl.rfpels.bitsbobs.experiments
    Then I check if base type is an interface
    Then I run a test to find out

  Scenario: A n00b tests it again
    Given I am a n00b Java programmer
    When I want to know if DerivedClass IMPLEMENTS_A Implementable
    And the base type is in nl.rfpels.bitsbobs.experiments
    And the derived type is in nl.rfpels.bitsbobs.experiments
    Then I check if base type is an interface
    Then I run a test to find out
