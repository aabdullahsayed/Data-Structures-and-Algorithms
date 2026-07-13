/**
 * Sum of Subarray Minimums
 * Topic: Monotonic Stack | Difficulty: Medium
 *
 * Problem:
 * Given an array, compute the sum of min(subarray) over every contiguous subarray, modulo 1e9+7,
 * using a monotonic stack to find each element's contribution range.
 *
 * Example:
 * Input:  arr = [3,1,2,4]
 * Output: 17
 *
 * Technique: A stack that stays increasing or decreasing, used to find next/previous greater or smaller elements in O(n).
 * Hint: Pop elements that violate the monotonic property before pushing the new one.
 */
public class SumOfSubarrayMinimums {

    /**
     * TODO: implement using Monotonic Stack.
     * Adjust the signature (parameter types / return type) to match the exact
     * input/output shape of this problem — the one below is a generic placeholder.
     */
    public static int sumOfSubarrayMinimums(int[] arr) {
        // TODO: implement
        return -1;
    }

    public static void main(String[] args) {
        // TODO: replace with real test cases based on the example above
        int[] sample = {};
        System.out.println(SumOfSubarrayMinimums.sumOfSubarrayMinimums(sample));
    }
}
