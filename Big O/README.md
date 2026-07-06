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

### Easy Way to Remember

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

| Algorithm | Best Case | Average Case | Worst Case | Space Complexity |
|------------|:---------:|:------------:|:----------:|:----------------:|
| Linear Search | **O(1)** | **O(n)** | **O(n)** | **O(1)** |
| Binary Search | **O(1)** | **O(log n)** | **O(log n)** | **O(1)** |
| Bubble Sort | **O(n)** | **O(n²)** | **O(n²)** | **O(1)** |
| Selection Sort | **O(n²)** | **O(n²)** | **O(n²)** | **O(1)** |
| Insertion Sort | **O(n)** | **O(n²)** | **O(n²)** | **O(1)** |
| Merge Sort | **O(n log n)** | **O(n log n)** | **O(n log n)** | **O(n)** |
| Quick Sort | **O(n log n)** | **O(n log n)** | **O(n²)** | **O(log n)** |
| Heap Sort | **O(n log n)** | **O(n log n)** | **O(n log n)** | **O(1)** |
| Counting Sort | **O(n + k)** | **O(n + k)** | **O(n + k)** | **O(n + k)** |
| BFS (Breadth-First Search) | **O(V + E)** | **O(V + E)** | **O(V + E)** | **O(V)** |
| DFS (Depth-First Search) | **O(V + E)** | **O(V + E)** | **O(V + E)** | **O(V)** |
| Dijkstra (Priority Queue) | **O((V + E) log V)** | **O((V + E) log V)** | **O((V + E) log V)** | **O(V)** |

> **Legend**
>
> - `n` = Number of elements
> - `V` = Number of vertices (nodes)
> - `E` = Number of edges
> - `k` = Range of input values (used in Counting Sort)

---

### Easy Way to Remember

| Algorithm | Memory Trick |
|------------|--------------|
| Linear Search | Check one by one |
| Binary Search | Cut the search space in half |
| Bubble Sort | Biggest element "bubbles" to the end |
| Selection Sort | Find the smallest each time |
| Insertion Sort | Insert each element into the correct position |
| Merge Sort | Divide → Sort → Merge |
| Quick Sort | Choose a pivot and partition |
| Heap Sort | Use a heap (priority queue) |
| BFS | Explore level by level |
| DFS | Go as deep as possible before backtracking |
| Dijkstra | Find the shortest path |

---

### Interview Cheat Sheet

| Problem Type | Common Algorithm | Time Complexity |
|--------------|------------------|-----------------|
| Search in an unsorted array | Linear Search | **O(n)** |
| Search in a sorted array | Binary Search | **O(log n)** |
| Fast general-purpose sorting | Merge Sort | **O(n log n)** |
| In-place fast sorting | Quick Sort (Average) | **O(n log n)** |
| Guaranteed in-place sorting | Heap Sort | **O(n log n)** |
| Traverse a tree or graph | DFS | **O(V + E)** |
| Shortest path in a weighted graph | Dijkstra | **O((V + E) log V)** |

---

## Notes

| Algorithm | Time Complexity |
|------------|-----------------|
| Linear Search | **O(n)** |
| Binary Search | **O(log n)** |
| Bubble Sort | **O(n²)** |
| Selection Sort | **O(n²)** |
| Insertion Sort | **O(n²)** |
| Merge Sort | **O(n log n)** |
| Quick Sort (Average) | **O(n log n)** |
| Heap Sort | **O(n log n)** |
| BFS | **O(V + E)** |
| DFS | **O(V + E)** |

## Basic recursion complexity
# Basic Recursion Complexity

Recursion is a technique where a function **calls itself** to solve a smaller version of the same problem.

To find the complexity of a recursive function, ask two questions:

1. **How many recursive calls are made?**
2. **How much work is done in each call?**

---

### Rule 1: One Recursive Call

```java
void print(int n) {
    if (n == 0)
        return;

    System.out.println(n);
    print(n - 1);
}
```

Call sequence:

```text
print(5)
 └── print(4)
      └── print(3)
           └── print(2)
                └── print(1)
                     └── print(0)
```

- Recursive calls: `n`
- Work per call: `O(1)`

**Time Complexity:** `O(n)`

**Space Complexity:** `O(n)` (call stack)

---

### Rule 2: Two Recursive Calls

```java
void fun(int n) {
    if (n == 0)
        return;

    fun(n - 1);
    fun(n - 1);
}
```

Each function creates **2 more calls**.

Call tree:

```text
          n
        /   \
     n-1   n-1
     / \   / \
```

**Time Complexity:** `O(2ⁿ)`

**Space Complexity:** `O(n)`

---

### Rule 3: Binary Search Recursion

```java
int binarySearch(int[] arr, int left, int right, int target) {
    if (left > right)
        return -1;

    int mid = (left + right) / 2;

    if (arr[mid] == target)
        return mid;

    if (target < arr[mid])
        return binarySearch(arr, left, mid - 1, target);

    return binarySearch(arr, mid + 1, right, target);
}
```

Each call searches **half** of the array.

**Time Complexity:** `O(log n)`

**Space Complexity:** `O(log n)`

---

### Rule 4: Factorial

```java
int factorial(int n) {
    if (n == 0)
        return 1;

    return n * factorial(n - 1);
}
```

Calls:

```text
5
↓
4
↓
3
↓
2
↓
1
↓
0
```

**Time Complexity:** `O(n)`

**Space Complexity:** `O(n)`

---

### Rule 5: Fibonacci (Naive)

```java
int fib(int n) {
    if (n <= 1)
        return n;

    return fib(n - 1) + fib(n - 2);
}
```

Call tree:

```text
        fib(5)
       /      \
   fib(4)    fib(3)
   /   \      /   \
```

Many calls are repeated.

**Time Complexity:** `O(2ⁿ)`

**Space Complexity:** `O(n)`

---

### Rule 6: Tail Recursion

```java
void print(int n) {
    if (n == 0)
        return;

    print(n - 1);
}
```

One recursive call per function.

**Time Complexity:** `O(n)`

**Space Complexity:** `O(n)`

---

### Easy Rules

| Pattern | Time Complexity | Space Complexity |
|---------|-----------------|------------------|
| One recursive call (`n-1`) | `O(n)` | `O(n)` |
| One recursive call (`n/2`) | `O(log n)` | `O(log n)` |
| Two recursive calls | `O(2ⁿ)` | `O(n)` |
| Factorial | `O(n)` | `O(n)` |
| Binary Search (recursive) | `O(log n)` | `O(log n)` |
| Naive Fibonacci | `O(2ⁿ)` | `O(n)` |

---

### Memory Trick

- **One recursive call** → Usually **`O(n)`**
- **Array/problem size halves each call** → **`O(log n)`**
- **Two recursive calls** → Usually **`O(2ⁿ)`**
- **Recursion uses stack memory**, so space complexity is usually equal to the **maximum recursion depth**.

---


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