import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class _LC2367_HashSet_NumberOfArithmeticTriplets {

    public static int arithmeticTriplets(int[] nums, int diff) {

        Set<Integer> set = new HashSet<>();
        int count = 0;

        // Add all elements to the hash set
        for (int num : nums) {
            set.add(num);
        }

        // Check if both (num - diff) and (num + diff) exist
        for (int num : nums) {
            if (set.contains(num - diff) && set.contains(num + diff)) {
                count++;
            }
        }

        return count;
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

        System.out.print("Enter diff: ");
        int diff = sc.nextInt();

        System.out.println("Number of Arithmetic Triplets: "
                + arithmeticTriplets(nums, diff));

        sc.close();
    }
}