import java.util.*;

public class _LC1991_PrefixSum_FindMiddleIndex {

    static int findMiddleIndex(int[] nums) {

        int totalSum = 0;

        for (int i : nums) {
            totalSum += i;
        }

        int currentSum = 0;

        for (int i = 0; i < nums.length; i++) {

            currentSum += nums[i];

            if (totalSum - currentSum == currentSum - nums[i]) {
                return i;
            }
        }

        return -1;
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

        System.out.println("Middle Index: " + findMiddleIndex(nums));

        sc.close();
    }
}