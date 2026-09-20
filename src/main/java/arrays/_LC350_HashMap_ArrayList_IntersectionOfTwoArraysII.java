import java.util.*;

public class _LC350_HashMap_ArrayList_IntersectionOfTwoArraysII {

static int[] intersect(int[] nums1, int[] nums2) {
    HashMap<Integer, Integer> h = new HashMap<>();
    ArrayList<Integer> l = new ArrayList<>();
    for (int i : nums1) {
        h.put(i, h.getOrDefault(i, 0) + 1);
    }
    for (int j : nums2) {
        if (h.containsKey(j) && h.get(j) > 0) {
            l.add(j);
            h.put(j, h.get(j) - 1);
        }
    }
    int res[] = new int[l.size()];
    int k = 0;
    for (int x : l) {
        res[k++] = x;
    }
    return res;
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter size of nums1: ");
    int n = sc.nextInt();
    int nums1[] = new int[n];
    System.out.println("Enter elements of nums1:");
    for (int i = 0; i < n; i++) {
        nums1[i] = sc.nextInt();
    }
    System.out.print("Enter size of nums2: ");
    int m = sc.nextInt();
    int nums2[] = new int[m];
    System.out.println("Enter elements of nums2:");
    for (int i = 0; i < m; i++) {
        nums2[i] = sc.nextInt();
    }
    int result[] = intersect(nums1, nums2);
    System.out.print("Intersection: ");
    System.out.println(Arrays.toString(result));
    sc.close();
}

}