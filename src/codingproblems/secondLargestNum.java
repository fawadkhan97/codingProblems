package codingproblems;

public class secondLargestNum {

    int secondLargest(int[] arr) {
        int largest = arr[0];
        int secondLargest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest=largest;
                largest = arr[i];
            }
        else if(arr[i]<largest && arr[i]>secondLargest){
                secondLargest=arr[i];
            }


        }



        System.out.println("largest is " + largest + " second largest is " + secondLargest);
        return secondLargest;

    }

    public static void main(String[] args) {
        int[] array = {1,10,9,1,11};
        secondLargestNum num = new secondLargestNum();
        num.secondLargest(array);
    }
}


