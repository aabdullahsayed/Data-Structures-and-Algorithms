# 016. Triplet With Given Sum

**Topic:** Two Pointers
**Difficulty:** Medium
**Solution file:** [`016-Triplet-With-Given-Sum.java`](./016-Triplet-With-Given-Sum.java)

## Problem

Given an array, determine if there exists a triplet of elements that sums to a given target. Return the triplet (sort first, fix one element, two-pointer the rest).

## Technique Reminder

Use two indices moving through the data (from ends, or one fast/one slow) to avoid nested loops.

**Hint:** Think about what invariant lets you move `left` or `right` without missing a valid answer.

## Example

```
Input:  arr = [12, 3, 4, 1, 6, 9], target = 24
Output: [3, 12, 9]
```

## Constraints (typical range — adjust to the exact source problem if it differs)

- 1 <= n <= 10^5
- Values fit in standard 32-bit integer range

## Approach Notes

1. Restate the problem in your own words.
2. Identify why the **Two Pointers** pattern applies here.
3. Work out a time & space complexity target before coding (usually O(n) or O(n log n)).
4. Code the brute-force approach first if unsure, then optimize using the pattern.

## Starter Code

See [`016-Triplet-With-Given-Sum.java`](./016-Triplet-With-Given-Sum.java) in this folder — implement the `TODO` inside `TripletWithGivenSum.tripletWithGivenSum(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
