import java.util.Scanner;

public class _LC1859_SplitArrayIndexingStringBuilder_SortingTheSentence {

    public static String sortSentence(String s) {

        String w[] = s.split(" ");
        String sorted[] = new String[w.length];

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < w.length; i++) {

            int t = Character.getNumericValue(w[i].charAt(w[i].length() - 1));
            sorted[t - 1] = w[i].substring(0, w[i].length() - 1);

        }

        for (String t : sorted) {
            if (t != null)
                sb.append(t).append(" ");
        }

        return sb.toString().trim();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the shuffled sentence: ");
        String s = sc.nextLine();

        System.out.println("Sorted Sentence: " + sortSentence(s));

        sc.close();
    }
}