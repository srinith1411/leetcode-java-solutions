import java.util.*;

public class _LC806_Simulation_NumberOfLinesToWriteString {

    public static int[] numberOfLines(int[] widths, String s) {

        int lines = 1;
        int currentWidth = 0;

        for (int i = 0; i < s.length(); i++) {

            // Find the width of the current character
            // ('a' maps to index 0)
            int charWidth = widths[s.charAt(i) - 'a'];

            // If the character doesn't fit on the current line,
            // start a new line
            if (currentWidth + charWidth > 100) {
                lines++;
                currentWidth = charWidth;
            } else {
                currentWidth += charWidth;
            }
        }

        return new int[]{lines, currentWidth};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] widths = new int[26];

        System.out.println("Enter widths of 26 characters (a-z):");

        for (int i = 0; i < 26; i++) {
            widths[i] = sc.nextInt();
        }

        sc.nextLine();

        System.out.print("Enter the string: ");
        String s = sc.nextLine();

        int[] result = numberOfLines(widths, s);

        System.out.println("Number of lines: " + result[0]);
        System.out.println("Width of last line: " + result[1]);

        sc.close();
    }
}