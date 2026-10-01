import java.util.*;

public class _LC1614_Counter_MaximumNestingDepthOfTheParentheses {

    static int maxDepth(String s) {
        int depth = 0;
        int maxDepth = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                depth++;
                maxDepth = Math.max(maxDepth, depth);
            } else if (ch == ')') {
                depth--;
            }
        }

        return maxDepth;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter parentheses string: ");
        String s = sc.nextLine();

        System.out.println("Maximum Nesting Depth: " + maxDepth(s));

        sc.close();
    }
}