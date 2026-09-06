import java.util.*;

public class _LC2465_Sorting_TwoPointers_DistinctAverages {

    public static int distinctAverages(int[] nums) {

        Arrays.sort(nums);

        int i = 0, j = nums.length - 1;

        HashSet<Double> h = new HashSet<>();

        while (i < j) {

            double avg = (nums[i] + nums[j]) / 2.0;
            h.add(avg);

            i++;
            j--;
        }

        return h.size();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = distinctAverages(nums);

        System.out.println("Number of distinct averages: " + result);

        sc.close();
    }
}