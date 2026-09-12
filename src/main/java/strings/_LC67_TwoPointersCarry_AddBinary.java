import java.util.Scanner;

public class _LC67_TwoPointersCarry_AddBinary {

    public static String addBinary(String a, String b) {

        StringBuilder sb = new StringBuilder();

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {

            int sum = carry;

            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }

            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }

            sb.append(sum % 2);
            carry = sum / 2;
        }

        return sb.reverse().toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter binary string a: ");
        String a = sc.nextLine();

        System.out.print("Enter binary string b: ");
        String b = sc.nextLine();

        System.out.println("Binary Sum: " + addBinary(a, b));

        sc.close();
    }
}