import java.util.*;

public class _LC2490_StringSplit_CircularSentence {

    // Checks whether the sentence is circular
    static boolean isCircularSentence(String sentence) {

        // Split the sentence into individual words
        String w[] = sentence.split(" ");

        // Last character of the last word must match
        // the first character of the first word
        if (w[0].charAt(0) != w[w.length - 1].charAt(w[w.length - 1].length() - 1)) {
            return false;
        }

        // Check whether the last character of each word
        // matches the first character of the next word
        for (int i = 0; i < w.length - 1; i++) {

            if (w[i].charAt(w[i].length() - 1) != w[i + 1].charAt(0)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        boolean result = isCircularSentence(sentence);

        System.out.println("Is circular sentence: " + result);

        sc.close();
    }
}