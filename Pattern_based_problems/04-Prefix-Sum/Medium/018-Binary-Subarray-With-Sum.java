/**
 * Binary Subarray With Sum
 * Topic: Prefix Sum | Difficulty: Medium
 *
 * Problem:
 * Given a binary array and a target sum goal, count the number of contiguous subarrays whose sum
 * is exactly equal to goal.
 *
 * Example:
 * Input:  arr = [1,0,1,0,1], goal = 2
 * Output: 4
 *
 * Technique: Precompute cumulative sums so range-sum queries become O(1).
 * Hint: prefix[i] = prefix[i-1] + arr[i]. Range sum(l,r) = prefix[r] - prefix[l-1].
 */
public class BinarySubarrayWithSum {

    /**
     * TODO: implement using Prefix Sum.
     * Adjust the signature (parameter types / return type) to match the exact
     * input/output shape of this problem — the one below is a generic placeholder.
     */
    public static int binarySubarrayWithSum(int[] arr) {
        // TODO: implement
        return -1;
    }

    public static void main(String[] args) {
        // TODO: replace with real test cases based on the example above
        int[] sample = {};
        System.out.println(BinarySubarrayWithSum.binarySubarrayWithSum(sample));
    }
}
