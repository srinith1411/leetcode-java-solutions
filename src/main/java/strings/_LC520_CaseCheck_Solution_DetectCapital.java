import java.util.Scanner;

public class _LC520_CaseCheck_Solution_DetectCapital {

    public static boolean cap(String s) {
        return s.equals(s.toUpperCase());
    }

    public static boolean lower(String s) {
        return s.equals(s.toLowerCase());
    }

    public static boolean m3(String s) {
        char ch = s.charAt(0);

        if (!(ch >= 'A' && ch <= 'Z')) {
            return false;
        }

        return s.substring(1).equals(s.substring(1).toLowerCase());
    }

    public static boolean detectCapitalUse(String s) {
        return cap(s) || lower(s) || m3(s);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter word: ");
        String s = sc.next();

        System.out.println("Valid Capital Usage: " + detectCapitalUse(s));

        sc.close();
    }
}