import java.util.*;

public class _LC219_HashMap_ContainsDuplicateII {

    static boolean containsNearbyDuplicate(int[] nums, int k) {

        HashMap<Integer, Integer> h = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if (h.containsKey(nums[i])) {

                if (Math.abs(h.get(nums[i]) - i) <= k)
                    return true;
            }

            h.put(nums[i], i);
        }

        return false;
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

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        System.out.println("Contains Nearby Duplicate: "
                + containsNearbyDuplicate(nums, k));

        sc.close();
    }
}