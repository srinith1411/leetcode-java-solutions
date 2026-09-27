import java.util.HashSet;
import java.util.Scanner;

public class _LC645_HashSet_SetMismatch {

    public static int[] findErrorNums(int[] nums) {

        HashSet<Integer> h = new HashSet<>();

        int res = -1;
        int ans = -1;

        for (int i : nums) {

            if (h.contains(i)) {
                res = i;
            }

            h.add(i);
        }

        for (int i = 1; i <= nums.length; i++) {

            if (!h.contains(i)) {
                ans = i;
                break;
            }
        }

        return new int[]{res, ans};
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

        int[] result = findErrorNums(nums);

        System.out.println("Duplicate: " + result[0]);
        System.out.println("Missing: " + result[1]);

        sc.close();
    }
}