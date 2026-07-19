# 24. Generate Parentheses

**Difficulty:** Medium

**Pattern:** Backtracking with open/close counters (stack-style recursion)

## Key Idea
Build strings character by character; only add '(' if you haven't used all n opens, only add ')' if it wouldn't exceed the number of opens already placed.

## Approach
1. Recursive function backtrack(current_string, open_count, close_count).
2. Base case: if len(current_string) == 2*n, add to results and return.
3. If open_count < n: recurse with current_string + '(', open_count+1, close_count.
4. If close_count < open_count: recurse with current_string + ')', open_count, close_count+1.
5. This pruning guarantees only valid, balanced sequences are ever generated.

## Complexity
Time: O(4^n / sqrt(n)) (Catalan number growth) | Space: same, for output + recursion stack

## Edge Cases
n = 0 -> single empty string result.

## Related / Notes
A go-to template for constrained backtracking / combinatorial generation problems.
