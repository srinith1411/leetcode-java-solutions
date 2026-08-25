import java.util.*;

public class _LC905_TwoPointers_SortArrayByParity {

    public static int[] sortArrayByParity(int[] nums) {

        int slow = 0;

        for (int fast = 0; fast < nums.length; fast++) {

            if (nums[fast] % 2 == 0) {

                int t = nums[slow];
                nums[slow] = nums[fast];
                nums[fast] = t;

                slow++;
            }
        }

        return nums;
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

        int[] result = sortArrayByParity(nums);

        System.out.println("Array after sorting by parity:");

        for (int num : result) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}