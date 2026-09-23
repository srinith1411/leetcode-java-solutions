import java.util.Arrays;
import java.util.Scanner;

public class _LC414_Sorting_ThirdMaximumNumber {

    static int thirdMax(int[] nums) {

        Arrays.sort(nums);
        
        int max = nums[nums.length - 1];
        int c = 0;
        boolean flag = true;

        for (int i = nums.length - 2; i >= 0; i--) {

            if (nums[i] < max && nums[i] != max) {
                max = nums[i];
                c++;
            }

            if (c == 2) {
                flag = false;
                break;
            }
        }

        if (!flag) {
            return max;
        } else {
            return nums[nums.length - 1];
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

        System.out.println("Third maximum: " + thirdMax(nums));

        sc.close();
    }
}