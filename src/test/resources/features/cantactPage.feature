@contact_page
Feature: validate contact page

  Background: common Step
    Given User is in the home page
    When user navigate to "contact"

  Scenario: navigate to contact  and validate error
    And user clicks submit
    Then validate the error messages
    Then fill the mandatory fields
    And validate errors are gone

  @mandatory_fields
  Scenario: enter valid data and click submit
    Then fill the mandatory fields
    And user clicks submit
    Then user validate successful submission message

  @invalid_data
  Scenario: enter invalid data and verify error message
    When Populate mandatory fields with invalid data
    Then validate the displayed error messages