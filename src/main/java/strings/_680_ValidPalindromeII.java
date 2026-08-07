import java.util.Scanner;

public class _680_ValidPalindromeII {

	public static boolean isPal(String s, int l, int r) {

		while (l < r) {

			if (s.charAt(l) != s.charAt(r))
				return false;

			l++;
			r--;
		}

		return true;
	}

	public static boolean validPalindrome(String s) {

		int l = 0, r = s.length() - 1;

		while (l < r) {

			if (s.charAt(l) == s.charAt(r)) {

				l++;
				r--;

			} else {

				return isPal(s, l + 1, r) || isPal(s, l, r - 1);
			}
		}

		return true;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter string:");
		String s = sc.nextLine();

		System.out.println(validPalindrome(s));

		sc.close();
	}
}