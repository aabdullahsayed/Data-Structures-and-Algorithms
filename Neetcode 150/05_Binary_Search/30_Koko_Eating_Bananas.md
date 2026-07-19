# 30. Koko Eating Bananas

**Difficulty:** Medium

**Pattern:** Binary Search on the answer (search over possible speeds)

## Key Idea
As eating speed k increases, total hours needed monotonically decreases — that monotonic relationship makes 'can Koko finish in time with speed k?' binary-searchable.

## Approach
1. Set left = 1, right = max(piles) (no need to eat faster than the biggest pile in one hour).
2. While left < right: mid = (left+right)//2. Compute hours = sum(ceil(pile/mid) for pile in piles).
3. If hours <= h, this speed works — try slower: right = mid.
4. Else speed too slow — need faster: left = mid + 1.
5. Return left (the minimal feasible speed) once loop converges.

## Complexity
Time: O(n log(max(piles))) | Space: O(1)

## Edge Cases
h exactly equal to len(piles) forces max speed = max(piles).

## Related / Notes
Textbook 'binary search on answer' — same template as Split Array Largest Sum, Capacity to Ship Packages.
