# 34. Median of Two Sorted Arrays

**Difficulty:** Hard

**Pattern:** Binary Search on the smaller array to find a valid partition

## Key Idea
Binary search a partition point in the smaller array; the corresponding partition in the other array is determined by the total left-half size needed for the median, and you check left-max <= right-min across both arrays.

## Approach
1. Ensure nums1 is the smaller array (swap if needed) so binary search range stays small: O(log(min(m,n))).
2. Binary search partition i in nums1 (0..m); compute corresponding partition j = (m+n+1)//2 - i in nums2.
3. Get boundary values: left1, right1 around partition i in nums1; left2, right2 around partition j in nums2 (use -inf/+inf for out-of-range).
4. If left1 <= right2 and left2 <= right1: correct partition found — compute median from these four boundary values (average of two middles if total length even, else max(left1,left2)).
5. If left1 > right2, move partition left in nums1 (right = i-1); else move right (left = i+1).

## Complexity
Time: O(log(min(m,n))) | Space: O(1)

## Edge Cases
One array empty, arrays of very different sizes, total length even vs odd.

## Related / Notes
Widely regarded as one of the trickiest 'easy-sounding' hard problems — the partition invariant is the key insight to memorize.
