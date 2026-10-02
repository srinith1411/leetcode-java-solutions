import java.util.Scanner;

class _LC2586_StartEndVowel_CountTheNumberOfVowelStringsInRange {

    public static boolean isLeft(String s) {

        if (s.startsWith("a")
                || s.startsWith("e")
                || s.startsWith("i")
                || s.startsWith("o")
                || s.startsWith("u")) {

            return true;
        }

        return false;
    }

    public static boolean isRight(String s) {

        if (s.endsWith("a")
                || s.endsWith("e")
                || s.endsWith("i")
                || s.endsWith("o")
                || s.endsWith("u")) {

            return true;
        }

        return false;
    }

    public static int vowelStrings(String[] words, int left, int right) {

        int c = 0;

        for (int i = left; i <= right; i++) {

            if (isLeft(words[i]) && isRight(words[i])) {
                c++;
            }
        }

        return c;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of words: ");
        int n = sc.nextInt();

        String[] words = new String[n];

        System.out.println("Enter words:");

        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }

        System.out.print("Enter left index: ");
        int left = sc.nextInt();

        System.out.print("Enter right index: ");
        int right = sc.nextInt();

        System.out.println("Count: " + vowelStrings(words, left, right));

        sc.close();
    }
}