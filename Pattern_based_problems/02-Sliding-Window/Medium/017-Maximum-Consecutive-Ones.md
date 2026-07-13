# 017. Maximum Consecutive Ones

**Topic:** Sliding Window
**Difficulty:** Medium
**Solution file:** [`017-Maximum-Consecutive-Ones.java`](./017-Maximum-Consecutive-Ones.java)

## Problem

Given a binary array and an integer k, find the maximum number of consecutive 1s obtainable if you can flip at most k zeros to ones.

## Technique Reminder

Maintain a window [left, right] over the array/string and expand/shrink it based on a condition.

**Hint:** Decide what the window must track (sum, count, frequency map) and when to shrink it.

## Example

```
Input:  nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
Output: 6
```

## Constraints (typical range — adjust to the exact source problem if it differs)

- 1 <= n <= 10^5
- Values fit in standard 32-bit integer range

## Approach Notes

1. Restate the problem in your own words.
2. Identify why the **Sliding Window** pattern applies here.
3. Work out a time & space complexity target before coding (usually O(n) or O(n log n)).
4. Code the brute-force approach first if unsure, then optimize using the pattern.

## Starter Code

See [`017-Maximum-Consecutive-Ones.java`](./017-Maximum-Consecutive-Ones.java) in this folder — implement the `TODO` inside `MaximumConsecutiveOnes.maximumConsecutiveOnes(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
