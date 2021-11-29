package codingproblems;

import java.util.Arrays;

public class SumArray {


    private static void FindSuminArray(int[] arr, int sum) {

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] + arr[j] == sum) {
                    System.out.println("( " + arr[i] + "," + arr[j] + " )");

                }
            }
        }


    }


    public static void main(String[] args) {
        int[] arr = {7, 1, 4, 9, 3};
        SumArray.FindSuminArray(arr, 10);
    }


}
