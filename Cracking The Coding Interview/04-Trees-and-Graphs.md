# Chapter 4: Trees & Graphs

## Easy Explanation
A **tree** is like a family tree: one root at the top, branching down into children, and no cycles.
A **graph** is more general — nodes connected by edges, and connections can go anywhere (even in circles).

Common tree types:
- **Binary Tree**: each node has at most 2 children.
- **Binary Search Tree (BST)**: left child < parent < right child. Makes searching fast.
- **Balanced Tree**: height stays roughly log(n) so operations stay fast (AVL, Red-Black trees).
- **Heap**: a tree where the parent is always smaller (min-heap) or bigger (max-heap) than its children. Great for "give me the smallest/largest quickly."
- **Trie**: a tree for storing strings efficiently, one character per level — great for autocomplete.

## Why It Matters
Trees/graphs questions test whether you understand **recursion** and **traversal strategies** — two of the most reused skills in interviews.

## Common Patterns
- **DFS (Depth-First Search)**: Go as deep as possible before backtracking. Implemented with recursion or a stack. Good for: exploring all paths, tree traversals.
- **BFS (Breadth-First Search)**: Explore level by level using a queue. Good for: shortest path (unweighted), "minimum steps."
- **In-order / Pre-order / Post-order traversal** (for trees):
  - In-order (Left, Node, Right) → gives sorted order for a BST.
  - Pre-order (Node, Left, Right) → good for copying a tree.
  - Post-order (Left, Right, Node) → good for deleting a tree.

## Key Complexity
| Operation | Balanced BST | Unbalanced BST (worst case) |
|---|---|---|
| Search | O(log n) | O(n) |
| Insert | O(log n) | O(n) |
| Delete | O(log n) | O(n) |

Graph traversal (DFS/BFS): O(V + E) — visit every vertex and edge once.

## Classic Problems

### 1. Route Between Nodes — Is there a path from node A to node B in a directed graph?
**Easy idea:** BFS or DFS from A; see if you reach B.

### 2. Minimal Tree — Build a height-balanced BST from a sorted array
**Easy idea:** Pick the middle element as root, recursively do the same for left and right halves.

### 3. List of Depths — Create a linked list for each level of a binary tree
**Easy idea:** BFS level by level, collecting nodes into a list per level.

### 4. Check Balanced — Is a binary tree height-balanced (heights of subtrees differ by ≤1)?
**Easy idea:** Recursively compute height; bail out early with a sentinel value (like -1) the moment you find an imbalance.

### 5. Validate BST — Is a binary tree a valid binary search tree?
**Easy idea:** Recursively check each node stays within a valid (min, max) range as you move down.

### 6. Successor — Find the "in-order successor" (next node) of a given node in a BST
**Easy idea:** If it has a right child, go right then all the way left. Otherwise, walk up from the node until you move up from a left child.

### 7. Build Order — Order of compiling projects given dependencies (topological sort)
**Easy idea:** Repeatedly pick a project with no unresolved dependencies, add it to the order, then remove it and its edges. (Or DFS-based topological sort.)

### 8. First Common Ancestor — Lowest Common Ancestor (LCA) of two nodes
**Easy idea:** Recursively search both subtrees; if a node's left and right searches both find one of the targets, that node is the LCA.

### 9. BST Sequences — All possible arrays that could have created a given BST
**Easy idea:** Recursively "weave" together valid orderings of left and right subtree sequences.

### 10. Check Subtree — Is tree T2 a subtree of T1?
**Easy idea:** Find nodes in T1 matching T2's root value, then verify the whole subtree matches.

## Practice Tip
When stuck on a tree problem, ask: "What do I need to know from my children before I can answer for myself?" That's the recursive relationship.
