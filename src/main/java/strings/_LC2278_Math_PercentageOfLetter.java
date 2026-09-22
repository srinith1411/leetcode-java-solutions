import java.util.*;

public class _LC2278_Math_PercentageOfLetter {

    static int percentageLetter(String s, char letter) {

        int c = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == letter) {
                c++;
            }
        }

        return (c * 100) / s.length();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        System.out.print("Enter letter: ");
        char letter = sc.next().charAt(0);

        System.out.println("Percentage: " + percentageLetter(s, letter) + "%");

        sc.close();
    }
}