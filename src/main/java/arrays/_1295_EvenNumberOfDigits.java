import java.util.Scanner;

public class _1295_EvenNumberOfDigits {

	public static boolean check(int n) {

		int c = 0;

		while (n > 0) {

			c++;
			n = n / 10;
		}

		return c % 2 == 0;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size:");
		int n = sc.nextInt();

		int[] nums = new int[n];

		System.out.println("Enter array elements:");
		for (int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();
		}

		int c = 0;

		for (int i = 0; i < nums.length; i++) {

			if (check(nums[i])) {
				c++;
			}
		}

		System.out.println("Count: " + c);
	}
}