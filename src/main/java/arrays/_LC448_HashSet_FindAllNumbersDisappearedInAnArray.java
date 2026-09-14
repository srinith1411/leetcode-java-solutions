import java.util.*;

public class _LC448_HashSet_FindAllNumbersDisappearedInAnArray {

    public static List<Integer> findDisappearedNumbers(int[] nums) {

        ArrayList<Integer> a = new ArrayList<>();
        HashSet<Integer> h = new HashSet<>();

        for (int i : nums) {
            h.add(i);
        }

        for (int i = 1; i <= nums.length; i++) {
            if (!h.contains(i)) {
                a.add(i);
            }
        }

        return a;
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

        List<Integer> result = findDisappearedNumbers(nums);

        System.out.println("Disappeared numbers: " + result);

        sc.close();
    }
}