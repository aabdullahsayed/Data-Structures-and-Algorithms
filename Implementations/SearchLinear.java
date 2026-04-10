import java.util.Scanner;

public class SearchLinear {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8};
        int target = 7;

        LinearSearch(arr, target);
    }

    public static void LinearSearch(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                System.out.println("Found at " + i + " index");
            }
        }
    }
}