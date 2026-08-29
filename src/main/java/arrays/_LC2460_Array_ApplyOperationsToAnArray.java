import java.util.Scanner;

public class _LC2460_Array_ApplyOperationsToAnArray {

    public static int[] applyOperations(int[] nums) {

        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] == nums[i + 1]) {

                nums[i] = nums[i] * 2;
                nums[i + 1] = 0;
            }
        }

        int c = 0;

        for (int i : nums) {
            if (i != 0) {
                nums[c++] = i;
            }
        }

        for (int i = c; i < nums.length; i++) {
            nums[i] = 0;
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

        int[] result = applyOperations(nums);

        System.out.print("Output: ");

        for (int i : result) {
            System.out.print(i + " ");
        }

        sc.close();
    }
}