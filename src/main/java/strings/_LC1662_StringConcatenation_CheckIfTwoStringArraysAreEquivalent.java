import java.util.Scanner;

public class _LC1662_StringConcatenation_CheckIfTwoStringArraysAreEquivalent {

    // Approach: String Concatenation

    public static boolean arrayStringsAreEqual(String[] w1, String[] w2) {

        String s1 = "";
        String s2 = "";

        int i = 0, j = 0;

        while (i < w1.length && j < w2.length) {

            s1 = s1 + w1[i];
            s2 = s2 + w2[j];

            i++;
            j++;
        }

        while (i < w1.length) {
            s1 = s1 + w1[i];
            i++;
        }

        while (j < w2.length) {
            s2 = s2 + w2[j];
            j++;
        }

        return s1.equals(s2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first string array: ");
        int n1 = sc.nextInt();

        String[] w1 = new String[n1];

        System.out.println("Enter first string array elements:");
        for (int i = 0; i < n1; i++)
            w1[i] = sc.next();

        System.out.print("Enter size of second string array: ");
        int n2 = sc.nextInt();

        String[] w2 = new String[n2];

        System.out.println("Enter second string array elements:");
        for (int i = 0; i < n2; i++)
            w2[i] = sc.next();

        System.out.println("Are the two string arrays equivalent: "
                + arrayStringsAreEqual(w1, w2));

        sc.close();
    }
}