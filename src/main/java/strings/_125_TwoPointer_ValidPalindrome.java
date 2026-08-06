import java.util.Scanner;

public class _125_TwoPointer_ValidPalindrome {

    public static boolean isPalindrome(String s) {

        s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        System.out.println("String after removing special characters and converting to lowercase: " + s);

        int i = 0, j = s.length() - 1;

        while (i < j) {

            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter String:");
        String str = s.nextLine();

        System.out.println(isPalindrome(str));

        s.close();
    }
}