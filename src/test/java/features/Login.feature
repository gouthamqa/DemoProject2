Feature: Verifying Login Page

  Scenario: User verifying login page with valid creditails

    Given user navigate to url
    Then user print valid output

  Scenario: User verifying login page with Invalid creditails

    Given user navigate to url
    Then user print Invalid output