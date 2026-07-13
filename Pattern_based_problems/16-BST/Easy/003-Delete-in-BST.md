# 003. Delete in BST

**Topic:** BST
**Difficulty:** Easy
**Solution file:** [`003-Delete-in-BST.java`](./003-Delete-in-BST.java)

## Problem

Given the root of a BST and a key, delete the node with that key while maintaining the BST property (handle the 0, 1, and 2-child cases).

## Technique Reminder

Binary Search Tree specific properties: left < root < right.

**Hint:** Use the BST ordering property to prune search space, just like binary search.

## Example

```
Input:  bst = [5,3,6,2,4,null,7], delete 3
Output: bst = [5,4,6,2,null,null,7]
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

See [`003-Delete-in-BST.java`](./003-Delete-in-BST.java) in this folder — implement the `TODO` inside `DeleteInBST.deleteInBst(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
