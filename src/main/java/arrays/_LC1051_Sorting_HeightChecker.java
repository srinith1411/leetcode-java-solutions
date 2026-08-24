import java.util.*;

class  _LC1051_Sorting_HeightChecker {

    public static int heightChecker(int[] h) {

        int res[] = Arrays.copyOf(h, h.length);

        Arrays.sort(res);

        int c = 0;

        for (int i = 0; i < h.length; i++) {

            if (h[i] != res[i]) {
                c++;
            }
        }

        return c;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input:
        // Enter number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int h[] = new int[n];

        // Enter heights
        System.out.println("Enter heights of " + n + " students:");
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }

        System.out.println("Number of students not in the correct position: ");
        System.out.println(heightChecker(h));

        sc.close();
    }
}