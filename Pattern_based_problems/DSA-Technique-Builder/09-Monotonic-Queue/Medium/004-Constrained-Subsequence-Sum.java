/**
 * Constrained Subsequence Sum
 * Topic: Monotonic Queue | Difficulty: Medium
 *
 * Problem:
 * Given an array and integer k, find the maximum sum of a non-empty subsequence such that for
 * every two consecutive chosen elements, their indices in the array differ by at most k. Solve
 * using DP plus a monotonic deque to track the best recent value.
 *
 * Example:
 * Input:  arr = [10,2,-10,5,20], k = 2
 * Output: 37
 *
 * Technique: A deque that stays monotonic, used for sliding-window max/min in O(n).
 * Hint: Push from the back, popping smaller/larger elements first; pop from the front when out of window.
 */
public class ConstrainedSubsequenceSum {

    /**
     * TODO: implement using Monotonic Queue.
     * Adjust the signature (parameter types / return type) to match the exact
     * input/output shape of this problem — the one below is a generic placeholder.
     */
    public static int constrainedSubsequenceSum(int[] arr) {
        // TODO: implement
        return -1;
    }

    public static void main(String[] args) {
        // TODO: replace with real test cases based on the example above
        int[] sample = {};
        System.out.println(ConstrainedSubsequenceSum.constrainedSubsequenceSum(sample));
    }
}
