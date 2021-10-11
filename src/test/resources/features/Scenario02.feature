@task
Feature: Modifying user information


Scenario: Verify that the user should be able to modify user information
    Given the user is on the "HomePage"
    And the user accepts the cookies
    When the user clicks to the "Login" icon at the top of the right corner
    And the user should login with userName "QA@fashionette.de" and password "!8Ntr*BM@!#G3VH"
    And the user clicks the PERSONAL DATA
    And the user clicks the edit button under Customer information
    And the user enters the new Name "Fashionette" and Surname "isCool"
    When the user clicks save button
    Then verify that Name and Surname has changed to new Name "Fashionette" and Surname "isCool"