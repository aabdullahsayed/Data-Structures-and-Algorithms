/**
 * Job Sequencing Problem
 * Topic: Greedy | Difficulty: Medium
 *
 * Problem:
 * Given jobs with deadlines and profits (each job takes exactly 1 unit of time, at most one job
 * may run per time slot), schedule jobs to maximize total profit while respecting deadlines.
 *
 * Example:
 * Input:  jobs=(id,deadline,profit): (a,4,20),(b,1,10),(c,1,40),(d,1,30)
 * Output: 2 jobs scheduled, total profit 60
 *
 * Technique: Make the locally optimal choice at each step and prove (or trust) it leads to a global optimum.
 * Hint: Sort by some criterion first, then make one pass making the best local choice.
 */
public class JobSequencingProblem {

    /**
     * TODO: implement using Greedy.
     * Adjust the signature (parameter types / return type) to match the exact
     * input/output shape of this problem — the one below is a generic placeholder.
     */
    public static int jobSequencingProblem(int[] arr) {
        // TODO: implement
        return -1;
    }

    public static void main(String[] args) {
        // TODO: replace with real test cases based on the example above
        int[] sample = {};
        System.out.println(JobSequencingProblem.jobSequencingProblem(sample));
    }
}
