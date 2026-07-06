# Big O Notation

## What is Big O?
Big O is a mathematical way to describe how the performance of an algorithm changes as the size of the input grows.


## Time vs. Space complexity

| Time Complexity                                                      | Space Complexity                                                                 |
| -------------------------------------------------------------------- | -------------------------------------------------------------------------------- |
| Measures how the execution time grows as input size (`n`) increases. | Measures how much extra memory an algorithm needs as input size (`n`) increases. |
| Concerned with CPU work.                                             | Concerned with RAM usage.                                                        |
| Goal: Make the program faster.                                       | Goal: Use less memory.                                                           |


## Common Complexities

| Complexity | Meaning      |
| ---------- | ------------ |
| O(1)       | Constant     |
| O(log n)   | Logarithmic  |
| O(n)       | Linear       |
| O(n log n) | Linearithmic |
| O(n²)      | Quadratic    |
| O(2ⁿ)      | Exponential  |
| O(n!)      | Factorial    |


## Rules for analyzing loops

| **Rule**                                   | **Easy Meaning**                                                     | **Example**                               | **Final Big O** |
| ------------------------------------------ | -------------------------------------------------------------------- | ----------------------------------------- | --------------- |
| **Drop Constants**                         | Ignore fixed numbers. Only look at how the algorithm grows with `n`. | `O(2n)`, `O(100n)`, `O(500n)`             | `O(n)`          |
| **Drop Smaller Terms**                     | Keep only the biggest-growing term. Ignore the smaller ones.         | `O(n² + n + 5)`                           | `O(n²)`         |
| **Addition Rule (One After Another)**      | If one task runs after another, add their complexities.              | First loop: `O(n)`<br>Second loop: `O(m)` | `O(n + m)`      |
| **Multiplication Rule (Loop Inside Loop)** | If one loop is inside another, multiply their complexities.          | Outer loop: `O(n)`<br>Inner loop: `O(n)`  | `O(n²)`         |


## Complexity of common data structures

| Data Structure | Access | Search | Insert | Delete |
|----------------|:------:|:------:|:------:|:------:|
| Array | **O(1)** | **O(n)** | **O(n)** | **O(n)** |
| Dynamic Array (ArrayList) | **O(1)** | **O(n)** | **O(1)\*** | **O(n)** |
| Singly Linked List | **O(n)** | **O(n)** | **O(1)** | **O(1)** |
| Doubly Linked List | **O(n)** | **O(n)** | **O(1)** | **O(1)** |
| Stack | **O(1)** (Top) | **O(n)** | **O(1)** (Push) | **O(1)** (Pop) |
| Queue | **O(1)** (Front/Rear) | **O(n)** | **O(1)** (Enqueue) | **O(1)** (Dequeue) |
| Deque | **O(1)** | **O(n)** | **O(1)** | **O(1)** |
| HashMap | — | **O(1)\*** | **O(1)\*** | **O(1)\*** |
| HashSet | — | **O(1)\*** | **O(1)\*** | **O(1)\*** |
| Binary Search Tree (BST) | **O(log n)\*** | **O(log n)\*** | **O(log n)\*** | **O(log n)\*** |
| Heap (Priority Queue) | **O(1)** (Peek) | **O(n)** | **O(log n)** | **O(log n)** |

> **\*** Average case. In the worst case, some operations (such as in a HashMap or an unbalanced BST) can degrade to **O(n)**.

---

## Easy Way to Remember

| Data Structure | Remember |
|----------------|----------|
| Array | Fast access, slow insert/delete |
| ArrayList | Same as Array, but appending at the end is usually fast |
| Linked List | Fast insert/delete, slow access |
| Stack | Last In, First Out (LIFO) |
| Queue | First In, First Out (FIFO) |
| HashMap | Very fast search, insert, and delete (average case) |
| HashSet | Very fast membership checking (average case) |
| BST | Keeps data sorted; operations are usually `O(log n)` if balanced |
| Heap | Best for finding/removing the minimum or maximum element |

---

### Cheat Sheet

| Operation | Best Data Structure |
|-----------|---------------------|
| Fast random access | Array |
| Fast insert/delete at beginning or middle (known position) | Linked List |
| Fast key-value lookup | HashMap |
| Fast duplicate-free lookup | HashSet |
| Last-In-First-Out | Stack |
| First-In-First-Out | Queue |
| Always get smallest/largest element | Heap (Priority Queue) |
| Keep data sorted with efficient operations | Balanced BST |

## Complexity of common algorithm



## Basic recursion complexity


## Practice Problems

# Example 1: Single Loop

```java
for (int i = 0; i < n; i++) {
    System.out.println(i);
}
```

**Answer:** `O(n)`

Reason: The loop runs `n` times.

---

# Example 2: Constant Loop

```java
for (int i = 0; i < 100; i++) {
    System.out.println(i);
}
```

**Answer:** `O(1)`

Reason: The loop always runs 100 times, regardless of `n`.

---

# Example 3: Two Sequential Loops

```java
for (int i = 0; i < n; i++) {
}

for (int i = 0; i < n; i++) {
}
```

**Answer:** `O(n)`

Reason:

```text
O(n) + O(n) = O(2n) = O(n)
```

---

# Example 4: Different Sizes

```java
for (int i = 0; i < n; i++) {
}

for (int j = 0; j < m; j++) {
}
```

**Answer:** `O(n + m)`

---

# Example 5: Nested Loops

```java
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
    }
}
```

**Answer:** `O(n²)`

Reason:

```text
n × n = n²
```

---

# Example 6: Triple Nested Loops

```java
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        for (int k = 0; k < n; k++) {
        }
    }
}
```

**Answer:** `O(n³)`

---

# Example 7: Logarithmic Loop

```java
for (int i = 1; i < n; i *= 2) {
}
```

**Answer:** `O(log n)`

Values:

```text
1
2
4
8
16
...
```

---

# Example 8: Halving Loop

```java
for (int i = n; i > 1; i /= 2) {
}
```

**Answer:** `O(log n)`

---

# Example 9: Square Root Loop

```java
for (int i = 1; i * i <= n; i++) {
}
```

**Answer:** `O(√n)`

---

# Example 10: Dependent Loop

```java
for (int i = 0; i < n; i++) {
    for (int j = 0; j < i; j++) {
    }
}
```

**Answer:** `O(n²)`

---

# Example 11: Nested Different Variables

```java
for (int i = 0; i < n; i++) {
    for (int j = 0; j < m; j++) {
    }
}
```

**Answer:** `O(nm)`

---

# Example 12: Constant Work

```java
int sum = 0;

for (int i = 0; i < n; i++) {
    sum++;
}
```

**Answer:** `O(n)`

---

# Example 13: Two Nested Logarithmic Loops

```java
for (int i = 1; i < n; i *= 2) {
    for (int j = 1; j < n; j *= 2) {
    }
}
```

**Answer:** `O((log n)²)`

---

# Example 14: Linear + Logarithmic

```java
for (int i = 0; i < n; i++) {
    for (int j = 1; j < n; j *= 2) {
    }
}
```

**Answer:** `O(n log n)`

---

# Example 15: Two Consecutive Nested Loops

```java
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
    }
}

for (int i = 0; i < n; i++) {
}
```

**Answer:**

```text
O(n²) + O(n)
```

Drop the smaller term:

```text
O(n²)
```

---

# Example 16: While Loop

```java
int i = 0;

while (i < n) {
    i++;
}
```

**Answer:** `O(n)`

---

# Example 17: While Loop (Doubling)

```java
int i = 1;

while (i < n) {
    i *= 2;
}
```

**Answer:** `O(log n)`

---

# Example 18: While Loop (Halving)

```java
int i = n;

while (i > 1) {
    i /= 2;
}
```

**Answer:** `O(log n)`

---

# Example 19: Nested While Loops

```java
int i = 0;

while (i < n) {
    int j = 0;

    while (j < n) {
        j++;
    }

    i++;
}
```

**Answer:** `O(n²)`

---

# Example 20: Binary Search Pattern

```java
int left = 0;
int right = n - 1;

while (left <= right) {
    int mid = (left + right) / 2;

    if (target < arr[mid])
        right = mid - 1;
    else
        left = mid + 1;
}
```

**Answer:** `O(log n)`

---

# Quick Summary

| Pattern                  | Time Complexity |
| ------------------------ | --------------- |
| One loop                 | `O(n)`          |
| Constant loop            | `O(1)`          |
| Two consecutive loops    | `O(n)`          |
| Nested loops             | `O(n²)`         |
| Triple nested loops      | `O(n³)`         |
| `i *= 2`                 | `O(log n)`      |
| `i /= 2`                 | `O(log n)`      |
| `i * i <= n`             | `O(√n)`         |
| Nested `n` and `m` loops | `O(nm)`         |
| Linear + logarithmic     | `O(n log n)`    |


## Task

**Instructions:** Determine the **Time Complexity** (`O(?)`) for each code snippet before checking the answer.

## Exercise 1

```java
for (int i = 0; i < n; i++) {
    System.out.println(i);
}
```

**Time Complexity:** __________

---

## Exercise 2

```java
for (int i = 0; i < 100; i++) {
    System.out.println(i);
}
```

**Time Complexity:** __________

---

## Exercise 3

```java
for (int i = 0; i < n; i++) {
}

for (int i = 0; i < n; i++) {
}
```

**Time Complexity:** __________

---

## Exercise 4

```java
for (int i = 0; i < n; i++) {
}

for (int j = 0; j < m; j++) {
}
```

**Time Complexity:** __________

---

## Exercise 5

```java
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
    }
}
```

**Time Complexity:** __________

---

## Exercise 6

```java
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        for (int k = 0; k < n; k++) {
        }
    }
}
```

**Time Complexity:** __________

---

## Exercise 7

```java
for (int i = 1; i < n; i *= 2) {
}
```

**Time Complexity:** __________

---

## Exercise 8

```java
for (int i = n; i > 1; i /= 2) {
}
```

**Time Complexity:** __________

---

## Exercise 9

```java
for (int i = 1; i * i <= n; i++) {
}
```

**Time Complexity:** __________

---

## Exercise 10

```java
for (int i = 0; i < n; i++) {
    for (int j = 0; j < i; j++) {
    }
}
```

**Time Complexity:** __________

---

## Exercise 11

```java
for (int i = 0; i < n; i++) {
    for (int j = 0; j < m; j++) {
    }
}
```

**Time Complexity:** __________

---

## Exercise 12

```java
int sum = 0;

for (int i = 0; i < n; i++) {
    sum++;
}
```

**Time Complexity:** __________

---

## Exercise 13

```java
for (int i = 1; i < n; i *= 2) {
    for (int j = 1; j < n; j *= 2) {
    }
}
```

**Time Complexity:** __________

---

## Exercise 14

```java
for (int i = 0; i < n; i++) {
    for (int j = 1; j < n; j *= 2) {
    }
}
```

**Time Complexity:** __________

---

## Exercise 15

```java
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
    }
}

for (int i = 0; i < n; i++) {
}
```

**Time Complexity:** __________

---

## Exercise 16

```java
int i = 0;

while (i < n) {
    i++;
}
```

**Time Complexity:** __________

---

## Exercise 17

```java
int i = 1;

while (i < n) {
    i *= 2;
}
```

**Time Complexity:** __________

---

## Exercise 18

```java
int i = n;

while (i > 1) {
    i /= 2;
}
```

**Time Complexity:** __________

---

## Exercise 19

```java
int i = 0;

while (i < n) {
    int j = 0;

    while (j < n) {
        j++;
    }

    i++;
}
```

**Time Complexity:** __________

---

## Exercise 20

```java
int left = 0;
int right = n - 1;

while (left <= right) {
    int mid = (left + right) / 2;

    if (target < arr[mid])
        right = mid - 1;
    else
        left = mid + 1;
}
```

**Time Complexity:** __________