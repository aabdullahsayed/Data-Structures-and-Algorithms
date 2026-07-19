# 21. Valid Parentheses

**Difficulty:** Easy

**Pattern:** Stack matching for bracket pairs

## Key Idea
Push opening brackets; on a closing bracket, it must match the type on top of the stack, otherwise the string is invalid.

## Approach
1. Create a map of closing -> opening bracket, and an empty stack.
2. For each char: if it's an opening bracket, push it.
3. If it's a closing bracket: if stack is empty or stack.pop() != matching opening, return False.
4. After the loop, return True only if the stack is empty (no unmatched opens remain).

## Complexity
Time: O(n) | Space: O(n)

## Edge Cases
Empty string -> True, string with only opening or only closing brackets.

## Related / Notes
Foundational stack pattern reused in Evaluate RPN, Generate Parentheses, Min Stack.
