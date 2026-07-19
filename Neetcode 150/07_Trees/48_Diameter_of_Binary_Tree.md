# 48. Diameter of Binary Tree

**Difficulty:** Easy

**Pattern:** DFS returning height while tracking a global max diameter

## Key Idea
The diameter (longest path between any two nodes) through a given node equals left_height + right_height; compute this at every node while also returning height upward for the parent's calculation.

## Approach
1. Keep a variable diameter = 0 (nonlocal/class attribute, or returned via a helper).
2. DFS helper(node): if node is None, return 0.
3. left_height = helper(node.left), right_height = helper(node.right).
4. Update diameter = max(diameter, left_height + right_height) (path doesn't have to pass through the root).
5. Return 1 + max(left_height, right_height) as this node's height to its parent.

## Complexity
Time: O(n) | Space: O(h) recursion stack

## Edge Cases
Empty tree -> 0, single-node tree -> 0, path might not pass through the root at all.

## Related / Notes
Key insight: diameter is measured in EDGES between two nodes, computed as a side-effect while computing height — don't conflate the two return values.
