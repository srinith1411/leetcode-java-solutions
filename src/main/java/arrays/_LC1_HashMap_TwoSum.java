import java.util.HashMap;
import java.util.Scanner;

public class _LC1_HashMap_TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> h = new HashMap<>();
        int b[] = new int[2];

        for (int i = 0; i < nums.length; i++) {

            int ele = nums[i];
            int comp = target - nums[i];

            if (h.containsKey(comp)) {

                b[0] = h.get(comp);
                b[1] = i;
                break;

            }

            h.put(ele, i);
        }

        return b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int nums[] = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        int result[] = twoSum(nums, target);

        System.out.println("Output: [" + result[0] + ", " + result[1] + "]");

        sc.close();
    }
} 