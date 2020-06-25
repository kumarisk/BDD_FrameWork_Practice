#without Examples Keyword
Feature: login test

Scenario: Free Login Test Scenario

Given user is already on Login Page without
Then user enters "sudheer" and "test@123"
Then Close the browsers