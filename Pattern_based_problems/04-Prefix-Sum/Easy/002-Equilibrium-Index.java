/**
 * Equilibrium Index
 * Topic: Prefix Sum | Difficulty: Easy
 *
 * Problem:
 * Given an array, find an index such that the sum of the elements strictly to its left equals the
 * sum of the elements strictly to its right.
 *
 * Example:
 * Input:  arr = [-7,1,5,2,-4,3,0]
 * Output: 3
 *
 * Technique: Precompute cumulative sums so range-sum queries become O(1).
 * Hint: prefix[i] = prefix[i-1] + arr[i]. Range sum(l,r) = prefix[r] - prefix[l-1].
 */
public class EquilibriumIndex {

    /**
     * TODO: implement using Prefix Sum.
     * Adjust the signature (parameter types / return type) to match the exact
     * input/output shape of this problem — the one below is a generic placeholder.
     */
    public static int equilibriumIndex(int[] arr) {
        // TODO: implement
        return -1;
    }

    public static void main(String[] args) {
        // TODO: replace with real test cases based on the example above
        int[] sample = {};
        System.out.println(EquilibriumIndex.equilibriumIndex(sample));
    }
}
