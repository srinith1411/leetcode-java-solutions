import java.util.*;

public class _LC1394_HashMap_FindLuckyIntegerInAnArray {

    static int findLucky(int[] arr) {

        HashMap<Integer, Integer> h = new HashMap<>();

        for (int i : arr) {
            h.put(i, h.getOrDefault(i, 0) + 1);
        }

        int ans = -1;

        for (int i : arr) {
            if (h.get(i) == i && i > ans) {
                ans = i;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Lucky Integer: " + findLucky(arr));

        sc.close();
    }
}