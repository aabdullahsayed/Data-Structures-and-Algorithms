# 50. Same Tree

**Difficulty:** Easy

**Pattern:** Simultaneous recursive DFS comparing two trees node by node

## Key Idea
Two trees are identical iff their root values match AND both their left subtrees match AND both their right subtrees match, recursively.

## Approach
1. Base cases: if both p and q are None, return True (both empty, match). If exactly one is None, return False (structural mismatch).
2. If p.val != q.val, return False (value mismatch).
3. Return isSameTree(p.left, q.left) and isSameTree(p.right, q.right) — both subtrees must independently match.
4. Short-circuiting 'and' means it stops as soon as one side fails.

## Complexity
Time: O(min(n, m)) — stops early on first mismatch, O(n) if identical | Space: O(h) recursion stack

## Edge Cases
Both trees empty -> True, one empty & one non-empty -> False, same structure but different values.

## Related / Notes
Template extends directly to 'Subtree of Another Tree' (call isSameTree at every node of the bigger tree) and 'Symmetric Tree' (compare a tree against its own mirror).
