import java.util.*;

public class _LC1207_FrequencyMapHashSet_UniqueNumberOfOccurrences {

    static boolean uniqueOccurrences(int[] arr) {

        HashMap<Integer, Integer> h = new HashMap<>();
        HashSet<Integer> h1 = new HashSet<>();

        for (int i : arr) {
            h.put(i, h.getOrDefault(i, 0) + 1);
        }

        for (int k : h.values()) {

            if (h1.contains(k)) {
                return false;
            }

            h1.add(k);
        }

        return true;
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

        System.out.println("Unique occurrences: " + uniqueOccurrences(arr));

        sc.close();
    }
}