import java.util.Scanner;

public class _1672_BasicTraversal_RichestCustomerWealth {

    public static int maximumWealth(int[][] accounts) {

        int ans = 0;

        for (int i = 0; i < accounts.length; i++) {
            int curr = 0;
            for (int j = 0; j < accounts[i].length; j++) {

                curr = curr + accounts[i][j];

            }

            ans = Math.max(ans, curr);
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] accounts = new int[rows][cols];

        System.out.println("Enter array elements:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                accounts[i][j] = sc.nextInt();
            }
        }

        System.out.println("Maximum Wealth: " + maximumWealth(accounts));

        sc.close();
    }
}