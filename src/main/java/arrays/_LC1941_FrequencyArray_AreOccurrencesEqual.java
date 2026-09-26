import java.util.*;

public class _LC1941_FrequencyArray_AreOccurrencesEqual {

    static boolean areOccurrencesEqual(String s) {

        int freq[] = new int[26];

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        int t = 0;

        for (int i = 0; i < freq.length; i++) {

            if (freq[i] > 0) {

                if (t == 0) {
                    t = freq[i];
                } else if (freq[i] != t) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        System.out.println(areOccurrencesEqual(s));

        sc.close();
    }
}