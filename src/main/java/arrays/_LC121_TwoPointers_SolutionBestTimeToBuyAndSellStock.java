import java.util.*;

public class _LC121_TwoPointers_SolutionBestTimeToBuyAndSellStock {

    public static int maxProfit(int[] prices) {

        int max = 0, curr = 0, slow = 0;

        for (int fast = 1; fast < prices.length; fast++) {

            curr = prices[fast] - prices[slow];

            max = Math.max(curr, max);

            if (prices[fast] < prices[slow]) {
                slow = fast;
            }
        }

        return max;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of prices: ");
        int n = sc.nextInt();

        int[] prices = new int[n];

        System.out.println("Enter prices:");
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        System.out.println("Maximum Profit: " + maxProfit(prices));

        sc.close();
    }
}