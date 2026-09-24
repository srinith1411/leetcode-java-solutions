import java.util.*;

public class _LC1684_HashSet_CountTheNumberOfConsistentStrings {

    // Returns the number of words containing only allowed characters
    static int countConsistentStrings(String allowed, String[] words) {

        HashSet<Character> h = new HashSet<>();

        // Store all allowed characters in HashSet
        for (char c : allowed.toCharArray()) {
            h.add(c);
        }

        int c = 0;

        // Check every word
        for (int i = 0; i < words.length; i++) {

            int cnt = 0;

            // Check every character of the current word
            for (int j = 0; j < words[i].length(); j++) {

                // If character is not allowed, stop checking this word
                if (!h.contains(words[i].charAt(j))) {
                    break;
                } else {
                    cnt++;
                }
            }

            // If all characters were allowed, count the word
            if (cnt == words[i].length()) {
                c++;
            }
        }

        return c;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter allowed characters: ");
        String allowed = sc.nextLine();

        System.out.print("Enter number of words: ");
        int n = sc.nextInt();

        String[] words = new String[n];

        System.out.println("Enter the words:");
        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }

        int result = countConsistentStrings(allowed, words);

        System.out.println("Number of consistent strings: " + result);

        sc.close();
    }
}