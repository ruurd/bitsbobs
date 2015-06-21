Feature: Googling
  Scenario: Find my name on Google
    Given I have opened the Google homepage
    When I select the input with name of q
    And I enter Ruurd Pels
    And I press Enter
    Then a result page opens
    Then the number of results is shown
