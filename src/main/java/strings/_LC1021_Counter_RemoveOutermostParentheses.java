import java.util.*;

public class _LC1021_Counter_RemoveOutermostParentheses {

    static String removeOuterParentheses(String s) {

        StringBuilder sb = new StringBuilder();

        int cnt = 0;

        for (char c : s.toCharArray()) {

            if (c == '(') {

                if (cnt > 0) {
                    sb.append(c);
                }

                cnt++;

            } else {

                cnt--;

                if (cnt > 0) {
                    sb.append(c);
                }
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter parentheses string: ");
        String s = sc.nextLine();

        System.out.println("Result: " + removeOuterParentheses(s));

        sc.close();
    }
}