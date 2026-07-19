# 25. Daily Temperatures

**Difficulty:** Medium

**Pattern:** Monotonic (decreasing) Stack of indices

## Key Idea
Keep a stack of indices whose temperatures are still waiting for a warmer day; when a warmer day appears, resolve every index on the stack that is cooler than it.

## Approach
1. Create result array of zeros, size n, and an empty stack.
2. For i, temp in enumerate(temperatures): while stack is non-empty and temp > temperatures[stack[-1]]: idx = stack.pop(); result[idx] = i - idx.
3. Push i onto the stack regardless.
4. Return result once all days processed (indices left on stack never found a warmer day, stay 0).

## Complexity
Time: O(n) — each index pushed/popped once | Space: O(n)

## Edge Cases
Strictly decreasing temperatures overall (all answers stay 0), all identical temperatures.

## Related / Notes
Same 'monotonic stack resolves future answers' idea as Next Greater Element and Car Fleet.
