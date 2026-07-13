/**
 * Reorder List
 * Topic: Fast Slow Pointers | Difficulty: Medium
 *
 * Problem:
 * Given a linked list L0 -> L1 -> ... -> Ln, reorder it in-place to L0 -> Ln -> L1 -> Ln-1 ->
 * ..., by finding the middle with fast/slow pointers, reversing the second half, then merging the
 * two halves.
 *
 * Example:
 * Input:  1->2->3->4
 * Output: 1->4->2->3
 *
 * Technique: Two pointers moving at different speeds through a sequence/linked list — great for cycle detection.
 * Hint: slow moves 1 step, fast moves 2 steps. If there's a cycle, they eventually meet.
 */
public class ReorderList {

    /**
     * TODO: implement using Fast Slow Pointers.
     * Adjust the signature (parameter types / return type) to match the exact
     * input/output shape of this problem — the one below is a generic placeholder.
     */
    public static int reorderList(int[] arr) {
        // TODO: implement
        return -1;
    }

    public static void main(String[] args) {
        // TODO: replace with real test cases based on the example above
        int[] sample = {};
        System.out.println(ReorderList.reorderList(sample));
    }
}
