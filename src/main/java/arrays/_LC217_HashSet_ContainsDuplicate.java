import java.util.HashSet;
import java.util.Scanner;

public class _LC217_HashSet_ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {

        HashSet<Integer> h = new HashSet<>();

        for (int i : nums) {
            if (h.contains(i)) {
                return true;
            }
            h.add(i);
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

        boolean result = containsDuplicate(nums);

        System.out.println("Contains Duplicate: " + result);

        sc.close();
    }
}