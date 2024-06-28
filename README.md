# selenium-java-test

This is to test your knowledge on selenium-java

## Instructions

Click the invitation link and accept the assignment.
Clone the personal assignment repository.
Implement the required tests using Selenium, TestNG, and Page Object Model.
Commit and push their changes before the deadline.

Instructions on what to code is present in your respective test classes under tests folder
pages folder should be utilized for creating different pages.
test folder should be used for creating tests


## Scenario 1: New Customer Registration and Tariff Plan Assignment

### Test Steps:

1. Navigate to the telecom application homepage - https://demo.guru99.com/telecom/index.html
2. Click on "Add Customer" module
3. Fill in the customer information form with valid data:
   - First Name: John
   - Last Name: Doe
   - Email: john.doe@example.com
   - Address: 123 Main St, Anytown, USA
   - Mobile Number: 1234567890
4. Submit the form
5. Verify that a customer ID is generated and displayed
6. Note down the generated customer ID
7. Navigate to the "Add Tariff Plan to Customer" module
8. Enter the noted customer ID
9. Navigate back to home page and Select add Tariff Plan to Customer. Enter the customer id, and add tarriff plan to customer
10. Confirm the tariff plan assignment is successful
11. Navigate to the "Pay Billing" module
12. Enter the customer ID
13. Verify that the correct tariff plan is displayed
14. Check the bill amount is calculated correctly based on the assigned plan

### Expected Results:

- Customer is successfully added with a unique customer ID
- Tariff plan is correctly assigned to the customer
- Bill amount is accurately calculated and displayed

## Scenario 2: Create New Tariff Plan and Assign to Existing Customer

### Test Steps:

1. Navigate to the telecom application homepage
2. Click on "Add Tariff Plan" module
3. Fill in the tariff plan details:
   - Monthly Rental: $49
   - Free Local Minutes: 1000
   - Free International Minutes: 100
   - Free SMS Pack: 500
   - Local Per Minute Charges: $0
   - International Per Minute Charges: $1
   - SMS Per Message Charges: $1
4. Submit the new tariff plan
5. Verify that the new plan is created successfully
6. Navigate to the "Add Customer" module
7. Add a new customer with the following details:
   - First Name: Jane
   - Last Name: Smith
   - Email: jane.smith@example.com
   - Address: 456 Elm St, Othertown, USA
   - Mobile Number: 9876543210
8. Note down the generated customer ID
9. Go to "Add Tariff Plan to Customer" module
10. Enter the noted customer ID
11. Verify the newly added plan details are displayed in unapproved Tarriff Plans section

## Expected Results

- New tariff plan is successfully created
- Newly created tariff plan is correctly displayed under Unapproved Tariff Plans

## Scenario 3

Add Extent Reports functionality to your tests and ensure that we are able to successfully see all the tests and their statuses respectively.



