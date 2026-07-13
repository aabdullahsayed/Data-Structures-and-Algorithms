# 007. Subsets Using Bitmask

**Topic:** Bit Manipulation
**Difficulty:** Medium
**Solution file:** [`007-Subsets-Using-Bitmask.java`](./007-Subsets-Using-Bitmask.java)

## Problem

Given a set of n elements, generate all 2^n subsets by enumerating bitmasks from 0 to 2^n - 1, where each set bit indicates an element is included.

## Technique Reminder

Use bitwise operators (&, |, ^, ~, <<, >>) for compact and fast computation.

**Hint:** Think in binary. XOR cancels duplicates, AND/OR/shift can isolate or test specific bits.

## Example

```
Input:  arr = [1,2,3]
Output: 8 subsets, including [] and [1,2,3]
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

See [`007-Subsets-Using-Bitmask.java`](./007-Subsets-Using-Bitmask.java) in this folder — implement the `TODO` inside `SubsetsUsingBitmask.subsetsUsingBitmask(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
