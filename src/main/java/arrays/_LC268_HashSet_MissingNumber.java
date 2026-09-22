import java.util.*;

public class _LC268_HashSet_MissingNumber {

    static int missingNumber(int[] nums) {

        HashSet<Integer> h = new HashSet<>();

        for (int i : nums) {
            h.add(i);
        }

        int ans = 0;

        for (int i = 0; i <= nums.length; i++) {
            if (!h.contains(i)) {
                ans = i;
                break;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Missing number: " + missingNumber(nums));

        sc.close();
    }
}