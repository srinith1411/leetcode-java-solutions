import java.util.HashMap;
import java.util.Scanner;

public class _LC205_HashMap_IsomorphicStrings {

    public static boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Character> h1 = new HashMap<>();
        HashMap<Character, Character> h2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);
            char d = t.charAt(i);

            if (h1.containsKey(c)) {

                if (h1.get(c) != d) {
                    return false;
                }
            }

            h1.put(c, d);

            if (h2.containsKey(d)) {

                if (h2.get(d) != c) {
                    return false;
                }
            }

            h2.put(d, c);
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s = sc.nextLine();

        System.out.print("Enter second string: ");
        String t = sc.nextLine();

        boolean result = isIsomorphic(s, t);

        System.out.println("Isomorphic: " + result);

        sc.close();
    }
}