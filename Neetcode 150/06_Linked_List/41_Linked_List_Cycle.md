# 41. Linked List Cycle

**Difficulty:** Easy

**Pattern:** Floyd's Cycle Detection (fast & slow pointers / 'tortoise and hare')

## Key Idea
If you move one pointer at 1x speed and another at 2x speed, they will eventually meet if and only if there's a cycle, because the fast pointer 'laps' the slow one.

## Approach
1. Set slow = head, fast = head.
2. While fast and fast.next are not None: slow = slow.next (1 step); fast = fast.next.next (2 steps).
3. If slow == fast at any point, a cycle exists — return True.
4. If fast or fast.next becomes None, the list ends normally — return False.

## Complexity
Time: O(n) | Space: O(1)

## Edge Cases
Empty list, single node with self-loop, single node without a loop.

## Related / Notes
Extends to 'Linked List Cycle II' (find the cycle's starting node) using the same two pointers plus a third reset pointer.
