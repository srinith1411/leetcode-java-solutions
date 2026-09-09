import java.util.HashMap;
import java.util.Scanner;

public class _LC1460_HashMap_MakeTwoArraysEqualByReversingSubarrays {

    public static boolean canBeEqual(int[] target, int[] arr) {

        HashMap<Integer, Integer> h = new HashMap<>();

        // Count frequencies in target
        for (int i : target) {
            h.put(i, h.getOrDefault(i, 0) + 1);
        }

        // Subtract frequencies using arr
        for (int i : arr) {
            h.put(i, h.getOrDefault(i, 0) - 1);
        }

        // Check frequencies
        for (int k : h.keySet()) {
            if (h.get(k) != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of arrays: ");
        int n = sc.nextInt();

        int[] target = new int[n];
        int[] arr = new int[n];

        System.out.println("Enter target array:");
        for (int i = 0; i < n; i++) {
            target[i] = sc.nextInt();
        }

        System.out.println("Enter arr array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean result = canBeEqual(target, arr);

        System.out.println("Can be equal: " + result);

        sc.close();
    }
}