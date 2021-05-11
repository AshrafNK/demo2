@UserLoginMay
Feature: User want to Sign in & Sign off from Oscommerce

In order to Sign in and Sign off from account
As a register user
I want to eneter E-Mail Address, password, and click sign-in to login
and Click Sign off for Sign Out

@login_Pos
Scenario Outline: Positive login and logout with valid E-Mail Address and Password
Given user visiting homepage
And click My Account button
When user enter "<E-Mail Address>" and "<password>"
And user click on sign in button 
Then user successfully login to the system
And user click on Log off Button for logout

Examples:

|E-Mail Address       |password|
|pat@yahoo.com        |abc123| 

@login_neg
Scenario Outline: Negative login and logout with valid E-Mail Address and Password
Given user visiting homepage
And click My Account button
When user enter "<E-Mail Address>" and "<password>"
And user click on sign in button 
Then user successfully login to the system

Examples:

|E-Mail Address       |password|
|pat@yahoo.com        | | 