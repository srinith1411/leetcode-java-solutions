import java.util.HashMap;
import java.util.Scanner;

public class _LC169_HashMap_MajorityElement {

    static int majorityElement(int[] nums) {

        HashMap<Integer, Integer> h = new HashMap<>();
        int ans = 0;

        for (int i : nums) {

            h.put(i, h.getOrDefault(i, 0) + 1);

            if (h.get(i) > nums.length / 2) {
                ans = i;
                break;
            }
        }

        return ans;
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

        System.out.println("Majority Element: " + majorityElement(nums));

        sc.close();
    }
}