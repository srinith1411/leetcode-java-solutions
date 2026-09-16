import java.util.*;

public class _LC1678_StringTraversal_GoalParserInterpretation {

    static String interpret(String s) {

        StringBuilder sb = new StringBuilder();

        int i = 0;

        while (i < s.length()) {

            char c = s.charAt(i);

            if (c == '(') {

                if (i + 1 < s.length() && s.charAt(i + 1) == ')') {
                    sb.append("o");
                    i += 2;
                }

                else {

                    if (i + 3 < s.length()
                            && s.charAt(i + 1) == 'a'
                            && s.charAt(i + 2) == 'l'
                            && s.charAt(i + 3) == ')') {

                        sb.append("al");
                        i += 4;
                    }
                }
            }

            else {
                sb.append(c);
                i += 1;
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter command string: ");
        String s = sc.nextLine();

        System.out.println("Interpretation: " + interpret(s));

        sc.close();
    }
}