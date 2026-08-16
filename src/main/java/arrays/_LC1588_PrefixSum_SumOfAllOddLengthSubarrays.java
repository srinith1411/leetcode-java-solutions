import java.util.Scanner;

public class _LC1588_PrefixSum_SumOfAllOddLengthSubarrays {

    public static int sumOddLengthSubarrays(int[] arr) {

        int pref[] = new int[arr.length];
        pref[0] = arr[0];

        for (int i = 1; i < arr.length; i++)
            pref[i] = arr[i] + pref[i - 1];

        int ans = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {

                if ((j - i + 1 & 1) == 1)
                    ans = ans + (i == 0 ? pref[j] : pref[j] - pref[i - 1]);
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.println("Sum of all odd length subarrays: "
                + sumOddLengthSubarrays(arr));

        sc.close();
    }
}