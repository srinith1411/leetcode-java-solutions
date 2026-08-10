import java.util.Scanner;

public class _485_MaxConsecutiveOnes {

    public static int findMaxConsecutiveOnes(int[] nums) {

        int curr = 0;
        int max = 0;

        for (int i : nums) {

            if (i == 1) {
                curr++;
                max = Math.max(curr, max);
            } else {
                curr = 0;
            }
        }

        return max;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size:");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Maximum consecutive ones: " + findMaxConsecutiveOnes(nums));

        sc.close();
    }
}