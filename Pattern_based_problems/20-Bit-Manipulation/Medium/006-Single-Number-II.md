# 006. Single Number II

**Topic:** Bit Manipulation
**Difficulty:** Medium
**Solution file:** [`006-Single-Number-II.java`](./006-Single-Number-II.java)

## Problem

Given an array where every element appears exactly three times except for one which appears exactly once, find that single element using bitwise counting per bit position.

## Technique Reminder

Use bitwise operators (&, |, ^, ~, <<, >>) for compact and fast computation.

**Hint:** Think in binary. XOR cancels duplicates, AND/OR/shift can isolate or test specific bits.

## Example

```
Input:  arr = [2,2,3,2]
Output: 3
```

## Constraints (typical range — adjust to the exact source problem if it differs)

- 1 <= n <= 10^5
- Values fit in standard 32-bit integer range

## Approach Notes

1. Restate the problem in your own words.
2. Identify why the **Bit Manipulation** pattern applies here.
3. Work out a time & space complexity target before coding (usually O(n) or O(n log n)).
4. Code the brute-force approach first if unsure, then optimize using the pattern.

## Starter Code

See [`006-Single-Number-II.java`](./006-Single-Number-II.java) in this folder — implement the `TODO` inside `SingleNumberII.singleNumberIi(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
