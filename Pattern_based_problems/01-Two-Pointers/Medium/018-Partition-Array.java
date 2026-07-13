/**
 * Partition Array
 * Topic: Two Pointers | Difficulty: Medium
 *
 * Problem:
 * Given an array and a pivot value, rearrange the elements in-place so that all elements less
 * than the pivot come before all elements greater than or equal to it (the partition step of
 * quicksort).
 *
 * Example:
 * Input:  arr = [9, 12, 5, 10, 14, 3, 10], pivot = 10
 * Output: [9, 5, 3, 12, 10, 14, 10]
 *
 * Technique: Use two indices moving through the data (from ends, or one fast/one slow) to avoid nested loops.
 * Hint: Think about what invariant lets you move `left` or `right` without missing a valid answer.
 */
public class PartitionArray {

    /**
     * TODO: implement using Two Pointers.
     * Adjust the signature (parameter types / return type) to match the exact
     * input/output shape of this problem — the one below is a generic placeholder.
     */
    public static int partitionArray(int[] arr) {
        // TODO: implement
        return -1;
    }

    public static void main(String[] args) {
        // TODO: replace with real test cases based on the example above
        int[] sample = {};
        System.out.println(PartitionArray.partitionArray(sample));
    }
}
