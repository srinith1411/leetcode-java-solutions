import java.util.*;

public class _LC724_TotalSum_SolutionFindPivotIndex {

    static int pivotIndex(int[] nums) {

        int total = 0;

        for (int x : nums) {
            total += x;
        }

        int currentSum = 0;

        for (int i = 0; i < nums.length; i++) {

            currentSum += nums[i];

            if (total - currentSum == currentSum - nums[i]) {
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

        System.out.println("Pivot Index: " + pivotIndex(nums));

        sc.close();
    }
}