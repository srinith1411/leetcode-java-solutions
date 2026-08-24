import java.util.*;

class _LC387_HashMap_FirstUniqueCharacterInString
 {
    public static int firstUniqChar(String s) {

        HashMap<Character, Integer> h = new HashMap<>();

        for (char c : s.toCharArray()) {

            h.put(c, h.getOrDefault(c, 0) + 1);
        }

        int ans = -1;

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (h.get(c) == 1) {

                ans = i;
                break;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        int result = firstUniqChar(s);

        System.out.println("Index of first unique character: " + result);

        sc.close();
    }
}