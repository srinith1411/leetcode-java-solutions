import java.util.Scanner;

public class _LC1528_IndexMapping_ShuffleString {

    public static String restoreString(String s, int[] indices) {

        char ch[] = new char[s.length()];

        for (int i = 0; i < indices.length; i++) {

            ch[indices[i]] = s.charAt(i);
        }

        return new String(ch);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.next();

        int indices[] = new int[s.length()];

        System.out.println("Enter indices:");

        for (int i = 0; i < indices.length; i++) {
            indices[i] = sc.nextInt();
        }

        System.out.println("Shuffled string: " + restoreString(s, indices));

        sc.close();
    }
}