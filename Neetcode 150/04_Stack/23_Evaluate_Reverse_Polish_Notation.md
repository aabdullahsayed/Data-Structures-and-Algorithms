# 23. Evaluate Reverse Polish Notation

**Difficulty:** Medium

**Pattern:** Stack-based expression evaluation

## Key Idea
In postfix notation, when you hit an operator, the two most recent operands (top of stack) are its arguments — push and pop naturally simulate this.

## Approach
1. Create an empty stack.
2. For each token: if it's a number, push int(token) onto the stack.
3. If it's an operator, pop two values (b then a, in that order since b is more recent), compute a OP b, push the result.
4. Watch integer division: truncate toward zero (int(a / b)), not floor division, for negative results.
5. At the end, the stack has exactly one element — the answer.

## Complexity
Time: O(n) | Space: O(n)

## Edge Cases
Division truncation direction for negative numbers, single-token input.

## Related / Notes
Classic use of a stack to avoid building/parsing an expression tree.
