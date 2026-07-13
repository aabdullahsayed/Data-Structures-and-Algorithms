# 008. Remove K Digits

**Topic:** Monotonic Stack
**Difficulty:** Medium
**Solution file:** [`008-Remove-K-Digits.java`](./008-Remove-K-Digits.java)

## Problem

Given a non-negative integer represented as a string and an integer k, remove k digits from the number so that the resulting number is the smallest possible (use a monotonic increasing stack of digits).

## Technique Reminder

A stack that stays increasing or decreasing, used to find next/previous greater or smaller elements in O(n).

**Hint:** Pop elements that violate the monotonic property before pushing the new one.

## Example

```
Input:  num = "1432219", k = 3
Output: "1219"
```

## Constraints (typical range — adjust to the exact source problem if it differs)

- 1 <= n <= 10^5
- Values fit in standard 32-bit integer range

## Approach Notes

1. Restate the problem in your own words.
2. Identify why the **Monotonic Stack** pattern applies here.
3. Work out a time & space complexity target before coding (usually O(n) or O(n log n)).
4. Code the brute-force approach first if unsure, then optimize using the pattern.

## Starter Code

See [`008-Remove-K-Digits.java`](./008-Remove-K-Digits.java) in this folder — implement the `TODO` inside `RemoveKDigits.removeKDigits(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
