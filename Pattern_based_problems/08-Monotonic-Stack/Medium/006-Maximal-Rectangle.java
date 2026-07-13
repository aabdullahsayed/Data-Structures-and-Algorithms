/**
 * Maximal Rectangle
 * Topic: Monotonic Stack | Difficulty: Medium
 *
 * Problem:
 * Given a binary matrix, find the area of the largest rectangle containing only 1s, by treating
 * each row as the base of a histogram and reusing the largest-rectangle technique row by row.
 *
 * Example:
 * Input:  matrix = [[1,0,1,0,0],[1,0,1,1,1],[1,1,1,1,1],[1,0,0,1,0]]
 * Output: 6
 *
 * Technique: A stack that stays increasing or decreasing, used to find next/previous greater or smaller elements in O(n).
 * Hint: Pop elements that violate the monotonic property before pushing the new one.
 */
public class MaximalRectangle {

    /**
     * TODO: implement using Monotonic Stack.
     * Adjust the signature (parameter types / return type) to match the exact
     * input/output shape of this problem — the one below is a generic placeholder.
     */
    public static int maximalRectangle(int[] arr) {
        // TODO: implement
        return -1;
    }

    public static void main(String[] args) {
        // TODO: replace with real test cases based on the example above
        int[] sample = {};
        System.out.println(MaximalRectangle.maximalRectangle(sample));
    }
}
