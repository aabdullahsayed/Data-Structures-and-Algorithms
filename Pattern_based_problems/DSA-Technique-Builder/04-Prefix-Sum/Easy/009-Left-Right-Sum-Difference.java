/**
 * Left Right Sum Difference
 * Topic: Prefix Sum | Difficulty: Easy
 *
 * Problem:
 * Given an array, for each index compute the absolute difference between the sum of elements
 * strictly to its left and the sum of elements strictly to its right.
 *
 * Example:
 * Input:  arr = [10,4,8,3]
 * Output: [15,1,11,22]
 *
 * Technique: Precompute cumulative sums so range-sum queries become O(1).
 * Hint: prefix[i] = prefix[i-1] + arr[i]. Range sum(l,r) = prefix[r] - prefix[l-1].
 */
public class LeftRightSumDifference {

    /**
     * TODO: implement using Prefix Sum.
     * Adjust the signature (parameter types / return type) to match the exact
     * input/output shape of this problem — the one below is a generic placeholder.
     */
    public static int leftRightSumDifference(int[] arr) {
        // TODO: implement
        return -1;
    }

    public static void main(String[] args) {
        // TODO: replace with real test cases based on the example above
        int[] sample = {};
        System.out.println(LeftRightSumDifference.leftRightSumDifference(sample));
    }
}
