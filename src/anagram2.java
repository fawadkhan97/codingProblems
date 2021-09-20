import java.util.Arrays;

public class anagram2 {
    private static int CHARACTER_RANGE= 256;

    public boolean isAnagramCounting(String string1, String string2) {
        if (string1.length() != string2.length()) {
            return false;
        }
        int count[] = new int[CHARACTER_RANGE];
        for (int i = 0; i < string1.length(); i++) {
            count[string1.charAt(i)]++;
            count[string2.charAt(i)]--;
        }
        for (int i = 0; i < CHARACTER_RANGE; i++) {
            if (count[i] != 0) {
                System.out.println("false");
                return false;
            }
        }

        System.out.println("True");
        return true;
    }

    public static void main(String[] args) {
        anagram2 anagram = new anagram2();
        anagram.isAnagramCounting("fawad khan", "fawad khan");
    }


}

