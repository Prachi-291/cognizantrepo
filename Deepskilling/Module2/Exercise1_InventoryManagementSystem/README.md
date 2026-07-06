# Exercise 1: Inventory Management System

## Aim

To develop an Inventory Management System using Java that efficiently stores and manages product details using the HashMap data structure.

---

## Problem Statement

Design an inventory management system for a warehouse where products can be added, updated, deleted, and displayed efficiently. The system should support fast retrieval and modification of product information.

---

## Theory

### Data Structures and Algorithms

Data Structures are used to organize and store data efficiently, while Algorithms define the steps to solve a problem. Choosing the correct data structure improves the performance of an application, especially when dealing with large amounts of data.

### Why HashMap?

A HashMap stores data as key-value pairs.

- Key → Product ID
- Value → Product Object

HashMap provides fast access to products using their Product ID, making it suitable for inventory management systems.

---

## Operations Implemented

- Add Product
- Update Product
- Delete Product
- Display Products

---

## Time Complexity Analysis

| Operation | Time Complexity |
|-----------|-----------------|
| Add Product | O(1) Average |
| Update Product | O(1) Average |
| Delete Product | O(1) Average |
| Search Product | O(1) Average |

Worst-case complexity may become **O(n)** due to hash collisions.

---

## Advantages

- Fast insertion and retrieval
- Efficient storage of large inventories
- Easy to update and delete records
- Scalable for large datasets

---

## Optimization

- Use HashMap for constant-time operations.
- Use Product ID as the unique key.
- Minimize duplicate entries.
- Maintain unique product identifiers.

---

## Conclusion

The Inventory Management System demonstrates the effective use of the HashMap data structure for managing product records. It provides efficient insertion, updating, deletion, and retrieval operations, making it suitable for warehouse and inventory applications.