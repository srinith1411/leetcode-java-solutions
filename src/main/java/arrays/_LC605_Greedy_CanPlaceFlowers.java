import java.util.*;

public class _LC605_Greedy_CanPlaceFlowers {

    public static boolean canPlaceFlowers(int[] f, int n) {

        int c = 0;

        for (int i = 0; i < f.length; i++) {

            if (f[i] == 0) {
                boolean l = (i == 0) || f[i - 1] == 0;
                boolean r = (i == f.length - 1) || f[i + 1] == 0;

                if (l && r) {
                    f[i] = 1;
                    c++;
                }
            }

            if (c >= n)
                return true;
        }

        return c >= n;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int[] f = new int[size];

        System.out.println("Enter flowerbed elements (0 or 1):");
        for (int i = 0; i < size; i++) {
            f[i] = sc.nextInt();
        }

        System.out.print("Enter number of flowers to plant: ");
        int n = sc.nextInt();

        boolean result = canPlaceFlowers(f, n);

        System.out.println("Can place flowers: " + result);

        sc.close();
    }
}