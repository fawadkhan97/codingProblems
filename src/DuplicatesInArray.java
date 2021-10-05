

public class DuplicatesInArray {


    static void findDuplicates(int[] arr) {

        int[] arr1 = new int[arr.length];


        for (int j : arr) {
            System.out.print("j is " + j + " ");
            arr1[j] += 1;
            System.out.println(" aj is " + arr1[j]);
        }

        System.out.print("dupes are : ");
        for (int i=0;i< arr1.length; i++) {
            if (arr1[i] > 1) System.out.print( i + " , ");
        }
    }


    public static void main(String[] args) {
        DuplicatesInArray.findDuplicates(new int[]{4, 2, 3, 4, 2, 3});

    }

}
