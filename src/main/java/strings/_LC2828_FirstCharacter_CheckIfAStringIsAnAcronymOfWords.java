import java.util.*;

public class _LC2828_FirstCharacter_CheckIfAStringIsAnAcronymOfWords {

    public static boolean isAcronym(List<String> words, String s) {

        StringBuilder sb = new StringBuilder();

        for (String st : words) {
            char c = st.charAt(0);
            sb.append(c);
        }

        return s.equals(sb.toString());
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of words: ");
        int n = sc.nextInt();

        List<String> words = new ArrayList<>();

        System.out.println("Enter the words:");
        for (int i = 0; i < n; i++) {
            words.add(sc.next());
        }

        System.out.print("Enter acronym string: ");
        String s = sc.next();

        System.out.println("Is acronym: " + isAcronym(words, s));

        sc.close();
    }
}