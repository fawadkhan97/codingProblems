package codingproblems;

import java.util.Random;

public class ProbabilityOfFunction {


    public static Boolean funcProbability() {
        Random random = new Random();
        int num = random.nextInt(12) + 1;
        System.out.println("num is:" + num);
        if (num > 3) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {

        System.out.println( funcProbability());

    }


}
