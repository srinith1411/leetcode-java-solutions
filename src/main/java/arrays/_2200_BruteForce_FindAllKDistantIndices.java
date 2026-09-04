import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _2200_BruteForce_FindAllKDistantIndices {

    public static List<Integer> findKDistantIndices(int[] nums, int key, int k) {

        List<Integer> l = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {

            for (int j = 0; j < nums.length; j++) {

                if (Math.abs(i - j) <= k && nums[j] == key) {
                    l.add(i);
                    break;
                }
            }
        }

        return l;
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

        System.out.print("Enter key: ");
        int key = sc.nextInt();

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        List<Integer> result = findKDistantIndices(nums, key, k);

        System.out.println("K-Distant Indices: " + result);

        sc.close();
    }
}