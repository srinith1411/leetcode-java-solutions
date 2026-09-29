import java.util.*;

public class _LC20_Stack_SolutionValidParentheses {

    static boolean isValid(String s) {

        Stack<Character> st = new Stack<>();

        for (char c : s.toCharArray()) {

            if (c == '(' || c == '[' || c == '{') {
                st.push(c);
            } 
            else {

                if (st.isEmpty()) {
                    return false;
                }

                char top = st.pop();

                if ((c == ')' && top != '(')
                        || (c == ']' && top != '[')
                        || (c == '}' && top != '{')) {
                    return false;
                }
            }
        }

        return st.isEmpty();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        System.out.println("Valid Parentheses: " + isValid(s));

        sc.close();
    }
}