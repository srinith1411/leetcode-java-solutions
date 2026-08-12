import java.util.*;

class LC58_ReverseTraversal_LengthOfLastWord {

    public static int lengthOfLastWord(String s) {

        s = s.trim();

        int i = 0;
        int j = s.length() - 1;

        while (j >= 0 && s.charAt(j) != ' ') {
            i++;
            j--;
        }

        return i;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        System.out.println("Length of last word: " + lengthOfLastWord(s));

        sc.close();
    }
}