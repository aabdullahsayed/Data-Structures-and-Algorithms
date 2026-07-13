# 012. Vertical Order Traversal

**Topic:** Trees
**Difficulty:** Medium
**Solution file:** [`012-Vertical-Order-Traversal.java`](./012-Vertical-Order-Traversal.java)

## Problem

Given the root of a binary tree, group its node values by vertical column (horizontal distance from the root), ordered top-to-bottom within each column and columns left-to-right.

## Technique Reminder

Binary tree traversal and properties (DFS/BFS based).

**Hint:** Most tree problems are recursive: solve for the root using solutions of its subtrees.

## Example

```
Input:  tree = [3,9,20,null,null,15,7]
Output: [[9],[3,15],[20],[7]]
```

## Constraints (typical range — adjust to the exact source problem if it differs)

- 1 <= n <= 10^5
- Values fit in standard 32-bit integer range

## Approach Notes

1. Restate the problem in your own words.
2. Identify why the **Trees** pattern applies here.
3. Work out a time & space complexity target before coding (usually O(n) or O(n log n)).
4. Code the brute-force approach first if unsure, then optimize using the pattern.

## Starter Code

See [`012-Vertical-Order-Traversal.java`](./012-Vertical-Order-Traversal.java) in this folder — implement the `TODO` inside `VerticalOrderTraversal.verticalOrderTraversal(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
