import java.util.Scanner;

public class _LC1470_Simulation_ShuffleTheArray {

    public static int[] shuffle(int[] a, int n) {

        int arr[] = new int[a.length];

        int i = 0, j = n;

        int k = 0;

        while (i < n ) {

            arr[k++] = a[i++];

            arr[k++] = a[j++];

        }

        return arr;

    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter n:");

        int n = s.nextInt();

        int a[] = new int[2 * n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < a.length; i++) {

            a[i] = s.nextInt();

        }

        int ans[] = shuffle(a, n);

        System.out.println("Shuffled Array:");

        for (int x : ans) {

            System.out.print(x + " ");

        }

        s.close();

    }

}