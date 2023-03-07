Feature: Sign In

Scenario Outline: User SignIn Data Driven
    Given User Launch Chrome browser
    When  User opens URL "https://magento.softwaretestingboard.com/"
    Then  Click on Log in link
    And   User enters Email as "<email>" and Password as "<password>"
    And   Click on Log in
    Then  User select Men Tops category from navigation
    And   User select 2 Jackets and Add into the cart
    When  User select Men Bottoms category from navigation
    Then  User select 1 Pants and Add into the cart
    And   User will navigate to the checkout
    Then  User will choose shipping method
    And   Click on Next
    Then  Click on Place order
    And   Click on My Account
    Then  Click on My Orders
    And   Verify last order in my orders
    And   Close browser

    Examples:
      | email | password |
      | testme@gmail.com	| Qwerty@123 |


