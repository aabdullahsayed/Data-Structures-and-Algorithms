# 001. Activity Selection

**Topic:** Greedy
**Difficulty:** Easy
**Solution file:** [`001-Activity-Selection.java`](./001-Activity-Selection.java)

## Problem

Given the start and end times of several activities, select the maximum number of non-overlapping activities that a single person can perform, by greedily picking the activity that finishes earliest.

## Technique Reminder

Make the locally optimal choice at each step and prove (or trust) it leads to a global optimum.

**Hint:** Sort by some criterion first, then make one pass making the best local choice.

## Example

```
Input:  start=[1,3,0,5,8,5], end=[2,4,6,7,9,9]
Output: 4
```

## Constraints (typical range — adjust to the exact source problem if it differs)

- 1 <= n <= 10^5
- Values fit in standard 32-bit integer range

## Approach Notes

1. Restate the problem in your own words.
2. Identify why the **Greedy** pattern applies here.
3. Work out a time & space complexity target before coding (usually O(n) or O(n log n)).
4. Code the brute-force approach first if unsure, then optimize using the pattern.

## Starter Code

See [`001-Activity-Selection.java`](./001-Activity-Selection.java) in this folder — implement the `TODO` inside `ActivitySelection.activitySelection(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
