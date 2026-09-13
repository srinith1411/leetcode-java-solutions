import java.util.Scanner;

public class _LC434_StringTraversal_NumberOfSegmentsInAString {

    static int countSegments(String s) {

        int c = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) != ' ' && (i == 0 || s.charAt(i - 1) == ' ')) {
                c++;
            }
        }

        return c;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        System.out.println("Number of segments: " + countSegments(s));

        sc.close();
    }
}