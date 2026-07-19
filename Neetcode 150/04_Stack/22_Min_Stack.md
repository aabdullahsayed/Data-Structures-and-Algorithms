# 22. Min Stack

**Difficulty:** Medium

**Pattern:** Auxiliary Stack tracking running minimum

## Key Idea
Maintain a second stack in parallel that always stores the minimum value at each corresponding depth of the main stack.

## Approach
1. push(x): push x onto main stack; push min(x, minStack top or x if empty) onto minStack.
2. pop(): pop from both stacks together (keeps them in sync).
3. top(): return main stack's top element.
4. getMin(): return minStack's top element — O(1) always.

## Complexity
Time: O(1) for all operations | Space: O(n)

## Edge Cases
Popping from an empty stack (usually not tested, but guard if required), duplicate minimum values (push min again, don't skip).

## Related / Notes
General technique: 'shadow stack' also used in Max Stack and stock-span style problems.
