# 49. Balanced Binary Tree

**Difficulty:** Easy

**Pattern:** Bottom-up DFS returning height, short-circuiting with -1 sentinel on imbalance

## Key Idea
A tree is height-balanced if every node's two subtrees differ in height by at most 1; compute height bottom-up and bail out early (using a sentinel like -1) the moment imbalance is detected anywhere.

## Approach
1. DFS helper(node): if node is None, return 0 (height of empty tree).
2. left_height = helper(node.left); if left_height == -1, return -1 immediately (imbalance found below, propagate up).
3. right_height = helper(node.right); if right_height == -1, return -1.
4. If abs(left_height - right_height) > 1, return -1 (this node is unbalanced).
5. Otherwise return 1 + max(left_height, right_height) as normal height.

## Complexity
Time: O(n) — each node visited once thanks to early short-circuiting (naive top-down recomputation is O(n^2)) | Space: O(h) recursion stack

## Edge Cases
Empty tree -> balanced (True), single-node tree -> balanced.

## Related / Notes
The -1-sentinel trick to fuse a boolean check into a height computation is a reusable idiom for other 'compute X while checking Y' tree problems.
