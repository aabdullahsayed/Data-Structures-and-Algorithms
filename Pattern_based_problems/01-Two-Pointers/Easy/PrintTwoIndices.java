/**
 * Print Two Indices
 * Topic: Two Pointers | Difficulty: Easy
 *
 * Problem:
 * Given a sorted array of integers and a target value, find two indices i and j (i < j) such that
 * arr[i] + arr[j] equals the target. Print the pair of indices, or -1 -1 if no such pair exists.
 *
 * Example:
 * Input:  arr = [1, 2, 3, 4, 6], target = 6
 * Output: 1 3   (arr[1] + arr[3] = 2 + 4 = 6)
 *
 * Technique: Use two indices moving through the data (from ends, or one fast/one slow) to avoid nested loops.
 * Hint: Think about what invariant lets you move `left` or `right` without missing a valid answer.
 */
public class PrintTwoIndices {

    /**
     * TODO: implement using Two Pointers.
     * Adjust the signature (parameter types / return type) to match the exact
     * input/output shape of this problem — the one below is a generic placeholder.
     */
    public static int[] printTwoIndices(int[] arr,int target) {

              int one = 0;
              int two = arr.length-1;

              while(one<two){

                int sum = arr[one] + arr[two];

                if(sum == target){
                    return new int[] {one,two};
                
                }

                else if(sum > target){
                    two --;
                }

                else one++;

              }

        return null;
    }

    public static void main(String[] args) {
        // TODO: replace with real test cases based on the example above
        int[] sample = {1,2,3,4,5,6};
        int target = 6 ;
          int[] res = PrintTwoIndices.printTwoIndices(sample, target);
        
        for(int x: res){
            System.out.print(x+" ");
        }
    }
}
