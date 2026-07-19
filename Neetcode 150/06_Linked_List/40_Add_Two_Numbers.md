# 40. Add Two Numbers

**Difficulty:** Medium

**Pattern:** Simulate elementary school addition with a carry, digit by digit

## Key Idea
Numbers are stored in reverse order (least significant digit first) as linked lists, so you can add them exactly the way you'd add on paper, propagating carry.

## Approach
1. Create dummy head, tail = dummy, carry = 0.
2. While l1 or l2 or carry != 0: sum = (l1.val if l1 else 0) + (l2.val if l2 else 0) + carry.
3. carry = sum // 10, digit = sum % 10; tail.next = ListNode(digit); tail = tail.next.
4. Advance l1 = l1.next if l1 else None (same for l2).
5. Return dummy.next once both lists and carry are exhausted.

## Complexity
Time: O(max(n, m)) | Space: O(max(n, m)) for the output list

## Edge Cases
Lists of different lengths, final carry produces an extra new digit (e.g., 5+5=10 needs a new node).

## Related / Notes
Variant 'Add Two Numbers II' stores digits in forward order and typically uses a stack instead.
