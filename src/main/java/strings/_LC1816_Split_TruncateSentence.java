import java.util.*;

class _LC1816_Split_TruncateSentence {

    // Approach: Split + StringBuilder
    public static String truncateSentence(String s, int k) {

        String w[] = s.split(" ");

        System.out.println(Arrays.toString(w));

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < k; i++) {
            sb.append(w[i]).append(i != k - 1 ? " " : "");
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String s = sc.nextLine();

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        System.out.println("Result: " + truncateSentence(s, k));

        sc.close();
    }
}