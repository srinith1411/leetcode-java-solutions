import java.util.*;

public class _LC2309_HashSet_GreatestEnglishLetterInUpperAndLowerCase {

    static String greatestLetter(String s) {

        HashSet<Character> seen = new HashSet<>();

        char greatest = ' ';

        for (char c : s.toCharArray()) {

            seen.add(c);

            char upper = Character.toUpperCase(c);
            char lower = Character.toLowerCase(c);

            if (seen.contains(upper) && seen.contains(lower)) {

                if (greatest == ' ' || upper > greatest) {
                    greatest = upper;
                }
            }
        }

        return greatest == ' ' ? "" : String.valueOf(greatest);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        System.out.println("Greatest Letter: " + greatestLetter(s));

        sc.close();
    }
}