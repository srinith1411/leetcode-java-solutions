import java.util.Scanner;

public class _LC1512_BruteForceNestedLoops_NumberOfGoodPairs {

    public static int numIdenticalPairs(int[] nums) {

        int c = 0;

        for (int i = 0; i < nums.length; i++) {

            for (int j = 0; j < nums.length; j++) {

                if (nums[i] == nums[j] && i < j) {
                    c++;
                }
            }
        }

        return c;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int nums[] = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Number of Good Pairs: " + numIdenticalPairs(nums));

        sc.close();
    }
}