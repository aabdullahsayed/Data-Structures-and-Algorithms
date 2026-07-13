/**
 * Shortest Subarray With Sum At Least K
 * Topic: Monotonic Queue | Difficulty: Medium
 *
 * Problem:
 * Given an array (can include negative numbers) and an integer k, find the length of the shortest
 * contiguous subarray whose sum is at least k, or -1 if no such subarray exists. Use prefix sums
 * plus a monotonic deque.
 *
 * Example:
 * Input:  arr = [2,-1,2], k = 3
 * Output: 3
 *
 * Technique: A deque that stays monotonic, used for sliding-window max/min in O(n).
 * Hint: Push from the back, popping smaller/larger elements first; pop from the front when out of window.
 */
public class ShortestSubarrayWithSumAtLeastK {

    /**
     * TODO: implement using Monotonic Queue.
     * Adjust the signature (parameter types / return type) to match the exact
     * input/output shape of this problem — the one below is a generic placeholder.
     */
    public static int shortestSubarrayWithSumAtLeastK(int[] arr) {
        // TODO: implement
        return -1;
    }

    public static void main(String[] args) {
        // TODO: replace with real test cases based on the example above
        int[] sample = {};
        System.out.println(ShortestSubarrayWithSumAtLeastK.shortestSubarrayWithSumAtLeastK(sample));
    }
}
