# 001. Print Two Indices

**Topic:** Two Pointers
**Difficulty:** Easy
**Solution file:** [`001-Print-Two-Indices.java`](./001-Print-Two-Indices.java)

## Problem

Given a sorted array of integers and a target value, find two indices i and j (i < j) such that arr[i] + arr[j] equals the target. Print the pair of indices, or -1 -1 if no such pair exists.

## Technique Reminder

Use two indices moving through the data (from ends, or one fast/one slow) to avoid nested loops.

**Hint:** Think about what invariant lets you move `left` or `right` without missing a valid answer.

## Example

```
Input:  arr = [1, 2, 3, 4, 6], target = 6
Output: 1 3   (arr[1] + arr[3] = 2 + 4 = 6)
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

See [`001-Print-Two-Indices.java`](./001-Print-Two-Indices.java) in this folder — implement the `TODO` inside `PrintTwoIndices.printTwoIndices(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
