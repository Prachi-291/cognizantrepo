# Exercise 7: Financial Forecasting

## Aim

To implement a recursive algorithm for predicting future financial values based on a fixed annual growth rate.

## Problem Statement

Develop a Java program that calculates the future value of an investment using recursion.

## Concept of Recursion

Recursion is a programming technique in which a method calls itself until a base condition is reached.

## Algorithm

1. Read the current value.
2. Read the annual growth rate.
3. Read the number of years.
4. If years = 0, return the current value.
5. Otherwise, multiply the current value by (1 + growth rate).
6. Recursively calculate the value for the remaining years.
7. Display the future value.

## Time Complexity

| Operation | Complexity |
|-----------|------------|
| Recursive Calculation | O(n) |

## Space Complexity

O(n) due to the recursive call stack.

## Optimization

The recursive solution can be optimized using:
- Iteration (Loop)
- Dynamic Programming (Memoization)

## Conclusion

Recursion provides a simple and elegant solution for financial forecasting. However, for a large number of years, an iterative approach is more memory efficient.