# 015. Binary Search on Answer

**Topic:** Binary Search
**Difficulty:** Medium
**Solution file:** [`015-Binary-Search-on-Answer.java`](./015-Binary-Search-on-Answer.java)

## Problem

General pattern: given a monotonic condition over a range of possible answers, binary search on the answer itself (not the array) to find the minimum/maximum valid answer. Implement a concrete instance: Koko Eating Bananas — given piles of bananas and h hours, find the minimum integer eating speed k such that Koko can finish all piles within h hours.

## Technique Reminder

Search a sorted space (array or answer range) by repeatedly halving it.

**Hint:** Define a clear predicate that is False...False,True...True (or vice versa) over the search space.

## Example

```
Input:  piles = [3,6,7,11], h = 8
Output: 4
```

## Constraints (typical range — adjust to the exact source problem if it differs)

- 1 <= n <= 10^5
- Values fit in standard 32-bit integer range

## Approach Notes

1. Restate the problem in your own words.
2. Identify why the **Binary Search** pattern applies here.
3. Work out a time & space complexity target before coding (usually O(n) or O(n log n)).
4. Code the brute-force approach first if unsure, then optimize using the pattern.

## Starter Code

See [`015-Binary-Search-on-Answer.java`](./015-Binary-Search-on-Answer.java) in this folder — implement the `TODO` inside `BinarySearchOnAnswer.binarySearchOnAnswer(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
