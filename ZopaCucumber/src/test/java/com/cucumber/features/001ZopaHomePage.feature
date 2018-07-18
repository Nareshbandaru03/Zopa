Feature: Zopa Application Launch

Scenario: Click zopa loan button 
Given User opens "chrome"
When User navigate to "Url"
Then User able to click on zopa loan button
#Then User able to redirect to loan page


Scenario: Click quote radio button
Given User able to click on quote radiobutton
And User should click on get my personalised rates button
Then Loan text should visible 