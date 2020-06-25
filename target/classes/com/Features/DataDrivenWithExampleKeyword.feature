#with Examples Keyword
Feature: logintest

Scenario Outline: Free CRM Login Test Scenario

Given user is already on Login Page
Then user enters details "<username>" and "<password>"
Then Close the browser


Examples:
	| username | password |
	| naveenk  | test@123 |
	|  tom     | test456  | 
	| heloooo  |  bbbviv  |