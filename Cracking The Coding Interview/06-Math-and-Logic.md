# Chapter 6: Math & Logic Puzzles

## Easy Explanation
These questions test how you reason through a problem step by step, not memorized formulas. Interviewers care more about your **thought process** than the final answer.

## Why It Matters
Even if you've never seen the exact puzzle, breaking it into smaller pieces and reasoning out loud shows problem-solving skill — which is really what's being tested.

## Useful Math Facts
- **Prime numbers**: only divisible by 1 and themselves. To check primality, you only need to test divisors up to √n.
- **Sieve of Eratosthenes**: efficient way to find all primes up to n by crossing out multiples.
- **GCD (Greatest Common Divisor)**: use the Euclidean algorithm — `gcd(a, b) = gcd(b, a % b)`.
- **Probability basics**: P(A and B) = P(A) × P(B) if independent. P(A or B) = P(A) + P(B) − P(A and B).

## Common Patterns
- **Work backward from a small example** (n = 1, 2, 3) to spot a pattern.
- **Think about edge cases** (0, negative numbers, empty input).
- **Simplify the problem** — solve an easier version first, then generalize.

## Classic Problems

### 1. The Missing Number — Find the missing number from 1 to N given N-1 numbers
**Easy idea:** Use the formula for sum of 1 to N: `N*(N+1)/2`, then subtract the actual sum.

### 2. Number Swapper — Swap two numbers without a temp variable
**Easy idea:** `a = a + b; b = a - b; a = a - b;` (or use XOR).

### 3. TicTacToe Winner — Efficiently check who won a game board
**Easy idea:** Track running sums for each row, column, and diagonal as moves are made — no need to rescan the whole board.

### 4. Factorial Zeros — How many trailing zeros in n!?
**Easy idea:** Zeros come from factors of 10 = 2 × 5. There are always more factors of 2 than 5, so just count factors of 5 in 1...n.

### 5. Smallest Difference — Given two arrays, find the pair with the smallest absolute difference
**Easy idea:** Sort both arrays, then use two pointers moving through both simultaneously.

### 6. Master Mind — Score a guess against a secret code (hits and "pseudo-hits")
**Easy idea:** First pass counts exact position matches; second pass counts color matches at different positions.

### 7. Sub Sort — Find the shortest subarray that, if sorted, makes the whole array sorted
**Easy idea:** Find where the array stops being in increasing order from the left, and from the right, then check the min/max in between to expand the boundaries correctly.

### 8. Pond Sizes — Given a matrix of heights, find the size of every "pond" (connected group of 0s)
**Easy idea:** This is really a graph problem — for each unvisited 0, do a DFS/BFS to find all connected 0s and count them.

## Practice Tip
Talk through your reasoning out loud, even (especially) if you're not sure. Interviewers are grading your thinking, not just your final answer.
