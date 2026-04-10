import java.util.Scanner;

public class SearchLinear {

    public static void main(String[] args) {

        int[] arr = {12,45,89,23,67,34,90,15};
        int target = 23;

        LinearSearch(arr, target);
    }

    public static void LinearSearch(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                System.out.println("Match Found at Index: " + i +" ");
            }
        }
    }
}