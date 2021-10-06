package codingproblems;

import java.util.Arrays;

import static java.lang.Math.max;

public class maxsubarray {


    /* Write an efficient program to find the sum of contiguous
    subarray within a one-dimensional array of numbers that has the largest sum. */


    public static void findSubArray(int[] arr) {
        int max=arr[0];
        int currentMax=0;
        int loopCount=0;
int[] maxSubArray = {};
        int start =0; int end=0;

        for (int i = 0; i < arr.length; i++) {

            if(arr[i]>currentMax+arr[i]) {
                currentMax = arr[i];
                start=i;
            }else currentMax+=arr[i];

            if (currentMax >= max) {
                max = currentMax;
                loopCount++;
                end=i;
            }
        }
        System.out.println("current max is "+currentMax );
        System.out.println("max value is "+max);
        System.out.println("loop count is "+loopCount);


        System.out.print("subArray is [ " );
        for (int i=start;i<=end;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("]");

    }


    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        maxsubarray.findSubArray(arr);
    }
}
