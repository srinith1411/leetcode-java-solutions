import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _LC1078_Traversal_OccurrencesAfterBigram {

    public static String[] findOcurrences(String text, String f, String sec) {

        ArrayList<String> l = new ArrayList<>();

        String[] text1 = text.split(" ");

        for (int i = 2; i < text1.length; i++) {

            if (text1[i - 1].equals(sec) && text1[i - 2].equals(f)) {
                l.add(text1[i]);
            }
        }

        String[] res = new String[l.size()];
        int k = 0;

        for (String s : l) {
            res[k++] = s;
        }

        return res;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        System.out.print("Enter first word: ");
        String f = sc.nextLine();

        System.out.print("Enter second word: ");
        String sec = sc.nextLine();

       String[] result = findOcurrences(text, f, sec);

        System.out.println("Occurrences: " + Arrays.toString(result));

        sc.close();
    }
}