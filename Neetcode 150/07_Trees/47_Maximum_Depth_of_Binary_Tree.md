# 47. Maximum Depth of Binary Tree

**Difficulty:** Easy

**Pattern:** Recursive DFS (or iterative BFS level counting)

## Key Idea
The depth of a tree is 1 (for the current node) plus the deeper of its two subtrees' depths.

## Approach
1. Base case: if root is None, return 0.
2. Recursively compute left_depth = maxDepth(root.left) and right_depth = maxDepth(root.right).
3. Return 1 + max(left_depth, right_depth).
4. BFS alt: level-order traversal with a queue, incrementing a counter each time you fully process a level.

## Complexity
Time: O(n) | Space: O(h) recursion stack; O(w) for BFS queue

## Edge Cases
Empty tree -> depth 0, single-node tree -> depth 1, completely skewed (linked-list-like) tree.

## Related / Notes
The 'return 1 + max(...)' recursive shape reappears in Diameter and Balanced Tree below.
