public class _2000_Simulation_ReversePrefixOfWord {

    public static void reverse(char c[], int l, int r) {

        while (l < r) {

            char t = c[l];
            c[l] = c[r];
            c[r] = t;

            l++;
            r--;
        }
    }

    public static String reversePrefix(String s, char t) {

        char ch[] = s.toCharArray();

        for (int i = 0; i < ch.length; i++) {

            if (ch[i] == t) {

                reverse(ch, 0, i);
                break;
            }
        }

        return new String(ch);
    }
}