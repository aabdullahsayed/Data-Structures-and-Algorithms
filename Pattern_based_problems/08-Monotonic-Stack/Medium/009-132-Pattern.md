# 009. 132 Pattern

**Topic:** Monotonic Stack
**Difficulty:** Medium
**Solution file:** [`009-132-Pattern.java`](./009-132-Pattern.java)

## Problem

Given an array, determine whether it contains a '132 pattern': indices i < j < k such that arr[i] < arr[k] < arr[j].

## Technique Reminder

A stack that stays increasing or decreasing, used to find next/previous greater or smaller elements in O(n).

**Hint:** Pop elements that violate the monotonic property before pushing the new one.

## Example

```
Input:  arr = [3,1,4,2]
Output: true
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

See [`009-132-Pattern.java`](./009-132-Pattern.java) in this folder — implement the `TODO` inside `132Pattern.132Pattern(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
