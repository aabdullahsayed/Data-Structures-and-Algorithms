/**
 * Find Cycle Start Node
 * Topic: Fast Slow Pointers | Difficulty: Medium
 *
 * Problem:
 * Given a linked list that contains a cycle, find the node where the cycle begins, using Floyd's
 * algorithm (detect the meeting point, then find the entry node).
 *
 * Example:
 * Input:  list where the cycle begins at the node with value 2
 * Output: node with value 2
 *
 * Technique: Two pointers moving at different speeds through a sequence/linked list — great for cycle detection.
 * Hint: slow moves 1 step, fast moves 2 steps. If there's a cycle, they eventually meet.
 */
public class FindCycleStartNode {

    /**
     * TODO: implement using Fast Slow Pointers.
     * Adjust the signature (parameter types / return type) to match the exact
     * input/output shape of this problem — the one below is a generic placeholder.
     */
    public static int findCycleStartNode(int[] arr) {
        // TODO: implement
        return -1;
    }

    public static void main(String[] args) {
        // TODO: replace with real test cases based on the example above
        int[] sample = {};
        System.out.println(FindCycleStartNode.findCycleStartNode(sample));
    }
}
