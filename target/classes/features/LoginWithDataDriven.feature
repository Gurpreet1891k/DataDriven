Feature: Login Feature of Facebook

Scenario Outline: Test Login Function of Facebook
Given User is  on login Page of the Application
When User enters "<Username>" in username field and "<password>" in password field
Then User click on Login Button
Then c losing  of the browser

Examples:
	
	| Username | password  |
	| Admin    | Admin@123 |
	| Gurpreet | qwerty    |
	| john 	   | admin@12  |