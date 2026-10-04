import java.util.*;

public class _LC2778_IndexDivisibility_SumOfSquaresOfSpecialElements {

    public static int sumOfSquares(int[] nums) {

        int s = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums.length % (i + 1) == 0) {
                s = s + (nums[i] * nums[i]);
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

        System.out.println("Sum of squares: " + sumOfSquares(nums));

        sc.close();
    }
}