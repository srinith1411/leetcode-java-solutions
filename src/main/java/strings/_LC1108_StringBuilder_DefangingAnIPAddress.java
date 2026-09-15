import java.util.Scanner;

public class _LC1108_StringBuilder_DefangingAnIPAddress {

    static String defangIPaddr(String address) {

        StringBuilder sb = new StringBuilder();

        for (char c : address.toCharArray()) {

            if (c == '.') {
                sb.append("[.]");
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter IP Address: ");
        String address = sc.nextLine();

        System.out.println("Defanged IP Address: " + defangIPaddr(address));

        sc.close();
    }
}