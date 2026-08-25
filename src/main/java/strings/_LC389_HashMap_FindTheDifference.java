import java.util.*;

public class _LC389_HashMap_FindTheDifference {

    public static char findTheDifference(String s, String t) {

        HashMap<Character, Integer> h = new HashMap<>();

        for (char c : s.toCharArray()) {
            h.put(c, h.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            h.put(c, h.getOrDefault(c, 0) - 1);
        }

        char ans = '\u0000';

        for (char c : h.keySet()) {
            if (h.get(c) != 0) {
                ans = c;
                break;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string s: ");
        String s = sc.nextLine();

        System.out.print("Enter string t: ");
        String t = sc.nextLine();

        char result = findTheDifference(s, t);

        System.out.println("The added character is: " + result);

        sc.close();
    }
}