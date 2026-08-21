import java.util.Scanner;

public class _LC2283_FrequencyArray_CheckIfNumberHasEqualDigitCountAndDigitValue {

    public static boolean digitCount(String s) {

        int c[] = new int[10];

        for (char ch : s.toCharArray()) {
            c[ch - '0']++;
        }

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) - '0' != c[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.next();

        System.out.println(digitCount(s));

        sc.close();
    }
}