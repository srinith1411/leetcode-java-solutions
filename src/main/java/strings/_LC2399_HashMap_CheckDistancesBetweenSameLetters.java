import java.util.HashMap;
import java.util.Scanner;

public class _LC2399_HashMap_CheckDistancesBetweenSameLetters {

    static boolean checkDistances(String s, int[] distance) {

        HashMap<Character, Integer> h = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            if (h.containsKey(s.charAt(i))) {

                int d = (i - h.get(s.charAt(i))) - 1;

                if (distance[s.charAt(i) - 'a'] != d) {
                    return false;
                }
            }

            h.put(s.charAt(i), i);
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        int[] distance = new int[26];

        System.out.println("Enter 26 distance values:");
        for (int i = 0; i < 26; i++) {
            distance[i] = sc.nextInt();
        }

        System.out.println("Result: " + checkDistances(s, distance));

        sc.close();
    }
}