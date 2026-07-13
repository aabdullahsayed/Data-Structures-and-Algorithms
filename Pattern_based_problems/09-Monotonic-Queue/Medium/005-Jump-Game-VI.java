/**
 * Jump Game VI
 * Topic: Monotonic Queue | Difficulty: Medium
 *
 * Problem:
 * Given an array and an integer k, starting at index 0, you may jump forward to any index within
 * k steps ahead. Find the maximum score (sum of values on visited indices, including the start
 * and end) to reach the last index.
 *
 * Example:
 * Input:  arr = [1,-1,-2,4,-7,3], k = 2
 * Output: 7
 *
 * Technique: A deque that stays monotonic, used for sliding-window max/min in O(n).
 * Hint: Push from the back, popping smaller/larger elements first; pop from the front when out of window.
 */
public class JumpGameVI {

    /**
     * TODO: implement using Monotonic Queue.
     * Adjust the signature (parameter types / return type) to match the exact
     * input/output shape of this problem — the one below is a generic placeholder.
     */
    public static int jumpGameVi(int[] arr) {
        // TODO: implement
        return -1;
    }

    public static void main(String[] args) {
        // TODO: replace with real test cases based on the example above
        int[] sample = {};
        System.out.println(JumpGameVI.jumpGameVi(sample));
    }
}
