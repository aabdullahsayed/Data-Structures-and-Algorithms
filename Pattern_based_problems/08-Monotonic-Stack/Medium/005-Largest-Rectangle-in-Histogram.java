/**
 * Largest Rectangle in Histogram
 * Topic: Monotonic Stack | Difficulty: Medium
 *
 * Problem:
 * Given histogram bar heights, find the area of the largest rectangle, using a monotonic
 * increasing stack in O(n) time.
 *
 * Example:
 * Input:  heights = [2,1,5,6,2,3]
 * Output: 10
 *
 * Technique: A stack that stays increasing or decreasing, used to find next/previous greater or smaller elements in O(n).
 * Hint: Pop elements that violate the monotonic property before pushing the new one.
 */
public class LargestRectangleInHistogram {

    /**
     * TODO: implement using Monotonic Stack.
     * Adjust the signature (parameter types / return type) to match the exact
     * input/output shape of this problem — the one below is a generic placeholder.
     */
    public static int largestRectangleInHistogram(int[] arr) {
        // TODO: implement
        return -1;
    }

    public static void main(String[] args) {
        // TODO: replace with real test cases based on the example above
        int[] sample = {};
        System.out.println(LargestRectangleInHistogram.largestRectangleInHistogram(sample));
    }
}
