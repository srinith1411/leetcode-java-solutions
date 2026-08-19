import java.util.Scanner;

class Solution {

    public void duplicateZeros(int[] arr) {

        int n = arr.length;
        int zeros = 0;
        int left = 0;

        // Phase 1: Find the number of zeros to be duplicated that can fit
        while (left < n - zeros) {
            if (arr[left] == 0) {

                // Edge case: Zero at the boundary cannot be duplicated
                if (left == n - zeros - 1) {
                    arr[n - 1] = 0;
                    n--;
                    break;
                }

                zeros++;
            }

            left++;
        }

        // Phase 2: Start copying elements backward
        int source = left - 1;
        int destination = n - 1;

        while (source >= 0) {

            if (arr[source] == 0) {
                arr[destination] = 0;
                arr[destination - 1] = 0;
                destination -= 2;
            } else {
                arr[destination] = arr[source];
                destination--;
            }

            source--;
        }
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

        Solution obj = new Solution();
        obj.duplicateZeros(arr);

        System.out.println("Array after duplicating zeros:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}