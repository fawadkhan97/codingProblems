package codingproblems;

import java.util.Random;

public class MakeNumMax {


    public static Integer createMax(Integer n, Integer k) {

        String numN = n.toString();
        String numK = k.toString();
        StringBuilder stringBuilder = new StringBuilder(numN);

        System.out.println("numn is " + numN + " char at 0 is: " + numN.charAt(0));

        System.out.println("numn is " + numK + " char at 1 is: " + numK.charAt(0));
        //n is always less than 0

        for (int i = 0; i < numN.length(); i++) {
            if (n >= k) {
                // if current character of n is less than k
                if (Integer.parseInt(String.valueOf(numN.charAt(i))) < k) {
                    stringBuilder.insert(i, numK);
                    numN = stringBuilder.toString();
                    System.out.println("after insertion at middle n is " + numN);
                    return Integer.parseInt(numN);
                }

                //if its end of string just append at last
                else if (i == numN.length() - 1) {
                    stringBuilder.append(numK);
                    numN = stringBuilder.toString();
                    System.out.println("after insertion at last n is " + numN);
                    return Integer.parseInt(numN);
                }
                // if n is less than k
            } else {
                //  if n is positive
                if (n >= 0) {
                    stringBuilder.insert(0, numK);
                    numN = stringBuilder.toString();
                    System.out.println("after insertion at start of  n is " + numN);
                    return Integer.parseInt(numN);
                }
                //if n is negative
                else {

                    // if current character of n is greater than k
                     if (numN.charAt(i) != '-' && Integer.parseInt(String.valueOf(stringBuilder.charAt(i))) > k) {
                        stringBuilder.insert(i, numK);
                        numN = stringBuilder.toString();
                        System.out.println("after insertion at middle n is " + numN);
                        return Integer.parseInt(numN);
                    }
                    else if (i == numN.length() - 1) {
                        stringBuilder.insert(numN.length(), numK);
                        numN = stringBuilder.toString();
                        return Integer.parseInt(numN);
                    }

                }


            }
        }

        return Integer.parseInt(numN);
    }


    public static void main(String[] args) {
        Integer k = 5;
        Random rnd = new Random();
        Integer n = rnd.nextInt(101) - 90;

        System.out.println("randomno is " + n);
        System.out.println(createMax(n, k));
    }

}



