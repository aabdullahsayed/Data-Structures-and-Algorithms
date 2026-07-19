# 44. Merge k Sorted Lists

**Difficulty:** Hard

**Pattern:** Divide and Conquer merging (pairwise), or Min-Heap of list heads

## Key Idea
Repeatedly merge pairs of lists (like the merge step of merge sort) to cut the number of lists in half each round, or use a heap to always pull the globally smallest current node across all k lists.

## Approach
1. Divide & conquer: while len(lists) > 1, merge lists in pairs (list[0]+list[1], list[2]+list[3], ...) using the standard Merge Two Sorted Lists routine, replacing the list of lists with the merged results.
2. Repeat until only one merged list remains; return it.
3. Heap alt: push (val, list_index, node) for each list's head into a min-heap. Pop the smallest, attach to result, push its .next if it exists. Repeat until heap is empty.

## Complexity
Time: O(N log k) both approaches (N = total nodes, k = number of lists) | Space: O(k) for heap or recursion, O(1) extra for divide & conquer merging

## Edge Cases
Some lists empty or None, k = 0 (no lists), k = 1 (single list).

## Related / Notes
Directly builds on Merge Two Sorted Lists; heap approach reused in many 'k sorted streams' problems.
