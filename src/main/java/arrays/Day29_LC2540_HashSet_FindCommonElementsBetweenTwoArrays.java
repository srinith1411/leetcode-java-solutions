import java.util.*;

public class Day29_LC2540_HashSet_FindCommonElementsBetweenTwoArrays {

    public static int getCommon(int[] nums1, int[] nums2) {

        int min = Integer.MAX_VALUE;

        HashSet<Integer> h = new HashSet<>();

        for (int i : nums1) {
            h.add(i);
        }

        for (int j : nums2) {

            if (h.contains(j) && j < min) {
                min = j;
            }
        }

        if (min == Integer.MAX_VALUE)
            return -1;
        else
            return min;
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

        int result = getCommon(nums1, nums2);

        System.out.println("Smallest common element: " + result);

        sc.close();
    }
}