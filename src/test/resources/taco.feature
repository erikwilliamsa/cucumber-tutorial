Feature: Taco Meal

  So that Tacos can be orderd
  As a Taco Vendor
  I want to be able to serve Tacos

  Scenario: Get Number of Tacos

    Given I am taking a taco order

    When when 3 tacos are ordered

    Then then the total number of tacos should equal 3

  Scenario: Set types of Shell
    Given I am taking a taco order
    When 2 soft shell tacos and 4 hard shell tacos are selected
    Then there should be a total of 6 tacos with 4 being hard shell and 2 being soft shell.