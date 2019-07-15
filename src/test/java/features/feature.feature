Feature: Application login verification
Scenario: User is able to login and checing cards displayed for this user
Given User is on netbanking page
When user login into application with "john" and "1234"
Then home page is populated
And cards displayed is "true"

Scenario: User is able to login and checing cards not displayed for this user
Given User is on netbanking page
When user login into application with "janu" and "1456"
Then home page is populated
And cards displayed is "false"