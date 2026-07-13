# 009. Counting Bits

**Topic:** Bit Manipulation
**Difficulty:** Medium
**Solution file:** [`009-Counting-Bits.java`](./009-Counting-Bits.java)

## Problem

Given an integer n, return an array where the ith entry is the number of set bits in the binary representation of i, for every i from 0 to n, computed in O(n) total using a DP relation on lower bits.

## Technique Reminder

Use bitwise operators (&, |, ^, ~, <<, >>) for compact and fast computation.

**Hint:** Think in binary. XOR cancels duplicates, AND/OR/shift can isolate or test specific bits.

## Example

```
Input:  n = 5
Output: [0,1,1,2,1,2]
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

See [`009-Counting-Bits.java`](./009-Counting-Bits.java) in this folder — implement the `TODO` inside `CountingBits.countingBits(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
