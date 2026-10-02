import java.util.Scanner;

class _LC1295_DigitCount_FindNumbersWithEvenNumberOfDigits {

    public static boolean check(int n) {

        int c = 0;

        while (n > 0) {

            c++;
            n = n / 10;
        }

        return c % 2 == 0;
    }

    public static int findNumbers(int[] nums) {

        int c = 0;

        for (int i = 0; i < nums.length; i++) {

            if (check(nums[i])) {
                c++;
            }
        }

        return c;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Count: " + findNumbers(nums));

        sc.close();
    }
}