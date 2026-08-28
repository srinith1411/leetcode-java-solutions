import java.util.Scanner;

public class _LC88_TwoPointers_MergeSortedArray {

    public static void merge(int[] a, int m, int[] b, int n) {

        int len = m + n - 1;

        int i = m - 1;
        int j = n - 1;
        int k = len;

        while (i >= 0 && j >= 0) {

            if (a[i] >= b[j]) {
                a[k--] = a[i--];
            } else {
                a[k--] = b[j--];
            }
        }

        while (j >= 0) {
            a[k--] = b[j--];
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter m: ");
        int m = sc.nextInt();

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] a = new int[m + n];
        int[] b = new int[n];

        System.out.println("Enter " + m + " sorted elements for first array:");
        for (int i = 0; i < m; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter " + n + " sorted elements for second array:");
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        merge(a, m, b, n);

        System.out.print("Merged array: ");
        for (int num : a) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}