import java.util.Arrays;

public class Anagram {


    String firstString;
    String secondString;

    public Anagram() {
    }


     static boolean isAnagram(String original, String rearranged) {

        char[] charOriginal = original.toCharArray();
        char[] charRearranged = rearranged.toCharArray();

        Arrays.sort(charOriginal);
        Arrays.sort(charRearranged);

        return Arrays.equals(charOriginal, charRearranged);
    }

}

