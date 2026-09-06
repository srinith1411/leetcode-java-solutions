import java.util.*;

public class _LC2124_Traversal_CheckString {

    public static boolean checkString(String s) {

        for (int i = s.length() - 1; i > 0; i--) {

            if (s.charAt(i) == 'a' && s.charAt(i - 1) == 'b') {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        boolean result = checkString(s);

        System.out.println("Result: " + result);

        sc.close();
    }
}