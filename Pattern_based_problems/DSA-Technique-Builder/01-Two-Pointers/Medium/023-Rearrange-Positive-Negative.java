/**
 * Rearrange Positive Negative
 * Topic: Two Pointers | Difficulty: Medium
 *
 * Problem:
 * Given an array with an equal number of positive and negative integers, rearrange it so that
 * positive and negative numbers alternate, starting with a positive number, while roughly
 * preserving the original order within each sign.
 *
 * Example:
 * Input:  [1, 2, -3, -1, 4, -2]
 * Output: [1, -3, 2, -1, 4, -2]  (one valid arrangement)
 *
 * Technique: Use two indices moving through the data (from ends, or one fast/one slow) to avoid nested loops.
 * Hint: Think about what invariant lets you move `left` or `right` without missing a valid answer.
 */
public class RearrangePositiveNegative {

    /**
     * TODO: implement using Two Pointers.
     * Adjust the signature (parameter types / return type) to match the exact
     * input/output shape of this problem — the one below is a generic placeholder.
     */
    public static int rearrangePositiveNegative(int[] arr) {
        // TODO: implement
        return -1;
    }

    public static void main(String[] args) {
        // TODO: replace with real test cases based on the example above
        int[] sample = {};
        System.out.println(RearrangePositiveNegative.rearrangePositiveNegative(sample));
    }
}
