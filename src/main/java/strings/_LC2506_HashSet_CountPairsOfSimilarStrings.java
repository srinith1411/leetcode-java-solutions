import java.util.*;

public class _LC2506_HashSet_CountPairsOfSimilarStrings {

    static int similarPairs(String[] words) {

        int count = 0;

        for (int i = 0; i < words.length; i++) {

            HashSet<Character> set1 = new HashSet<>();

            for (char ch : words[i].toCharArray()) {
                set1.add(ch);
            }

            for (int j = i + 1; j < words.length; j++) {

                HashSet<Character> set2 = new HashSet<>();

                for (char ch : words[j].toCharArray()) {
                    set2.add(ch);
                }

                if (set1.equals(set2)) {
                    count++;
                }
            }
        }

        return count;
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

        System.out.println("Similar Pairs: " + similarPairs(words));

        sc.close();
    }
}