# 010. BST Iterator

**Topic:** BST
**Difficulty:** Medium
**Solution file:** [`010-BST-Iterator.java`](./010-BST-Iterator.java)

## Problem

Design an iterator over a BST that supports next() (returns the next smallest value) and hasNext(), running in average O(1) time per call using a controlled (stack-based) inorder traversal.

## Technique Reminder

Binary Search Tree specific properties: left < root < right.

**Hint:** Use the BST ordering property to prune search space, just like binary search.

## Example

```
Input:  bst = [7,3,15,null,null,9,20]; next(); next(); hasNext()
Output: 3, 7, true
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

See [`010-BST-Iterator.java`](./010-BST-Iterator.java) in this folder — implement the `TODO` inside `BSTIterator.bstIterator(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
