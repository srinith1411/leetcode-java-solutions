import java.util.Scanner;

class LC2697_TwoPointers_LexicographicallySmallestPalindrome {

    public  static String makeSmallestPalindrome(String s) {

        char[] arr = s.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            if (arr[left] != arr[right]) {

                if (arr[left] < arr[right]) {
                    arr[right] = arr[left];
                } else {
                    arr[left] = arr[right];
                }
            }

            left++;
            right--;
        }

        return new String(arr);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        String result = LC2697_TwoPointers_LexicographicallySmallestPalindrome .makeSmallestPalindrome(s);

        System.out.println("Lexicographically smallest palindrome: " + result);

        sc.close();
    }
}