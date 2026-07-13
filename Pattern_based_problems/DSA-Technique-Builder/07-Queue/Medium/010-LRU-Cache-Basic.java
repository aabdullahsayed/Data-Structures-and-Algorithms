/**
 * LRU Cache Basic
 * Topic: Queue | Difficulty: Medium
 *
 * Problem:
 * Design a Least Recently Used (LRU) cache with a fixed capacity, supporting get(key) and
 * put(key, value) in O(1) time each (hashmap + doubly linked list, or a queue-backed structure).
 *
 * Example:
 * Input:  capacity=2; put(1,1); put(2,2); get(1); put(3,3)
 * Output: get(1) -> 1; put(3,3) evicts key 2 (least recently used)
 *
 * Technique: FIFO structure, useful for order-preserving processing and BFS-style problems.
 * Hint: Ask what needs to be processed in the order it arrived.
 */
public class LRUCacheBasic {

    /**
     * TODO: implement using Queue.
     * Adjust the signature (parameter types / return type) to match the exact
     * input/output shape of this problem — the one below is a generic placeholder.
     */
    public static int lruCacheBasic(int[] arr) {
        // TODO: implement
        return -1;
    }

    public static void main(String[] args) {
        // TODO: replace with real test cases based on the example above
        int[] sample = {};
        System.out.println(LRUCacheBasic.lruCacheBasic(sample));
    }
}
