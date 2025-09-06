Feature: check user is able to search the products 
Scenario Outline: product search 
Given search page will be open in default browser  
When enter multiple search <item>
Then product is searching succesfully 
Examples:
|item|
|Apple|
|samsung|
|Google|
|OnePlus|

