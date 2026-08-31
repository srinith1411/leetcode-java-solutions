import java.util.Scanner;

public class _LC2006_BruteForce_CountNumberOfPairsWithAbsoluteDifferenceK {

    public static int countKDifference(int[] nums, int k) {

        int c = 0;

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (Math.abs(nums[i] - nums[j]) == k) {
                    c++;
                }
            }
        }

        return c;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        int result = countKDifference(nums, k);

        System.out.println("Number of pairs with absolute difference " + k + ": " + result);

        sc.close();
    }
}