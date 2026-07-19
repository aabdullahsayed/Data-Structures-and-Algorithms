# 27. Largest Rectangle in Histogram

**Difficulty:** Hard

**Pattern:** Monotonic (increasing) Stack of indices with heights

## Key Idea
For each bar, find how far it can extend left and right while remaining the shortest bar in that span; a stack of increasing heights lets you compute this in one pass.

## Approach
1. Use a stack storing (index, height) pairs, and max_area = 0.
2. For i, h in enumerate(heights): while stack non-empty and stack[-1].height > h: pop (index, height); width = i - popped_index (or i if stack now empty after adjusting start); max_area = max(max_area, height * width).
3. Track the start index for the popped bar so it can be pushed back with the current i as its new effective start.
4. Push (start, h) onto the stack.
5. After the loop, pop remaining bars from the stack, treating len(heights) as the right boundary for width calculation.

## Complexity
Time: O(n) — each bar pushed/popped once | Space: O(n)

## Edge Cases
Strictly increasing histogram, strictly decreasing histogram, all bars equal height.

## Related / Notes
Hardest stack problem in the list; extends to Maximal Rectangle (2D) by running this per row.
