import java.util.Scanner;

public class _LC283_TwoPointers_MoveZeroes {

    public static void moveZeroes(int[] nums) {

        int c = 0;

        for (int i : nums) {

            if (i != 0) {
                nums[c++] = i;
            }
        }

        for (int i = c; i < nums.length; i++) {
            nums[i] = 0;
        }
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

        moveZeroes(nums);

        System.out.println("Array after moving zeroes:");
        for (int i : nums) {
            System.out.print(i + " ");
        }

        sc.close();
    }
}