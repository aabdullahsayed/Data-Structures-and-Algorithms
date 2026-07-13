# 001. Next Greater Element I

**Topic:** Monotonic Stack
**Difficulty:** Easy
**Solution file:** [`001-Next-Greater-Element-I.java`](./001-Next-Greater-Element-I.java)

## Problem

Given two arrays where nums1 is a subset of nums2, for each element of nums1 find its next greater element within nums2 (or -1 if none exists), using a monotonic stack.

## Technique Reminder

A stack that stays increasing or decreasing, used to find next/previous greater or smaller elements in O(n).

**Hint:** Pop elements that violate the monotonic property before pushing the new one.

## Example

```
Input:  nums1 = [4,1,2], nums2 = [1,3,4,2]
Output: [-1,3,-1]
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

See [`001-Next-Greater-Element-I.java`](./001-Next-Greater-Element-I.java) in this folder — implement the `TODO` inside `NextGreaterElementI.nextGreaterElementI(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
