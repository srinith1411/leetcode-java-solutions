import java.util.Scanner;

public class _LC796_StringConcatenation_RotateString {

    public static boolean rotateString(String s, String goal) {
        String t = s + s;

        return s.length() == goal.length() && t.contains(goal);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string s: ");
        String s = sc.nextLine();

        System.out.print("Enter goal string: ");
        String goal = sc.nextLine();

        boolean result = rotateString(s, goal);

        System.out.println("Can s be rotated to get goal? " + result);

        sc.close();
    }
}