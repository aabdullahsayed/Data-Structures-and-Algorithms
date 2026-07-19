# 7. Valid Sudoku

**Difficulty:** Medium

**Pattern:** Hash Sets per row, column, and 3x3 box

## Key Idea
A board is valid if no row, column, or 3x3 sub-box contains a repeated digit (ignore '.' cells).

## Approach
1. Create 9 sets for rows, 9 for columns, 9 for boxes (or dicts of sets keyed by index).
2. Iterate every cell (r, c). Skip if it is '.'.
3. Compute box index as (r//3)*3 + c//3.
4. If the digit already exists in rows[r], cols[c], or boxes[b], return False; otherwise add it to all three.
5. Return True after scanning the whole board.

## Complexity
Time: O(81) = O(1) fixed board | Space: O(81) = O(1)

## Edge Cases
Only need to validate the given digits — you are NOT solving the puzzle, just checking validity.

## Related / Notes
Sudoku Solver (backtracking) is the harder follow-up not included in NeetCode 150 core list.
