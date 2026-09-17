import java.util.*;

public class _LC1844_StringBuilder_ReplaceAllDigitsWithCharacters {

    static String replaceDigits(String s) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            if (i % 2 != 0) {

                int ascii = (int) s.charAt(i - 1);
                char c = (char) (ascii + Character.getNumericValue(s.charAt(i)));

                sb.append(c);
            }
            else {
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        System.out.println("Result: " + replaceDigits(s));

        sc.close();
    }
}