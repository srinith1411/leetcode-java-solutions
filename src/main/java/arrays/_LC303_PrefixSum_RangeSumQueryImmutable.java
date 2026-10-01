import java.util.*;

public class _LC303_PrefixSum_RangeSumQueryImmutable {

    static int rangeSum(int[] nums, int left, int right) {
        int[] prefix = new int[nums.length + 1];

        for (int i = 0; i < nums.length; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }

        return prefix[right + 1] - prefix[left];
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

        System.out.print("Enter left index: ");
        int left = sc.nextInt();

        System.out.print("Enter right index: ");
        int right = sc.nextInt();

        System.out.println("Range Sum: " + rangeSum(nums, left, right));

        sc.close();
    }
}