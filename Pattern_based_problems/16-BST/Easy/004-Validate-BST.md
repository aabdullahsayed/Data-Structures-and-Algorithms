# 004. Validate BST

**Topic:** BST
**Difficulty:** Easy
**Solution file:** [`004-Validate-BST.java`](./004-Validate-BST.java)

## Problem

Given the root of a binary tree, determine whether it is a valid Binary Search Tree.

## Technique Reminder

Binary Search Tree specific properties: left < root < right.

**Hint:** Use the BST ordering property to prune search space, just like binary search.

## Example

```
Input:  tree = [2,1,3]
Output: true
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

See [`004-Validate-BST.java`](./004-Validate-BST.java) in this folder — implement the `TODO` inside `ValidateBST.validateBst(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
