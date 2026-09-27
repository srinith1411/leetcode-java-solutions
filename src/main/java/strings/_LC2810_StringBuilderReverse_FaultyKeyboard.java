import java.util.Scanner;

public class _LC2810_StringBuilderReverse_FaultyKeyboard {

    public static String finalString(String s) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) != 'i') {
                sb.append(s.charAt(i));
            } else {
                sb.reverse();
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        System.out.println("Final string: " + finalString(s));

        sc.close();
    }
}