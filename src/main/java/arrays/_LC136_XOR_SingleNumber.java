import java.util.*;

public class _LC136_XOR_SingleNumber {

    static int singleNumber(int[] nums) {

        int ans = 0;

        for (int i : nums) {
            ans = ans ^ i;
        }

        return ans;
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

        System.out.println("Single number: " + singleNumber(nums));

        sc.close();
    }
}