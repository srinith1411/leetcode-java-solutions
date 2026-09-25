import java.util.*;

public class _LC2215_HashSet_FindTheDifferenceOfTwoArrays {

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        HashSet<Integer> h = new HashSet<>();
        HashSet<Integer> res = new HashSet<>();
        HashSet<Integer> res1 = new HashSet<>();

        for (int i : nums1) {
            h.add(i);
        }

        for (int j : nums2) {
            if (!h.contains(j))
                res.add(j);
        }

        h.clear();

        for (int k : nums2)
            h.add(k);

        for (int j : nums1) {
            if (!h.contains(j))
                res1.add(j);
        }

        return Arrays.asList(
                new ArrayList<>(res1),
                new ArrayList<>(res)
        );
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of nums1: ");
        int n1 = sc.nextInt();

        int[] nums1 = new int[n1];

        System.out.println("Enter elements of nums1:");
        for (int i = 0; i < n1; i++) {
            nums1[i] = sc.nextInt();
        }

        System.out.print("Enter size of nums2: ");
        int n2 = sc.nextInt();

        int[] nums2 = new int[n2];

        System.out.println("Enter elements of nums2:");
        for (int i = 0; i < n2; i++) {
            nums2[i] = sc.nextInt();
        }

        List<List<Integer>> result = findDifference(nums1, nums2);

        System.out.println("Result: " + result);

        sc.close();
    }
}