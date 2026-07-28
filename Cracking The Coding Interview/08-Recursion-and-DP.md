# Chapter 8: Recursion & Dynamic Programming

## Easy Explanation
**Recursion** is a function that solves a problem by calling a smaller version of itself, until it reaches a base case simple enough to answer directly. Think of Russian nesting dolls — each doll contains a smaller version of itself.

**Dynamic Programming (DP)** is recursion **plus memory**. If you notice you're solving the *same* smaller subproblem over and over, you save ("memoize") the answer the first time so you never redo the work.

## Why It Matters
Recursive thinking is everywhere (trees, backtracking, divide & conquer). DP specifically shows up in "optimize this" or "count all ways to do X" problems, and it's one of the trickiest topics to get comfortable with — practice really pays off here.

## How to Approach Recursion
1. Find the **base case** (the simplest input where you know the answer directly).
2. Figure out how to **reduce** a bigger problem into a smaller one that gets you closer to the base case.
3. Trust the recursion — assume the smaller call already works correctly (this is called "the leap of faith").

## How to Approach DP
1. Write the **brute-force recursive solution** first.
2. Identify **overlapping subproblems** (the same inputs being recalculated).
3. Add a **memo (cache)** — usually a dict or array — to store results (this is called "top-down" memoization).
4. Optionally convert to **"bottom-up"**: build the answer iteratively from the base cases upward, often saving space too.

## Key Complexity
Without memoization, recursive problems like Fibonacci are O(2^n) — exponential, very slow.
With memoization, most DP problems drop to O(n) or O(n²) — because each subproblem is only solved once.

## Classic Problems

### 1. Triple Step — Count ways to climb n stairs taking 1, 2, or 3 steps at a time
**Easy idea:** `ways(n) = ways(n-1) + ways(n-2) + ways(n-3)`. Memoize by `n`.

### 2. Robot in a Grid — Count/find a path from top-left to bottom-right avoiding blocked cells
**Easy idea:** `path(r, c) = path(r-1, c) or path(r, c-1)`, moving only right/down. Memoize failed cells so you don't re-explore them.

### 3. Magic Index — Find an index where `arr[i] == i` (sorted array, may have duplicates)
**Easy idea:** Modified binary search — even with duplicates, you can skip large chunks safely.

### 4. Power Set — All subsets of a set
**Easy idea:** For each element, you either include it or don't — this doubles the subsets each time. `2^n` total subsets.

### 5. Recursive Multiply — Multiply two numbers using only addition
**Easy idea:** `multiply(a, b) = multiply(a, b/2) + multiply(a, b/2)`, doubling one result if b is odd. Halving b each time gives O(log b).

### 6. Towers of Hanoi
**Easy idea:** To move n disks from A to C: move n-1 disks A→B, move the biggest disk A→C, move n-1 disks B→C.

### 7. Permutations without Dups
**Easy idea:** Pick each remaining character as the "next" character, recursively permute what's left, then backtrack.

### 8. Coins — Count ways to make change for an amount using given coin denominations
**Easy idea (classic DP):** `ways(amount, coins) = ways(amount, coins without last coin) + ways(amount - last coin, coins)`. Build a DP table bottom-up.

### 9. Paint Fill (Flood Fill) — Like the "bucket" tool in image editors
**Easy idea:** DFS/BFS out from the starting pixel, changing color and continuing while neighbors match the original color.

### 10. Coins/Stack Box / Boolean Evaluation
**Easy idea:** Nearly all "count the number of ways" problems follow the same DP shape: define subproblem, find recurrence, memoize.

## Practice Tip
When you notice yourself drawing the same recursive call twice on paper, that's your cue: this problem wants memoization.
