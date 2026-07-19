# 29. Search a 2D Matrix

**Difficulty:** Medium

**Pattern:** Treat 2D matrix as a flattened sorted 1D array via index math

## Key Idea
Rows are sorted and each row's first element is greater than the previous row's last, so the whole matrix behaves like one big sorted array of size rows*cols.

## Approach
1. Set left = 0, right = rows*cols - 1.
2. While left <= right: mid = (left + right)//2; convert to 2D: r = mid // cols, c = mid % cols.
3. Compare matrix[r][c] to target and shrink left/right exactly like standard binary search.
4. Return True on match, False if the loop exits.

## Complexity
Time: O(log(rows*cols)) | Space: O(1)

## Edge Cases
Empty matrix, single row/column matrix.

## Related / Notes
Alternative approach: binary search rows first, then binary search within the row (two-step) — same complexity.
