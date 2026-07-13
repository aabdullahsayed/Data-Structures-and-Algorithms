/**
 * Pivot Index Variant
 * Topic: Prefix Sum | Difficulty: Medium
 *
 * Problem:
 * Given an array, find the largest index such that the sum of elements strictly to its left is
 * greater than the sum of elements strictly to its right.
 *
 * Example:
 * Input:  arr = [2,1,-1,1,2]
 * Output: 3
 *
 * Technique: Precompute cumulative sums so range-sum queries become O(1).
 * Hint: prefix[i] = prefix[i-1] + arr[i]. Range sum(l,r) = prefix[r] - prefix[l-1].
 */
public class PivotIndexVariant {

    /**
     * TODO: implement using Prefix Sum.
     * Adjust the signature (parameter types / return type) to match the exact
     * input/output shape of this problem — the one below is a generic placeholder.
     */
    public static int pivotIndexVariant(int[] arr) {
        // TODO: implement
        return -1;
    }

    public static void main(String[] args) {
        // TODO: replace with real test cases based on the example above
        int[] sample = {};
        System.out.println(PivotIndexVariant.pivotIndexVariant(sample));
    }
}
