# 001. Check Odd Even

**Topic:** Bit Manipulation
**Difficulty:** Easy
**Solution file:** [`001-Check-Odd-Even.java`](./001-Check-Odd-Even.java)

## Problem

Given an integer, determine whether it is odd or even using a bitwise AND with 1 instead of the modulo operator.

## Technique Reminder

Use bitwise operators (&, |, ^, ~, <<, >>) for compact and fast computation.

**Hint:** Think in binary. XOR cancels duplicates, AND/OR/shift can isolate or test specific bits.

## Example

```
Input:  n = 7
Output: "Odd"
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

See [`001-Check-Odd-Even.java`](./001-Check-Odd-Even.java) in this folder — implement the `TODO` inside `CheckOddEven.checkOddEven(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
