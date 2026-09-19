import java.util.*;

public class _LC2042_StringSplitRegexArrayList_AreNumbersAscending {

    static boolean areNumbersAscending(String s) {

        String w[] = s.split(" ");
        ArrayList<Integer> l = new ArrayList<>();

        for (int i = 0; i < w.length; i++) {

            if (w[i].matches("\\d+")) {
                int x = Integer.parseInt(w[i]);
                l.add(x);
            }
        }

        for (int i = 1; i < l.size(); i++) {

            if (l.get(i) <= l.get(i - 1)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String s = sc.nextLine();

        System.out.println("Numbers are ascending: " + areNumbersAscending(s));

        sc.close();
    }
}