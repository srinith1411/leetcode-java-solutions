import java.util.*;

public class _LC13_HashMap_StringTraversal_RomanToInteger {

    public static int romanToInt(String s) {

        Map<Character, Integer> h = new HashMap<>();

        h.put('I', 1);
        h.put('V', 5);
        h.put('X', 10);
        h.put('L', 50);
        h.put('C', 100);
        h.put('D', 500);
        h.put('M', 1000);

        int t = 0;

        for (int i = 0; i < s.length(); i++) {

            int v1 = h.get(s.charAt(i));

            if (i < s.length() - 1 && v1 < h.get(s.charAt(i + 1))) {
                t = t - v1;
            } else {
                t = t + v1;
            }
        }

        return t;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roman numeral: ");
        String s = sc.nextLine().toUpperCase();

        int result = romanToInt(s);

        System.out.println("Output: " + result);

        sc.close();
    }
}