# Exercise 2: Implementing the Factory Method Pattern

## Overview

The Factory Method Pattern is a Creational Design Pattern that provides an interface for creating objects without exposing the object creation logic to the client. It allows subclasses to decide which object should be created. In this project, the Factory Method Pattern is used to create different types of documents such as Word, PDF, and Excel.

---

# 1. Create a New Java Project

Create a Java project named:

**FactoryMethodPatternExample**

The project contains the following classes:

- Document.java
- WordDocument.java
- PdfDocument.java
- ExcelDocument.java
- DocumentFactory.java
- WordFactory.java
- PdfFactory.java
- ExcelFactory.java
- FactoryTest.java

---

# 2. Define Document Classes

An interface named **Document** is created with a common method called `open()`.

The following document classes implement the Document interface:

- WordDocument
- PdfDocument
- ExcelDocument

This provides a common structure for all document types.

---

# 3. Create Concrete Document Classes

Each concrete document class implements the `Document` interface and provides its own implementation of the `open()` method.

Examples:
- WordDocument
- PdfDocument
- ExcelDocument

Each class represents a specific type of document.

---

# 4. Implement the Factory Method

An abstract class named **DocumentFactory** contains an abstract method:

`createDocument()`

Concrete factory classes extend the DocumentFactory class:

- WordFactory
- PdfFactory
- ExcelFactory

Each factory creates and returns its corresponding document object.

---

# 5. Test the Factory Method Implementation

The `FactoryTest` class creates different factory objects and uses the `createDocument()` method to generate Word, PDF, and Excel documents.

This demonstrates how object creation is handled by factories instead of directly creating objects with the `new` keyword.

---

# Advantages of Factory Method Pattern

- Promotes loose coupling between classes.
- Hides object creation logic.
- Makes the code easier to maintain.
- Improves scalability by allowing new document types to be added easily.
- Follows the Open/Closed Principle.

---

# Applications of Factory Method Pattern

- Document Management Systems
- Database Drivers
- Notification Systems
- GUI Frameworks
- Game Development

---

# Technologies Used

- Java
- Object-Oriented Programming (OOP)
- Factory Method Design Pattern

---

# Conclusion

This project demonstrates the implementation of the Factory Method Design Pattern by creating different types of documents through factory classes. The pattern separates object creation from object usage, making the application more flexible, maintainable, and extensible.