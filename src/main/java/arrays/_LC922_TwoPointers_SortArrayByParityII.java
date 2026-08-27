import java.util.Scanner;

public class _LC922_TwoPointers_SortArrayByParityII {

    public static int[] sortArrayByParityII(int[] nums) {

        int ev = 0;
        int od = 1;

        while (ev < nums.length && od < nums.length) {

            if (nums[ev] % 2 == 0) {
                ev += 2;
            } 
            else if (nums[od] % 2 != 0) {
                od += 2;
            } 
            else {
                if (ev < nums.length && od < nums.length) {

                    int t = nums[ev];
                    nums[ev] = nums[od];
                    nums[od] = t;

                    ev += 2;
                    od += 2;
                }
            }
        }

        return nums;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] result = sortArrayByParityII(nums);

        System.out.print("Array after sorting by parity II: ");
        for (int num : result) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}