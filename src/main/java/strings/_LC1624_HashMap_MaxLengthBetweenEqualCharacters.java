import java.util.*;

public class _LC1624_HashMap_MaxLengthBetweenEqualCharacters {

    static int maxLengthBetweenEqualCharacters(String s) {

        HashMap<Character, Integer> h = new HashMap<>();
        int ans = -1;

        for (int i = 0; i < s.length(); i++) {

            if (h.containsKey(s.charAt(i))) {

                int curr = (i - h.get(s.charAt(i))) - 1;
                ans = Math.max(ans, curr);
            }

            h.putIfAbsent(s.charAt(i), i);
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        System.out.println(maxLengthBetweenEqualCharacters(s));

        sc.close();
    }
}