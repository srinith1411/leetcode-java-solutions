import java.util.Scanner;

public class _LC917_TwoPointer_ReverseOnlyLetters {

    public static String reverseOnlyLetters(String s) {

        char c[] = s.toCharArray();

        int i = 0, j = c.length - 1;

        while (i < j) {

            char l = c[i];
            char r = c[j];

            if (!Character.isLetter(l) && !Character.isLetter(r)) {
                i++;
                j--;
            }

            else if (Character.isLetter(l) && Character.isLetter(r)) {

                char t = c[i];
                c[i] = c[j];
                c[j] = t;

                i++;
                j--;
            }

            else if (!Character.isLetter(l) && Character.isLetter(r)) {
                i++;
            }

            else if (Character.isLetter(l) && !Character.isLetter(r)) {
                j--;
            }
        }

        return new String(c);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        System.out.println("Result: " + reverseOnlyLetters(s));

        sc.close();
    }
}