import java.util.Scanner;

public class _344_TwoPointer_ReverseString {
    

     public static void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string to reverse: ");
        String input = sc.nextLine();

        char[] charArray = input.toCharArray();

        reverseString(charArray);
        System.out.println("Reversed string: " + new String(charArray));
    }

    
}
