# Mobiux-Amazon Assignment Wrist Watches Search Automation

## Description
This project is a Java Selenium Hybrid Framework that automates the process of searching for wrist watches on the Amazon India website. This framework  is an Hybrid framework which provides a flexible and maintainable approach to automated testing. It includes test scripts, utility classes etc.,to perform the specified actions on the Amazon website and finally retrieving the 5th element from the search results.

## Goal
To launch Chrome browser, navigate to "https://amazon.in," and perform the following actions:
- Search for "Wrist Watches."
- Filter the search results by:
- Display: "Analogue"
- Brands Material: "Leather"
- Brand: "Titan"
- Discount: "25% Off or more"
- Retrieve and display the details of the fifth element from the search results.
## Requirements
- Java Development Kit (JDK) 8 or higher
- Apache Maven
- Selenium WebDriver
- TestNG
- Chrome/Fire Fox/Edge Web Browsers
## Installation
1. Clone this repository or download the ZIP file and extract it.
2. Make sure you have Java JDK and Apache Maven installed on your system.
3. Install the required dependencies using Maven command - mvn clean install
## Reporting
The framework generates test reports using TestNG, which can be found in the **/test-output/ExtentReports** directory after executing the test cases.
