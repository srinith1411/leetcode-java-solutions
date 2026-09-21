import java.util.*;

public class _LC2185_StartsWith_PrefixCount {

    static int prefixCount(String[] w, String pref) {

        int c = 0;

        for (int i = 0; i < w.length; i++) {

            if (w[i].startsWith(pref)) {
                c++;
            }
        }

        return c;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of words: ");
        int n = sc.nextInt();

        String[] w = new String[n];

        System.out.println("Enter words:");
        for (int i = 0; i < n; i++) {
            w[i] = sc.next();
        }

        System.out.print("Enter prefix: ");
        String pref = sc.next();

        System.out.println("Prefix count: " + prefixCount(w, pref));

        sc.close();
    }
}