Feature: Validating Zalora Website
Scenario: Validating Booking Product
Given Entered into the zalora Website
And Entering Valid Login Credentials
And Searching For product product
And selecting and adding the product in the bag
And entering the delivery address
And entering the Payment details
Then geting the Outcomes


Scenario: Validating Entire HomePage
Given Entering into the Website
And validating images and links
Then validating the outcome

