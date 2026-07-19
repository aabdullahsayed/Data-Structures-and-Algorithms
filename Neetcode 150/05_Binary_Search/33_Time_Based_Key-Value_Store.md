# 33. Time Based Key-Value Store

**Difficulty:** Medium

**Pattern:** Hash Map of Lists + Binary Search on timestamps

## Key Idea
Store each key's (timestamp, value) pairs in a list (timestamps are inserted in increasing order by problem guarantee), then binary search for the largest timestamp <= the query timestamp.

## Approach
1. set(key, value, timestamp): append (timestamp, value) to store[key] (a list).
2. get(key, timestamp): if key not in store, return ''. Binary search store[key] for the rightmost entry whose timestamp <= given timestamp.
3. Use left/right pointers; whenever entry.timestamp <= timestamp, record it as a candidate and move left = mid+1 (looking for something even later but still <=); otherwise right = mid-1.
4. Return the candidate's value, or '' if none qualifies.

## Complexity
Time: set O(1), get O(log n) | Space: O(n)

## Edge Cases
get() called before any set() for a key, timestamp smaller than every stored timestamp.

## Related / Notes
'Search for closest/floor value' binary search variant, distinct from exact-match search.
