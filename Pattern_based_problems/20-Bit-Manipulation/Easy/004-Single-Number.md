# 004. Single Number

**Topic:** Bit Manipulation
**Difficulty:** Easy
**Solution file:** [`004-Single-Number.java`](./004-Single-Number.java)

## Problem

Given a non-empty array where every element appears exactly twice except for one which appears once, find that single element in O(n) time and O(1) extra space, using XOR.

## Technique Reminder

Use bitwise operators (&, |, ^, ~, <<, >>) for compact and fast computation.

**Hint:** Think in binary. XOR cancels duplicates, AND/OR/shift can isolate or test specific bits.

## Example

```
Input:  arr = [4,1,2,1,2]
Output: 4
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

See [`004-Single-Number.java`](./004-Single-Number.java) in this folder — implement the `TODO` inside `SingleNumber.singleNumber(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
