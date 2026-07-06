# Exercise 1: Implementing the Singleton Pattern

## Overview
The Singleton Pattern is a Creational Design Pattern that ensures a class has only one instance throughout the application's lifecycle. It also provides a global access point to that instance. In this project, the Logger class is implemented as a Singleton so that all parts of the application use the same logging object.

---

# 1. Create a New Java Project

Create a Java project named:

**SingletonPatternExample**

The project contains the following classes:

- `Logger.java`
- `SingletonTest.java`

---

# 2. Define a Singleton Class

The `Logger` class contains:

- A **private static instance** of itself.
- A **private constructor** to prevent object creation from outside the class.
- A **public static getInstance()** method to return the single instance of the Logger class.

This ensures that only one Logger object exists.

---

# 3. Implement the Singleton Pattern

The Singleton Pattern is implemented by:

- Declaring a private static object of the class.
- Making the constructor private.
- Providing a public static method (`getInstance()`) that creates the object only once and returns the same object whenever requested.

This guarantees that every part of the application shares the same Logger instance.

---

# 4. Test the Singleton Implementation

The `SingletonTest` class:

- Calls the `getInstance()` method multiple times.
- Stores the returned object in different references.
- Verifies that all references point to the same Logger object using the `==` operator.

If all references are equal, it confirms that only one instance has been created.

---

# Advantages of Singleton Pattern

- Ensures only one instance of a class exists.
- Saves memory by avoiding multiple object creation.
- Provides a global point of access.
- Maintains consistent behavior across the application.
- Useful for shared resources such as logging, configuration, and database connections.

---

# Applications of Singleton Pattern

- Logging systems
- Database connections
- Configuration management
- Cache management
- Thread pools

---

# Technologies Used

- Java
- Object-Oriented Programming (OOP)
- Singleton Design Pattern

---

# Conclusion

This project demonstrates the implementation of the Singleton Design Pattern using a Logger class. By restricting object creation and providing a single shared instance, the application achieves consistent logging while reducing unnecessary memory usage.