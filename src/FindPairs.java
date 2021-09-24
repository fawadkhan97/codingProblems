public class FindPairs {

    //problem: given 2d array find pairs of zero

    // we will only check check right and bottom as we traverse


    void findPairs(int arr[][])  {

        int count = 0;
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                System.out.print(arr[i][j] + " ,");


                if (arr[i][j] == 0) {
                    try {
                        // check on right side
                        if (arr[i][j + 1] == 0) {
                            count++;

                        }
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.print(".");
                    }
                    try {
                        //check on bottom pair
                        if (arr[i + 1][j] == 0) {
                            count++;
                        }
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.print(".");
                    }
/*
                    try {
                        //check on left pair
                        if (arr[i][j - 1] == 0) {
                            count++;
                        }
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.print(".");
                    }
                    try {
                        // check on top pair
                        if (arr[i - 1][j] == 0) {
                            count++;

                        }
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.print(".");
                    }
*/
                }


            }


        }

        System.out.println("Pairs count is  " + count);

    }


    public static void main(String[] args) {

        FindPairs obj = new FindPairs();

        int[][] arr = {{0, 0, 1}, {0, 0, 0}, {0, 0, 1}};

        obj.findPairs(arr);

    }


}
