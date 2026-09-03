import java.util.HashSet;
import java.util.Scanner;

public class _LC1496_HashSet_PathCrossing {

    public static boolean isPathCrossing(String path) {

        HashSet<Long> visited = new HashSet<>();
        int x = 0, y = 0;

        visited.add(((long) x << 32) | (y & 0xFFFFFFFFL));

        for (int i = 0; i < path.length(); i++) {

            char c = path.charAt(i);

            if (c == 'N') y++;
            else if (c == 'S') y--;
            else if (c == 'E') x++;
            else if (c == 'W') x--;

            long key = ((long) x << 32) | (y & 0xFFFFFFFFL);

            if (!visited.add(key)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the path string (using N, S, E, W): ");
        String path = sc.nextLine();

        boolean result = isPathCrossing(path);

        System.out.println("Does the path cross itself? " + result);

        sc.close();
    }
}
