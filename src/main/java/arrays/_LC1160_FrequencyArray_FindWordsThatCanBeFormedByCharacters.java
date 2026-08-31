import java.util.Scanner;

public class _LC1160_FrequencyArray_FindWordsThatCanBeFormedByCharacters {

    public static int countCharacters(String[] words, String chars) {

        // Step 1: Build the master frequency array for chars
        int[] masterCounts = new int[26];

        for (char c : chars.toCharArray()) {
            masterCounts[c - 'a']++;
        }

        int totalLength = 0;

        // Step 2: Check each word against the master counts
        for (String word : words) {

            int[] wordCounts = new int[26];
            boolean canForm = true;

            for (char c : word.toCharArray()) {

                int index = c - 'a';
                wordCounts[index]++;

                // Word needs more of this character than chars has
                if (wordCounts[index] > masterCounts[index]) {
                    canForm = false;
                    break;
                }
            }

            // Step 3: Add length if word can be formed
            if (canForm) {
                totalLength += word.length();
            }
        }

        return totalLength;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of words: ");
        int n = sc.nextInt();

        String[] words = new String[n];

        System.out.println("Enter the words:");

        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }

        System.out.print("Enter available characters: ");
        String chars = sc.next();

        int result = countCharacters(words, chars);

        System.out.println("Total length of good words: " + result);

        sc.close();
    }
}