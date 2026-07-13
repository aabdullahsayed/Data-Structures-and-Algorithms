# 006. Kth Smallest in BST

**Topic:** BST
**Difficulty:** Medium
**Solution file:** [`006-Kth-Smallest-in-BST.java`](./006-Kth-Smallest-in-BST.java)

## Problem

Given the root of a BST and an integer k, find the kth smallest value stored in the tree, using an inorder traversal.

## Technique Reminder

Binary Search Tree specific properties: left < root < right.

**Hint:** Use the BST ordering property to prune search space, just like binary search.

## Example

```
Input:  bst = [3,1,4,null,2], k = 1
Output: 1
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

See [`006-Kth-Smallest-in-BST.java`](./006-Kth-Smallest-in-BST.java) in this folder — implement the `TODO` inside `KthSmallestInBST.kthSmallestInBst(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
