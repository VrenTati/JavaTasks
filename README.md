# Test Task

This repository contains the solution to three programming tasks implemented in Java. Each task is provided in a separate file with detailed comments and explanations.

---

## Contents

1. [Task 1: Counting Valid Parentheses Expressions](#task-1)
2. [Task 2: Minimum Cost Path Between Cities](#task-2)
3. [Task 3: Sum of Digits in a Factorial](#task-3)

---

## Task 1

### Description
Given \( N \) (the number of pairs of opening and closing parentheses), calculate the number of valid parentheses expressions.

### Formula
The number of valid parentheses expressions is represented by the \( n \)-th Catalan number:
\[
C(n) = \frac{(2n)!}{(n+1)! \cdot n!}
\]

### File
The code is implemented in `BalancedParentheses.java`.

### Input
An integer \( N \) representing the number of pairs of parentheses.

### Output
The number of valid parentheses expressions.

---

## Task 2

### Description
Find the shortest path between pairs of cities in a weighted graph where each edge represents transportation cost. The solution uses **Dijkstra's algorithm**.

### Input
- **Number of tests**: The number of independent graph setups.
- **City data**:
  - The list of cities and their neighbors with transportation costs.
- **Queries**: Pairs of cities for which the minimum path cost must be calculated.

### Output
For each query, output the minimum transportation cost. If no path exists, return `-1`.

### File
The code is implemented in `ShortestPath.java`.

---

## Task 3

### Description
Calculate the factorial of 100 (\( 100! \)) and find the sum of its digits. The solution uses the `BigInteger` class to handle large numbers.

### Input
The integer \( 100 \) is hardcoded in the solution.

### Output
The sum of the digits of \( 100! \).

### File
The code is implemented in `FactorialDigitSum.java`.
