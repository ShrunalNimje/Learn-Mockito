# Learn Mockito

This repository provides an introduction to **Mockito**, a popular testing framework for Java. The project demonstrates how to use Mockito to create mocks, stubs, and spies to test Java applications effectively and provides examples of different testing techniques.

## Features

- Introduction to unit testing with Mockito
- Creating and using mocks, stubs, and spies
- Testing with mock behaviors and verifying interactions
- Exception handling in tests
- Sample unit tests for various scenarios

## Technologies Used

- **Java 11** or higher
- **JUnit** for running tests
- **Mockito** for creating and verifying mocks
- **Maven** for dependency management

## Getting Started

### Prerequisites

- JDK 11 or higher
- Maven
- IDE (IntelliJ, Eclipse, etc.)

### Installation

1. **Clone the repository**

   ```bash
   git clone https://github.com/ShrunalNimje/Learn-Mockito.git

2. **Navigate to the project directory**

   ```bash
   cd Learn-Mockito

3. **Build the project using Maven**

   ```bash
   mvn clean install

4. **Run the tests**

   ```bash
   mvn test
   
### Usage

This project includes examples of Mockito testing practices. To use these examples:

- Check the provided test classes to understand different mock setups and verifications.
- Run tests to see how mocks are used to isolate and validate application functionality.

## Mockito Concepts Demonstrated

- **Creating Mocks:** Use Mockito.mock() to create mock objects.
- **Stubbing Methods:** Define return values for methods of mock objects using when().thenReturn().
- **Verifying Interactions:** Ensure methods are called with expected parameters using verify().
- **Exception Handling:** Test scenarios where methods throw exceptions.
- **Spy:** Use spies to wrap real objects and test selective mocking.

## Acknowledgements

- [JUnit](https://junit.org/)
- [Mockito](https://site.mockito.org/)
- [Maven](https://maven.apache.org/)

## Contact

For any questions or feedback, please reach out to [Shrunal Nimje](https://github.com/ShrunalNimje).
