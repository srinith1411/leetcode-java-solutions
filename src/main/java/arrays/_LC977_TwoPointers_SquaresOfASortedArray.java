import java.util.Scanner;

class _LC977_TwoPointers_SquaresOfASortedArray {

    public  static int[] sortedSquares(int[] nums) {

        int res[] = new int[nums.length];

        int l = 0, r = nums.length - 1;

        int k = res.length - 1;

        while (l <= r) {

            int ls = nums[l] * nums[l];
            int rs = nums[r] * nums[r];

            if (ls > rs) {

                res[k--] = ls;
                l++;
            }

            else {

                res[k--] = rs;
                r--;

            }
        }

        return res;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int nums[] = new int[n];

        System.out.println("Enter sorted array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result[] = sortedSquares(nums);

        System.out.print("Sorted squares: ");
        for (int x : result) {
            System.out.print(x + " ");
        }

        sc.close();
    }
}