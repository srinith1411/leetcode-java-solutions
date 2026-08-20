import java.util.Scanner;

public class _LC1455_String_CheckIfAWordOccursAsPrefixOfAnyWordInASentence {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter sentence:");
        String sentence = sc.nextLine();

        System.out.println("Enter search word:");
        String searchWord = sc.nextLine();

        int ans = -1;

        String s[] = sentence.split(" ");

        for (int i = 0; i < s.length; i++) {

            if (s[i].startsWith(searchWord)) {
                ans = i + 1;
                break;
            }
        }

        System.out.println("Output: " + ans);

        sc.close();
    }
}