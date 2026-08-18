import java.util.Scanner;

public class Main {

    public static boolean validMountainArray(int[] arr) {

        if (arr.length < 3)
            return false;

        int i = 0, j = arr.length - 1;

        while (i < arr.length - 1 && arr[i] < arr[i + 1])
            i++;

        while (j > 0 && arr[j] < arr[j - 1])
            j--;

        return i > 0 && j < arr.length - 1 && i == j;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.println("Valid Mountain Array: " + validMountainArray(arr));
    }
}