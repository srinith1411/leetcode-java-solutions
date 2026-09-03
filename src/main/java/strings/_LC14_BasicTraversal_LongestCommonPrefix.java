import java.util.*;

class _LC14_BasicTraversal_LongestCommonPrefix {

    public static String longestCommonPrefix(String[] w) {

        StringBuilder sb = new StringBuilder("");

        for(int i=0;i<w[0].length();i++){

            for(int j=1;j<w.length;j++){

                if(i>=w[j].length() || w[j].charAt(i)!=w[0].charAt(i)){
                    return new String(sb);
                }
            }

            sb.append(w[0].charAt(i));
        }

        return new String(sb);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();

        String[] w = new String[n];

        System.out.println("Enter " + n + " strings:");

        for(int i=0;i<n;i++){
            w[i] = sc.next();
        }

        String result = longestCommonPrefix(w);

        System.out.println("Longest Common Prefix: " + result);

        sc.close();
    }
}