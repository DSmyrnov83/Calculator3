Feature: Calculations

  Scenario Outline: Calculator operations

    Given website 'https://www.google.com' is opened
    When navigated to 'Calculator' page
    When user clicks on '<firstArgument>', '<operation>', '<secondArgument>' and '=' buttons consistently
    Then received result is '<result>'

    Examples:
      | firstArgument | operation | secondArgument | result   |
      | 3             | +         | 4              | 7        |
      | 7             | −         | 2              | 5        |
      | 6             | *         | 4              | 24       |
      | 8             | /         | 2              | 4        |
      | 5             | /         | 0              | Infinity |