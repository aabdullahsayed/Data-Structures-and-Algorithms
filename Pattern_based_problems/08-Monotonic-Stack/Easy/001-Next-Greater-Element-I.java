/**
 * Next Greater Element I
 * Topic: Monotonic Stack | Difficulty: Easy
 *
 * Problem:
 * Given two arrays where nums1 is a subset of nums2, for each element of nums1 find its next
 * greater element within nums2 (or -1 if none exists), using a monotonic stack.
 *
 * Example:
 * Input:  nums1 = [4,1,2], nums2 = [1,3,4,2]
 * Output: [-1,3,-1]
 *
 * Technique: A stack that stays increasing or decreasing, used to find next/previous greater or smaller elements in O(n).
 * Hint: Pop elements that violate the monotonic property before pushing the new one.
 */
public class NextGreaterElementI {

    /**
     * TODO: implement using Monotonic Stack.
     * Adjust the signature (parameter types / return type) to match the exact
     * input/output shape of this problem — the one below is a generic placeholder.
     */
    public static int nextGreaterElementI(int[] arr) {
        // TODO: implement
        return -1;
    }

    public static void main(String[] args) {
        // TODO: replace with real test cases based on the example above
        int[] sample = {};
        System.out.println(NextGreaterElementI.nextGreaterElementI(sample));
    }
}
