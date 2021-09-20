import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram {


    boolean checkAnagram(String str1, String str2) {

        if (str1.length() != str2.length()) {
            System.out.println("length is not equal \nString is not anagram");
            return false;
        }
        char str1Array[] = str1.toLowerCase().toCharArray();
        char str2Array[] = str2.toLowerCase().toCharArray();
        Arrays.sort(str1Array);
        Arrays.sort(str2Array);
        Boolean result = Arrays.equals(str1Array,str2Array);
        if (result) {

            System.out.println("str1 is " + Arrays.toString(str1Array));
            System.out.println("str2 is " + Arrays.toString(str2Array));
                    System.out.println("string is Anagram");
            return  true;

        }

        System.out.println("String is not Anagram ");

        return false;
    }

    public static void main(String[] args) {
        Anagram anagram = new Anagram();
        anagram.checkAnagram("12345", "543210");
    }

}
