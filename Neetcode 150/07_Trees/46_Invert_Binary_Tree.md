# 46. Invert Binary Tree

**Difficulty:** Easy

**Pattern:** Recursive swap of left/right children (DFS), or BFS level-order swap

## Key Idea
Mirroring a tree means at every node, the left and right subtrees swap places, all the way down.

## Approach
1. Base case: if root is None, return None.
2. Recursively invert the left subtree and right subtree first (or swap first then recurse — order doesn't matter).
3. Swap root.left and root.right.
4. Return root. (BFS alt: use a queue, and swap children of each dequeued node before enqueueing them.)

## Complexity
Time: O(n) | Space: O(h) recursion stack (h = height), O(n) worst case for skewed tree; O(w) for BFS queue (w = max width)

## Edge Cases
Empty tree, single-node tree, already-symmetric tree.

## Related / Notes
Great warm-up for the whole Trees section — establishes the base recursive DFS template.
