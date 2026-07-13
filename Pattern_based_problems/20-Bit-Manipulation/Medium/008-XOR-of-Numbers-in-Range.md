# 008. XOR of Numbers in Range

**Topic:** Bit Manipulation
**Difficulty:** Medium
**Solution file:** [`008-XOR-of-Numbers-in-Range.java`](./008-XOR-of-Numbers-in-Range.java)

## Problem

Given two integers L and R, compute the XOR of every integer from L to R (inclusive) without looping through the whole range, using the formula for XOR from 1 to n.

## Technique Reminder

Use bitwise operators (&, |, ^, ~, <<, >>) for compact and fast computation.

**Hint:** Think in binary. XOR cancels duplicates, AND/OR/shift can isolate or test specific bits.

## Example

```
Input:  L = 3, R = 9
Output: 2
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

See [`008-XOR-of-Numbers-in-Range.java`](./008-XOR-of-Numbers-in-Range.java) in this folder — implement the `TODO` inside `XOROfNumbersInRange.xorOfNumbersInRange(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
