Feature: User Login

  Scenario: Successful Login
    Given then user is on nopCommerce login page
    When the user enteres valid credentials (username: "sraj00009@gmail.com", password: "Sumant11#")
    And the user clicks on the login button
    Then the user login should be redirected to the My Account page
    And the user should see a welcome message

