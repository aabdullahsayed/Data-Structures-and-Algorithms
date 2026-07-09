
### 1. Introduction to Algorithms

* Defines an algorithm simply as a **set of instructions** for accomplishing a task.

### 2. Binary Search

* Explains **Binary Search**, a search algorithm that finds an item in a **sorted list** by repeatedly cutting the search space in half.
* Contrasts it with **Simple Search** (checking elements one by one).
* For a list of 4 billion items, simple search could take 4 billion steps, while binary search takes a maximum of only **32 steps**.

### 3. Big O Notation

* Introduces **Big O notation**, which measures how fast an algorithm is by counting the **growth rate of operations** relative to the input size ($n$).
* Emphasizes that Big O establishes a **worst-case** performance ceiling.
* Highlights the two running times introduced so far:
* Simple Search $\rightarrow O(n)$ (Linear time)
* Binary Search $\rightarrow O(\log n)$ (Logarithmic time)



### 4. The Traveling Salesperson Problem

* Introduces a notoriously slow algorithm that runs in **Factorial Time** ($O(n!)$).
* Illustrates that some problems grow so rapidly that they become impossible to solve perfectly as the input size increases, requiring approximation algorithms instead.