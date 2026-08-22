import java.util.Scanner;

public class LC27_FastSlowPointers_RemoveElement {

    public static int removeElement(int[] nums, int val) {

        int s = 0;

        for (int fast = 0; fast < nums.length; fast++) {

            if (nums[fast] != val) {
                nums[s++] = nums[fast];
            }
        }

        return s;
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

        System.out.print("Enter value to remove: ");
        int val = sc.nextInt();

        int k = removeElement(nums, val);

        System.out.println("Number of elements remaining: " + k);

        System.out.print("Array after removing " + val + ": ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }

        sc.close();
    }
}