import java.util.Scanner;

public class _LC1304_TwoPointers_FindNUniqueIntegersSumUpToZero {

    // Approach: Two Pointers / Symmetric Pairing
    public static int[] sumZero(int n) {

        int res[] = new int[n];

        int i = 0, j = n - 1, c = 1;

        while (i < j) {

            res[i++] = c;
            res[j--] = -c;

            c++;
        }

        return res;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] result = sumZero(n);

        System.out.print("Array: ");

        for (int num : result) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}