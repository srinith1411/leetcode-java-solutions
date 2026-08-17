import java.util.Scanner;

public class _LC1732_PrefixSum_FindTheHighestAltitude {

    public static int largestAltitude(int[] gain) {

        int ans = 0;

        for (int i = 0; i < gain.length; i++) {

            if (i > 0)
                gain[i] = gain[i] + gain[i - 1];

            if (gain[i] > ans)
                ans = gain[i];
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] gain = new int[n];

        System.out.println("Enter gain values:");
        for (int i = 0; i < n; i++) {
            gain[i] = sc.nextInt();
        }

        System.out.println("Highest Altitude: " + largestAltitude(gain));

        sc.close();
    }
}