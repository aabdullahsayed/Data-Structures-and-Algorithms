# 20. Sliding Window Maximum

**Difficulty:** Hard

**Pattern:** Monotonic Deque (decreasing) storing indices

## Key Idea
Maintain a deque of indices whose corresponding values are in decreasing order; the front of the deque is always the max of the current window.

## Approach
1. Use a deque storing indices. For each index i in nums:
2. While deque is non-empty and nums[deque[-1]] < nums[i], pop from the back (they can never be the max again).
3. Append i to the deque.
4. If deque[0] <= i - k (out of window), pop from the front.
5. Once i >= k-1, append nums[deque[0]] to the result.

## Complexity
Time: O(n) — each index pushed/popped at most once | Space: O(k)

## Edge Cases
k = 1 (every element is its own max), k = n (single global max window).

## Related / Notes
Monotonic deque/stack is a recurring pattern — also underlies Daily Temperatures and Car Fleet style problems.
