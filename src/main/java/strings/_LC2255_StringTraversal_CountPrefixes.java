import java.util.*;

public class _LC2255_StringTraversal_CountPrefixes {

    public static int countPrefixes(String[] words, String s) {

        int c = 0;

        for (int i = 0; i < words.length; i++) {

            if (s.startsWith(words[i]))
                c++;

        }

        return c;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of words: ");
        int size = sc.nextInt();

        String[] words = new String[size];

        System.out.println("Enter words:");
        for (int i = 0; i < size; i++) {
            words[i] = sc.next();
        }

        System.out.print("Enter string s: ");
        String s = sc.next();

        int result = countPrefixes(words, s);

        System.out.println("Number of prefixes: " + result);

        sc.close();
    }
}