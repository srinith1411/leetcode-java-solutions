import java.util.HashSet;
import java.util.Scanner;

public class _LC2154_HashSet_Solution_KeepMultiplyingFoundValuesByTwo {

    public static int findFinalValue(int[] nums, int original) {

        HashSet<Integer> h = new HashSet<>();

        for (int i : nums) {
            h.add(i);
        }

        while (h.contains(original)) {
            original = 2 * original;
        }

        return original;
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

        System.out.print("Enter original: ");
        int original = sc.nextInt();

        System.out.println("Final Value: " + findFinalValue(nums, original));

        sc.close();
    }
}