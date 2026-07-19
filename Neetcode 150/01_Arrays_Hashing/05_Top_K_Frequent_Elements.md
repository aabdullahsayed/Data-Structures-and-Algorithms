# 5. Top K Frequent Elements

**Difficulty:** Medium

**Pattern:** Bucket Sort on frequency (avoids full sort) OR Heap

## Key Idea
Frequencies range from 1..n, so you can bucket numbers by frequency into an array of lists indexed by count.

## Approach
1. Count frequency of every number with a hash map.
2. Create buckets: array of size n+1, buckets[freq] = list of numbers with that freq.
3. Walk buckets from the end (highest freq) collecting numbers until you have k.
4. Alt: push (freq, num) to a min-heap of size k, or use heapq.nlargest.

## Complexity
Time: O(n) bucket sort | O(n log k) heap | Space: O(n)

## Edge Cases
k equals number of unique elements, ties in frequency (any valid order accepted).

## Related / Notes
Sort by frequency is a classic building block; compare with Kth Largest Element problems.
