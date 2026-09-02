import java.util.Scanner;

public class _LC1413_PrefixSum_MinimumValueToGetPositiveStepByStepSum {

    public static int minStartValue(int[] nums) {
        int sum = 0;
        int minSum = 0;

        for (int num : nums) {
            sum += num;
            minSum = Math.min(minSum, sum);
        }

        return 1 - minSum;
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

        int result = minStartValue(nums);

        System.out.println("Minimum Start Value: " + result);

        sc.close();
    }
}