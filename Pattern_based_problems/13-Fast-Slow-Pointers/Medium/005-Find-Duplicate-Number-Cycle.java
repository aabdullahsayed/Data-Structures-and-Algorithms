/**
 * Find Duplicate Number Cycle
 * Topic: Fast Slow Pointers | Difficulty: Medium
 *
 * Problem:
 * Given an array of n+1 integers where each value is between 1 and n, find the duplicate number
 * by treating the array as an implicit linked list (arr[i] points to index arr[i]) and applying
 * Floyd's cycle detection.
 *
 * Example:
 * Input:  arr = [1,3,4,2,2]
 * Output: 2
 *
 * Technique: Two pointers moving at different speeds through a sequence/linked list — great for cycle detection.
 * Hint: slow moves 1 step, fast moves 2 steps. If there's a cycle, they eventually meet.
 */
public class FindDuplicateNumberCycle {

    /**
     * TODO: implement using Fast Slow Pointers.
     * Adjust the signature (parameter types / return type) to match the exact
     * input/output shape of this problem — the one below is a generic placeholder.
     */
    public static int findDuplicateNumberCycle(int[] arr) {
        // TODO: implement
        return -1;
    }

    public static void main(String[] args) {
        // TODO: replace with real test cases based on the example above
        int[] sample = {};
        System.out.println(FindDuplicateNumberCycle.findDuplicateNumberCycle(sample));
    }
}
