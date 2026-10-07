import java.util.Scanner;

public class _LC2138_Grouping_StringBuilder_DivideAStringIntoGroupsOfSizeK {

    public static String[] divideString(String s, int k, char fill) {

        int n = s.length();

        int totalGroups = (n + k - 1) / k;

        String[] result = new String[totalGroups];

        for (int i = 0; i < totalGroups; i++) {

            int start = i * k;
            int end = Math.min(start + k, n);

            StringBuilder part = new StringBuilder(s.substring(start, end));

            while (part.length() < k) {
                part.append(fill);
            }

            result[i] = part.toString();
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        System.out.print("Enter group size k: ");
        int k = sc.nextInt();

        System.out.print("Enter fill character: ");
        char fill = sc.next().charAt(0);

        String[] result = divideString(s, k, fill);

        System.out.println("Result:");

        for (String group : result) {
            System.out.println(group);
        }

        sc.close();
    }
}