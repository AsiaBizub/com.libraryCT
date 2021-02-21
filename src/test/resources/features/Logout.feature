Feature: Logout feature
  As a user I should be able to logout.
  Accounts are: librarian, student


  Scenario Outline: user should be able to logout
    Given the user navigates to login page
    When user enters "<email>" and "<password>"
    Then user should be able to logout

    Examples:

      | email               | password | username
      | student98@library   | A15Oposz | stu98
      | student99@library   | 8tIDMH5x | stu99
      | student100@library  | CUcGL8fe | stu100
      | librarian15@library | S5Ejblg1 | lib15


  Scenario Outline: when user navigates back, verify whether the system logout or not
    Given the user navigates to login page
    When user enters "<email>" and "<password>"
    Then user should be able to logout
    And when user navigates back, should have logout

    Examples:

      | email               | password | username
      | student98@library   | A15Oposz | stu98
      | student99@library   | 8tIDMH5x | stu99
      | student100@library  | CUcGL8fe | stu100
      | librarian15@library | S5Ejblg1 | lib15