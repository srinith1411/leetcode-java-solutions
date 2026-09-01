import java.util.Scanner;

public class _LC1374_StringConstruction_GenerateAStringWithCharactersThatHaveOddCounts {

    public static String generateTheString(int n) {

        String s = "";
        int ascii = 97;
        int i = 0;

        while (i < n - 1) {
            s = s + (char) ascii;
            i++;
        }

        if (n % 2 == 0)
            s = s + (char) ++ascii;
        else
            s = s + (char) ascii;

        return s;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Generated String: " + generateTheString(n));

        sc.close();
    }
}