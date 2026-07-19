# 39. Copy List with Random Pointer

**Difficulty:** Medium

**Pattern:** Hash Map old-node -> new-node (or interweaving trick for O(1) space)

## Key Idea
You need a mapping from each original node to its clone so that random pointers (which can point anywhere) can be correctly rewired on the copy.

## Approach
1. Pass 1: iterate the original list, create a cloned node for each, store old_node -> new_node in a hash map (don't set pointers yet).
2. Pass 2: iterate again; for each old node, set new_node.next = map[old_node.next] and new_node.random = map[old_node.random] (map.get(None) naturally yields None).
3. Return map[head].
4. O(1)-space alt: interweave clone nodes directly after each original node, set randoms using node.next, then detach the interwoven lists into two separate lists.

## Complexity
Time: O(n) | Space: O(n) with hash map, O(1) with interweaving trick

## Edge Cases
Random pointer set to None, random pointer pointing to itself, empty list.

## Related / Notes
Good problem to demonstrate the 'map old identity to new identity' pattern generalizable to deep-copying any graph-like structure.
