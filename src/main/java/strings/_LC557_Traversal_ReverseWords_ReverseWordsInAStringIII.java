import java.util.Scanner;

public class _LC557_Traversal_ReverseWords_ReverseWordsInAStringIII {

    public static String reverseWords(String s) {

        StringBuilder sb = new StringBuilder();

        String w[] = s.split(" ");

        for (int i = 0; i < w.length; i++) {

            sb.append(new StringBuilder(w[i]).reverse())
              .append(i != w.length - 1 ? " " : "");

        }

        return new String(sb);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println(reverseWords(s));

        sc.close();
    }
}