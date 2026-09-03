import java.util.Scanner;

public class _LC1704_TwoPointers_DetermineIfStringHalvesAreAlike {

    public static boolean halvesAreAlike(String s) {

        int c1 = 0;
        int c2 = 0;

        int i = 0, j = s.length() - 1;

        while (i < j) {

            char left = s.charAt(i);
            char right = s.charAt(j);

            if ("aeiouAEIOU".indexOf(left) != -1)
                c1++;

            if ("aeiouAEIOU".indexOf(right) != -1)
                c2++;

            i++;
            j--;
        }

        return c1 == c2;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String s = sc.nextLine();

        boolean result = halvesAreAlike(s);

        System.out.println("Are both halves alike? " + result);

        sc.close();
    }
}