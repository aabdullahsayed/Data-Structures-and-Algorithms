# 008. Convert Sorted Array to BST

**Topic:** BST
**Difficulty:** Medium
**Solution file:** [`008-Convert-Sorted-Array-to-BST.java`](./008-Convert-Sorted-Array-to-BST.java)

## Problem

Given a sorted array, convert it into a height-balanced Binary Search Tree.

## Technique Reminder

Binary Search Tree specific properties: left < root < right.

**Hint:** Use the BST ordering property to prune search space, just like binary search.

## Example

```
Input:  arr = [-10,-3,0,5,9]
Output: a height-balanced BST, e.g. root value 0
```

## Constraints (typical range — adjust to the exact source problem if it differs)

- 1 <= n <= 10^5
- Values fit in standard 32-bit integer range

## Approach Notes

1. Restate the problem in your own words.
2. Identify why the **BST** pattern applies here.
3. Work out a time & space complexity target before coding (usually O(n) or O(n log n)).
4. Code the brute-force approach first if unsure, then optimize using the pattern.

## Starter Code

See [`008-Convert-Sorted-Array-to-BST.java`](./008-Convert-Sorted-Array-to-BST.java) in this folder — implement the `TODO` inside `ConvertSortedArrayToBST.convertSortedArrayToBst(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
