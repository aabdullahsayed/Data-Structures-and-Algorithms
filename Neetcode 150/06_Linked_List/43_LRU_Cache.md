# 43. LRU Cache

**Difficulty:** Medium

**Pattern:** Hash Map + Doubly Linked List for O(1) get/put with recency ordering

## Key Idea
The hash map gives O(1) node lookup by key; the doubly linked list maintains usage order so the least-recently-used node (at one end) can be evicted in O(1), and any accessed node can be moved to the most-recently-used end in O(1).

## Approach
1. Maintain dummy head and tail nodes for the doubly linked list; map: key -> node.
2. get(key): if key not in map, return -1. Otherwise, move that node to the front (most recently used) and return its value.
3. put(key, value): if key exists, update its value and move it to the front. If not, create a new node, add to front, add to map.
4. If size exceeds capacity after insertion, remove the node at the tail (least recently used) from both the list and the map.
5. Helper functions remove(node) and insert_at_front(node) keep the linked-list splicing logic clean and reusable.

## Complexity
Time: O(1) for get and put | Space: O(capacity)

## Edge Cases
Capacity of 0 or 1, updating an existing key's value (must still count as 'used').

## Related / Notes
Also solvable in Python with OrderedDict, but interviewers usually want the manual hash map + DLL implementation.
