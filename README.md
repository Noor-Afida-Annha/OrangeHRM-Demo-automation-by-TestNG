# Project Title: OrangeHRM Demo Web Automation with TestNG
## Project Summary: This project automates the testing of the OrangeHRM web application using TestNG,a powerful testing framework for Java. The automation covers various functionalities of the OrangeHRM app,such as login, adding a new employee, and managing user accounts. The project demonstrates how to implement automated functional testing with Selenium WebDriver,
integrating TestNG for test management and reporting.
## Prerequisites
Before running the tests, ensure you have the following installed:
-Java 8 or later
-Apache Maven (for managing dependencies and running tests)
-Selenium WebDriver
-TestNG (for test execution and reporting)
-Gradle (for project build and execution)
## How to Run the Project?
1.Clone the repository:
Copy code
-git clone https://github.com/Noor-Afida-Annha/OrangeHRM-Demo-automation-by-TestNG.git
2.Navigate to the project directory:
Copy code
-cd OrangeHRM-Demo-automation-by-TestNG
3.Build and run the tests using Gradle:
Copy code
-./gradlew test
4.View the test results in the allure-results directory.
## Running Specific Commands
1.To run the tests with Gradle:
Copy code
-```gradle clean test```
2.To generate Allure reports after the tests:
Copy code
-```allure serve allure-results```
