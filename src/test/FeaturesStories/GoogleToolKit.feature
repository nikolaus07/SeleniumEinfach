Feature: Test test-auto itself on google-page
  browser --> grid, firefox or chrome

  @googleTag
  Scenario: Click Checkboxes
    Given Web Browser is: "Chrome"
    Given navigate to page: "http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox"
    Then Set Checkbox on day: "Tuesday"
    Then Set Checkbox on day: "Friday"
    Then Set Checkbox on day: "Tuesday"
    Then Set Checkbox on day: "Friday"
    Then Set Checkbox on day: "Tuesday"

  @googleTag
  Scenario: Add and delete rows
    Given Web Browser is: "Firefox"
    Given navigate to page: "http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwFlexTable"
    Then Flex Table: "Add a row"
    Then Flex Table: "Add a row"
    Then Flex Table: "Remove a row"
    Then Flex Table: "Remove a row"

  @googleTag
  Scenario: Test Radio-btn
    Given Web Browser is: "Firefox"
    Given navigate to page: "http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwRadioButton"
    Then Set favorit-sport RB to: "Hockey"

  @XXXgoogleTag
  Scenario: Test always failed
    Then test_test "radio"
    Then test_failed

