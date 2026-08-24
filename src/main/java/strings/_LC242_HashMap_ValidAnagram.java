import java.util.HashMap;
import java.util.Scanner;

public class _LC242_HashMap_ValidAnagram {

    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> h = new HashMap<>();

        for (char c : s.toCharArray()) {
            h.put(c, h.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {

            if (!h.containsKey(c) || h.get(c) == 0) {
                return false;
            }

            h.put(c, h.get(c) - 1);
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s = sc.nextLine();

        System.out.print("Enter second string: ");
        String t = sc.nextLine();

        System.out.println("Is Anagram: " + isAnagram(s, t));

        sc.close();
    }
}