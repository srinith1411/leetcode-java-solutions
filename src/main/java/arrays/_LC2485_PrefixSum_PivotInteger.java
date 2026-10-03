import java.util.*;

public class _LC2485_PrefixSum_PivotInteger {

    static int pivotInteger(int n) {

        int pref[] = new int[n];

        pref[0] = 1;

        for (int i = 1; i < pref.length; i++) {
            pref[i] = pref[i - 1] + 1;
        }

        int total = 0;

        for (int x : pref) {
            total += x;
        }

        int currentSum = 0;

        for (int i = 0; i < pref.length; i++) {

            currentSum += pref[i];

            if (total - currentSum == currentSum - pref[i]) {
                return pref[i];
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Pivot Integer: " + pivotInteger(n));

        sc.close();
    }
}