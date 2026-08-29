import java.util.HashMap;
import java.util.Scanner;

public class _LC290_HashMap_WordPattern {

    public static boolean wordPattern(String p, String s) {

        String w[] = s.split(" ");

        if (p.length() != w.length) {
            return false;
        }

        HashMap<Character, String> h = new HashMap<>();
        HashMap<String, Character> h1 = new HashMap<>();

        for (int i = 0; i < p.length(); i++) {

            if (h.containsKey(p.charAt(i))) {
                if (!h.get(p.charAt(i)).equals(w[i])) {
                    return false;
                }
            }

            h.put(p.charAt(i), w[i]);

            if (h1.containsKey(w[i])) {
                if (!h1.get(w[i]).equals(p.charAt(i))) {
                    return false;
                }
            }

            h1.put(w[i], p.charAt(i));
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter pattern: ");
        String p = sc.nextLine();

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        boolean result = wordPattern(p, s);

        System.out.println("Output: " + result);

        sc.close();
    }
}