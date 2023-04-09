# SELENIUM JUNIT-FRAMEWORK
Make a web automation E2E test using Selenium Simple Test Case Manual and Automated Documents 

# Test Document for www.elevenia.co.
## _The Fullstack of Quality Assurance Engineering_

[![](https://img.shields.io/badge/-odieSDET-1da1f2?logo=twitter&style=flat-square&logoColor=white)](https://twitter.com)
[![](https://img.shields.io/badge/-odieSDET-c32aa3?logo=instagram&style=flat-square&logoColor=white)](https://instagram.com) 
[![](https://img.shields.io/badge/-odieSDET-007bb5?logo=linkedin&style=flat-square&logoColor=white)](https://www.linkedin.com/in/ahmad-dodi-yandra-9424b4a9/)
[![](https://img.shields.io/badge/-odieSDET-ff0000?logo=youtube&style=flat-square&logoColor=white)](https://youtube.com)  
</div> 

## Test Plan & Strategy : case study www.elevenia.co.
> ### To conduct complete QA work for the web application, we need to follow the following steps:
> Identify Requirements:
We need to identify the requirements of the web application and document them in detail.

> Identify Test Cases:
Based on the requirements, we need to identify test cases for manual and automated testing.

> Conduct Manual Testing:
Conduct manual testing on the web application to identify any functional, usability, and copywriting issues.

> Document Issues Found:
Document all the issues found during manual testing in a professional QA report format.

> Design Automated Functional Testing Code:
Design automated functional testing code and scripts for testing the web application functionality. We can use Cucumber Framework for BDD with GHERKINS to design test cases in a more readable and maintainable way.

> Select the Required Environment and Tools:
To develop the automated functional testing scripts, we can select the environment and tools as mentioned in the requirement like IntelliJ IDE, Maven Framework, Selenium, JUnit, and Serenity Report. We can also use other tools if required.

> Execute Automated Testing:
Execute the automated testing scripts and document the results. We should also document the setup guide for executing the automated testing scripts.

> Report Test Cases:
Document all the test cases, both manual and automated, in a document. We can also create a Github repository to include all the required content above and submit the repo link.

> Document the Issue Report:
Document all the issues found during manual and automated testing in a professional QA report format.


### Test Objective
The objective of this test plan and strategy is to verify the functionality of the Simple_Factorial-spec.cy.js test script.

### Test Scope
The test will cover the following scenarios:
- The factorial of 0 is equal to 1
- Factorial of positive integer should be calculated correctly
- Negative integer input should display error message
- Non-numeric input should display error message
- Decimal number input should display error message
- Large number input should be calculated correctly
- Large number input should be calculated correctly with null output

### Test Environment
The tests will be executed on the following environment:
1. OS : Windows 10
2. Browser: Chrome 96.0.4664.45
3. EDITOR Intelijj IDE
4. MAVEN Framework
5. CUCUMBER Framework for BDD with GHERKINS
6. Automation Script with JAVA
7. SELENIUM 
8. JUnit
9. SERENITY Report


## The following scenario

Make a web automation test using Selenium with the following scenario:
1. Go to https://www.elevenia.co.id/ then search for "computer"
2. Select “Best selling product”
3. Select the very first product
4. Fill with quantity 3 and add to cart
5. If there is a question whether you want to see the basket, select "yes" if there is no popup


## Test Case Document: Elevenia.co.id Web Application

### Test Case Name: Search and Add Product to Cart
##### Test Case Name 
##### Test ID: ELE-001
###### Description:
This test case verifies that the Search and Add Product to Cart correctly.

###### Steps:

- Navigate to https://www.elevenia.co.id/
- Enter "computer" in the search bar and press enter
- Click on the "Produk terlaris" button to filter results
- Click on the first product in the search results
- Enter "3" in the quantity field
- Click the "Tambahkan ke Cart" button
- If a pop-up message appears, click the "Apakah ingin melihat Cart Anda?" button
- Click the "Lihat Keranjang" button
- Verify that the product added to the cart is correct

###### Expected Result:
- The product "computer" is successfully added to the cart with a quantity of 3.


### Test Case Name: Remove Product from Cart
##### Test ID: ELE-002
###### Description:
This test case verifies that the Remove Product from Cart correctly.

###### Steps:

- Navigate to https://www.elevenia.co.id/
- Enter "computer" in the search bar and press enter
- Click on the "Produk terlaris" button to filter results
- Click on the first product in the search results
- Enter "3" in the quantity field
- Click the "Tambahkan ke Cart" button
- If a pop-up message appears, click the "Apakah ingin melihat Cart Anda?" button
- Click the "Lihat Keranjang" button
- Click the "Ubah Kurir" text box
- Click the "Batal" button on the pop-up message
- Click the "Hapus" button next to the product added to the cart
- Click the "OK" button on the pop-up message
- Verify that the cart is empty

###### Expected Result:
- The product "computer" is successfully removed from the cart and the cart is empty.


##### Note: These test cases can be automated using Selenium and can be integrated with a testing framework like JUnit or TestNG to run them in bulk. Additionally, the test cases can be written using the Gherkin syntax and implemented using a BDD framework like Cucumber.

##### To complete this task, you will need to follow these steps:

1. Install Intelijj IDE, MAVEN Framework, CUCUMBER Framework, and SERENITY Report.
2. Set up a new Maven project in Intelijj IDE.
3. Add the necessary dependencies to your pom.xml file for Selenium, JUnit, and Cucumber.
4. Create a new feature file in the src/test/resources/features directory using the Gherkin syntax. This file should describe the scenario outlined in the - task, step-by-step.
5. Write the step definitions in Java for the steps outlined in the feature file.
6. Create a runner class that runs the feature file and generates a report using Serenity.
7. Run the tests and verify that they pass.
8. Document any issues found during manual testing and write a professional QA report format.
9. Document all test cases (both manual and automated) in a separate document.

#### Submit the functional test script source code, test cases document, and issue report document in a Github repository.

#### AND SELENIUM AUTOMATION TESTING WITH CI/CD GIT ACTION in SUCCESS
