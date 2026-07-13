/**
 * Previous Greater Element
 * Topic: Monotonic Stack | Difficulty: Easy
 *
 * Problem:
 * Given an array, find the nearest greater element to the left of every element (or -1 if none
 * exists), using a monotonic stack.
 *
 * Example:
 * Input:  arr = [10,4,2,20,40]
 * Output: [-1,10,4,-1,-1]
 *
 * Technique: A stack that stays increasing or decreasing, used to find next/previous greater or smaller elements in O(n).
 * Hint: Pop elements that violate the monotonic property before pushing the new one.
 */
public class PreviousGreaterElement {

    /**
     * TODO: implement using Monotonic Stack.
     * Adjust the signature (parameter types / return type) to match the exact
     * input/output shape of this problem — the one below is a generic placeholder.
     */
    public static int previousGreaterElement(int[] arr) {
        // TODO: implement
        return -1;
    }

    public static void main(String[] args) {
        // TODO: replace with real test cases based on the example above
        int[] sample = {};
        System.out.println(PreviousGreaterElement.previousGreaterElement(sample));
    }
}
