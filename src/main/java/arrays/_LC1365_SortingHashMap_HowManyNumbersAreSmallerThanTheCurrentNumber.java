import java.util.*;

public class _LC1365_SortingHashMap_HowManyNumbersAreSmallerThanTheCurrentNumber {

    public static int[] smallerNumbersThanCurrent(int[] nums) {

        int[] copy = Arrays.copyOf(nums, nums.length);
        int[] ans = new int[nums.length];

        HashMap<Integer, Integer> h = new HashMap<>();

        Arrays.sort(copy);

        for (int i = 0; i < copy.length; i++) {

            if (!h.containsKey(copy[i])) {
                h.put(copy[i], i);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            ans[i] = h.get(nums[i]);
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

        int[] result = smallerNumbersThanCurrent(nums);

        System.out.print("Result: ");

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

        sc.close();
    }
}