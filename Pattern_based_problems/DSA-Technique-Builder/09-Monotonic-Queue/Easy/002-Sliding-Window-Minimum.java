/**
 * Sliding Window Minimum
 * Topic: Monotonic Queue | Difficulty: Easy
 *
 * Problem:
 * Given an array and window size k, find the minimum value in every window of size k, using a
 * monotonic increasing deque.
 *
 * Example:
 * Input:  arr = [1,3,-1,-3,5,3,6,7], k = 3
 * Output: [-1,-3,-3,-3,3,3]
 *
 * Technique: A deque that stays monotonic, used for sliding-window max/min in O(n).
 * Hint: Push from the back, popping smaller/larger elements first; pop from the front when out of window.
 */
public class SlidingWindowMinimum {

    /**
     * TODO: implement using Monotonic Queue.
     * Adjust the signature (parameter types / return type) to match the exact
     * input/output shape of this problem — the one below is a generic placeholder.
     */
    public static int slidingWindowMinimum(int[] arr) {
        // TODO: implement
        return -1;
    }

    public static void main(String[] args) {
        // TODO: replace with real test cases based on the example above
        int[] sample = {};
        System.out.println(SlidingWindowMinimum.slidingWindowMinimum(sample));
    }
}
