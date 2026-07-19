# 6. Product of Array Except Self

**Difficulty:** Medium

**Pattern:** Prefix and Suffix products, no division allowed

## Key Idea
result[i] = (product of everything to the left of i) * (product of everything to the right of i).

## Approach
1. Create output array, set output[0] = 1.
2. Left pass: output[i] = output[i-1] * nums[i-1] (running prefix product).
3. Right pass: keep a running suffix product variable R = 1; iterate i from n-1 to 0, output[i] *= R, then R *= nums[i].
4. Return output — computed with O(1) extra space besides the output array.

## Complexity
Time: O(n) | Space: O(1) extra (excluding output array)

## Edge Cases
Zeros in the array are handled naturally since we never divide. Negative numbers fine too.

## Related / Notes
Trapping Rain Water uses a similar left-max/right-max prefix pattern.
