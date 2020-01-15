Feature: Application Login

Scenario: Home page default login
Given User is on landing page
When User login with username "jin" and password "1234"
Then Homepage is populated
And Cards Displayed "true"

Scenario: Home page default login
Given User is on landing page
When User login with username "John" and password "1234"
Then Homepage is populated
And Cards Displayed "false"