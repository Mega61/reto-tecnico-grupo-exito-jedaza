# Automated Test for Adding Item to Shopping Cart

This repository contains an automated test suite to validate the functionality of adding an item to the shopping cart on our e-commerce website.

 
## Introduction

The purpose of this automated test suite is to ensure that the "Add to Cart" feature on our e-commerce platform works as expected. The test scenarios cover different user interactions, including logging in to the user account, searching for an item using the search bar, and adding the item to the shopping cart.


## Prerequisites

Before running the automated tests, make sure you have the following installed:

 - Java Development Kit (JDK) 8 or higher
 - Maven build tool
 - Chrome or Firefox web browser
 - ChromeDriver or GeckoDriver (depending on the browser you choose)

## Installation

 1. Clone this repository to your local machine.
 2. Navigate to the project root directory.
 3. Install the required Java dependencies using Maven:

`mvn clean install`

## Running the Tests

To execute the automated test suite, use the following command:

`mvn clean verify` 

By running this command, the tests will be executed using the Serenity BDD framework with the Screenplay pattern. The test results will be displayed in the console, and a detailed HTML report will be generated in the "target/site/serenity" directory.

## Test Scenarios

### Scenario 1: Add Item To Shopping Cart

`Given That the user is able to login to its own account`
`When He searches for an item in the search bar`
`Then He is able to add the item "Producto" to the shopping cart` 

This scenario validates the end-to-end process of adding the item "Producto" to the shopping cart after the user successfully logs in and performs a search using the search bar.