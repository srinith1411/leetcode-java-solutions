import java.util.ArrayList;
import java.util.Scanner;

public class _LC1408_NestedLoop_StringMatchingInAnArray {

    // Approach: Nested Loop + contains()
    public static ArrayList<String> stringMatching(String[] w) {

        ArrayList<String> a = new ArrayList<>();

        for (int i = 0; i < w.length; i++) {

            for (int j = 0; j < w.length; j++) {

                if (j != i && w[j].contains(w[i])) {
                    a.add(w[i]);
                    break;
                }
            }
        }

        return a;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] w = new String[n];

        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            w[i] = sc.nextLine();
        }

        ArrayList<String> result = stringMatching(w);

        System.out.println("Strings that appear as substrings: " + result);

        sc.close();
    }
}