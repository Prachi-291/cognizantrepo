# Mockito Hands-On Exercises

## Module 4 - Mockito

## Technologies Used

- Java 17
- Maven
- JUnit 5
- Mockito

## Project Structure

```
MockitoHandsOnExercises
│
├── pom.xml
├── README.md
└── src
    ├── main
    │   └── java
    │       └── com.cognizant.mockito
    │           ├── ExternalApi.java
    │           └── MyService.java
    │
    └── test
        └── java
            └── com.cognizant.mockito
                ├── Exercise1Test.java
                └── Exercise2Test.java
```

## Exercises Implemented

### Exercise 1 – Mocking and Stubbing

**Objective:**
- Create a mock object using Mockito.
- Stub the `getData()` method.
- Verify that the service returns the mocked value.

### Exercise 2 – Verifying Interactions

**Objective:**
- Create a mock object.
- Invoke the service method.
- Verify that the mocked method `getData()` is called.

## Running the Tests

Execute the following command from the project directory:

```bash
mvn test
```

## Expected Output

```
BUILD SUCCESS
Tests run: 2
Failures: 0
Errors: 0
```

## Author

Prachi Yadav