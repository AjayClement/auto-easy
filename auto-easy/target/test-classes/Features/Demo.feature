Feature: As a user I want to be able to add new clients in the system So that i can add accounting data for that client


Scenario: Sign up a new user
    Given the user is on landing page
    When the user chooses to sign up
    And she provides the first name as Sukesh
    And she provides the last name as Kumar
    And she provides the email as validemail@aq.com
    And she provides the password as password
    And she provides the confirm password again as password
    And she signs-up
    Then she should be logged in to the application