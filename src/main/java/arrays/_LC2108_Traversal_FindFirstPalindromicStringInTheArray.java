import java.util.Scanner;

public class _LC2108_Traversal_FindFirstPalindromicStringInTheArray {

    public static boolean isPal(String s) {

        int l = 0, r = s.length() - 1;

        while (l < r) {

            if (s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }

        return true;
    }

    public static String firstPalindrome(String[] words) {

        for (int i = 0; i < words.length; i++) {

            if (isPal(words[i])) {
                return words[i];
            }
        }

        return "";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of words: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline left over

        String[] words = new String[n];

        System.out.println("Enter the words: ");
        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }

        String result = firstPalindrome(words);

        if (result.isEmpty()) {
            System.out.println("No palindromic string found.");
        } else {
            System.out.println("First palindromic string: " + result);
        }

        sc.close();
    }
}
