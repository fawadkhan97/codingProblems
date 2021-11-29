package codingproblems;

import java.util.Random;

public class MakeNoMax {


    public static Integer createMax(Integer n, Integer k) {

        char numN[] = n.toString().toCharArray();
        String numK = k.toString();


        System.out.println("numn is " + numN + " char at 0 is: " + numN[0]);

        System.out.println("numn is " + numK + " char at 1 is: " + numK.charAt(0));
        //n is always less than 0
        if (n >= k) {
            for (int i = 0; i < numN.length; i++) {
                if (Integer.parseInt(String.valueOf(numN[i]) )<k){




                }

            }
        }
    }


    public static void main(String[] args) {
        Integer k = 5;
        Random rnd = new Random();
        Integer n = 8567;//rnd.nextInt(100) + 1;

        System.out.println(createMax(n, k));
    }

}



