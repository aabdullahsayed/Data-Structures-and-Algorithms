/**
 * Difference Array Basic
 * Topic: Prefix Sum | Difficulty: Easy
 *
 * Problem:
 * Given an array, build a difference array (diff[0] = arr[0], diff[i] = arr[i] - arr[i-1]) and
 * use it to reconstruct the original array from scratch.
 *
 * Example:
 * Input:  arr = [2,4,4,6]
 * Output: diff = [2,2,0,2]
 *
 * Technique: Precompute cumulative sums so range-sum queries become O(1).
 * Hint: prefix[i] = prefix[i-1] + arr[i]. Range sum(l,r) = prefix[r] - prefix[l-1].
 */
public class DifferenceArrayBasic {

    /**
     * TODO: implement using Prefix Sum.
     * Adjust the signature (parameter types / return type) to match the exact
     * input/output shape of this problem — the one below is a generic placeholder.
     */
    public static int differenceArrayBasic(int[] arr) {
        // TODO: implement
        return -1;
    }

    public static void main(String[] args) {
        // TODO: replace with real test cases based on the example above
        int[] sample = {};
        System.out.println(DifferenceArrayBasic.differenceArrayBasic(sample));
    }
}
