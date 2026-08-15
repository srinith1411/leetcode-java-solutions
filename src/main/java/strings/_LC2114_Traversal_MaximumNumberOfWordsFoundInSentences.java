import java.util.Scanner;

public class _LC2114_Traversal_MaximumNumberOfWordsFoundInSentences {

    // Approach: String Traversal
    public static int mostWordsFound(String[] s) {

        int ans = 0;

        for (int i = 0; i < s.length; i++) {
            int c = 1;

            for (int j = 0; j < s[i].length(); j++) {

                char ch = s[i].charAt(j);

                if (ch == ' ')
                    c++;
            }

            if (c > ans)
                ans = c;
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of sentences: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] s = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter sentence " + (i + 1) + ": ");
            s[i] = sc.nextLine();
        }

        int result = mostWordsFound(s);

        System.out.println("Maximum number of words: " + result);

        sc.close();
    }
}