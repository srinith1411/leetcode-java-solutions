import java.util.*;

public class _LC1748_HashMap_SumOfUniqueElements {

    static int sumOfUnique(int[] nums) {

        HashMap<Integer, Integer> h = new HashMap<>();

        for (int i : nums) {
            h.put(i, h.getOrDefault(i, 0) + 1);
        }

        int s = 0;

        for (int k : h.keySet()) {
            if (h.get(k) == 1) {
                s += k;
            }
        }

        return s;
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

        System.out.println("Sum of unique elements: " + sumOfUnique(nums));

        sc.close();
    }
}