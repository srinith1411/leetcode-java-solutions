import java.util.Arrays;
import java.util.Scanner;

public class _LC455_Greedy_AssignCookies {

    public static int findContentChildren(int[] g, int[] s) {

        int i = 0;
        int j = 0;
        int count = 0;

        Arrays.sort(g);
        Arrays.sort(s);

        while (i < g.length && j < s.length) {

            if (s[j] >= g[i]) {
                count++;
                i++;
                j++;
            } else {
                j++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of children: ");
        int n = sc.nextInt();

        int[] g = new int[n];

        System.out.println("Enter greed factors:");
        for (int i = 0; i < n; i++) {
            g[i] = sc.nextInt();
        }

        System.out.print("Enter number of cookies: ");
        int m = sc.nextInt();

        int[] s = new int[m];

        System.out.println("Enter cookie sizes:");
        for (int i = 0; i < m; i++) {
            s[i] = sc.nextInt();
        }

        int result = findContentChildren(g, s);

        System.out.println("Maximum content children: " + result);

        sc.close();
    }
}