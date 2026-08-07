import java.util.ArrayList;
import java.util.Scanner;

public class _1389_CreateTargetArrayInTheGivenOrder {

	public static int[] createTargetArray(int[] nums, int[] index) {

		ArrayList<Integer> l = new ArrayList<>();

		for (int i = 0; i < index.length; i++) {
			l.add(index[i], nums[i]);
		}

		int res[] = new int[l.size()];
		int k = 0;

		for (int i : l) {
			res[k++] = i;
		}

		return res;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size:");
		int n = sc.nextInt();

		int nums[] = new int[n];
		int index[] = new int[n];

		System.out.println("Enter nums array:");
		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}

		System.out.println("Enter index array:");
		for (int i = 0; i < n; i++) {
			index[i] = sc.nextInt();
		}

		int res[] = createTargetArray(nums, index);

		System.out.println("Target array:");
		for (int i : res) {
			System.out.print(i + " ");
		}

		sc.close();
	}
}