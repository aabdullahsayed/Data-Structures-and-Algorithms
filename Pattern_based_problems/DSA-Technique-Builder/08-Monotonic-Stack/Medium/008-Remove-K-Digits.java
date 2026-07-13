/**
 * Remove K Digits
 * Topic: Monotonic Stack | Difficulty: Medium
 *
 * Problem:
 * Given a non-negative integer represented as a string and an integer k, remove k digits from the
 * number so that the resulting number is the smallest possible (use a monotonic increasing stack
 * of digits).
 *
 * Example:
 * Input:  num = "1432219", k = 3
 * Output: "1219"
 *
 * Technique: A stack that stays increasing or decreasing, used to find next/previous greater or smaller elements in O(n).
 * Hint: Pop elements that violate the monotonic property before pushing the new one.
 */
public class RemoveKDigits {

    /**
     * TODO: implement using Monotonic Stack.
     * Adjust the signature (parameter types / return type) to match the exact
     * input/output shape of this problem — the one below is a generic placeholder.
     */
    public static int removeKDigits(int[] arr) {
        // TODO: implement
        return -1;
    }

    public static void main(String[] args) {
        // TODO: replace with real test cases based on the example above
        int[] sample = {};
        System.out.println(RemoveKDigits.removeKDigits(sample));
    }
}
