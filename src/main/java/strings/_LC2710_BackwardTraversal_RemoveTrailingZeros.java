import java.util.Scanner;

public class _LC2710_BackwardTraversal_RemoveTrailingZeros {

    public static String removeTrailingZeros(String num) {

        int x = 0;

        for (int i = num.length() - 1; i >= 0; i--) {

            if (num.charAt(i) != '0') {
                x = i;
                break;
            }
        }

        return num.substring(0, x + 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        String num = sc.nextLine();

        System.out.println("Result: " + removeTrailingZeros(num));

        sc.close();
    }
}