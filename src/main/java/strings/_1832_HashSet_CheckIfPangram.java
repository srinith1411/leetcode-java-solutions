import java.util.HashSet;
import java.util.Scanner;

public class _1832_HashSet_CheckIfPangram {

    public static boolean checkIfPangram(String sentence) {

        HashSet<Character> h = new HashSet<>();

        for (char c : sentence.toCharArray()) {
            h.add(c);
        }

        return h.size() == 26;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        boolean result = checkIfPangram(sentence);

        System.out.println("Is Pangram: " + result);

        sc.close();
    }
}