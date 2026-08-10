import java.util.Scanner;

public class _1768_TwoPointers_MergeStringsAlternately {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first string:");
		String s = sc.nextLine();

		System.out.println("Enter second string:");
		String t = sc.nextLine();

		StringBuilder sb = new StringBuilder();

		int i = 0, j = 0;

		while (i < s.length() && j < t.length()) {

			char c = s.charAt(i);
			char d = t.charAt(j);

			sb.append(c).append(d);

			i++;
			j++;
		}

		while (i < s.length()) {

			sb.append(s.charAt(i));
			i++;
		}

		while (j < t.length()) {

			sb.append(t.charAt(j));
			j++;
		}

		System.out.println("Merged string: " + sb);
	}
}