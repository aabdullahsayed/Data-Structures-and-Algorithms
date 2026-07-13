# 007. First Negative in Window

**Topic:** Queue
**Difficulty:** Easy
**Solution file:** [`007-First-Negative-in-Window.java`](./007-First-Negative-in-Window.java)

## Problem

Given an array and window size k, find the first negative number in every window of size k.

## Technique Reminder

FIFO structure, useful for order-preserving processing and BFS-style problems.

**Hint:** Ask what needs to be processed in the order it arrived.

## Example

```
Input:  arr = [12,-1,-7,8,-15,30,16,28], k = 3
Output: [-1,-1,-7,-15,-15,0]
```

## Constraints (typical range — adjust to the exact source problem if it differs)

- 1 <= n <= 10^5
- Values fit in standard 32-bit integer range

## Approach Notes

1. Restate the problem in your own words.
2. Identify why the **Queue** pattern applies here.
3. Work out a time & space complexity target before coding (usually O(n) or O(n log n)).
4. Code the brute-force approach first if unsure, then optimize using the pattern.

## Starter Code

See [`007-First-Negative-in-Window.java`](./007-First-Negative-in-Window.java) in this folder — implement the `TODO` inside `FirstNegativeInWindow.firstNegativeInWindow(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
