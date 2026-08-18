import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static String decodeMessage(String key, String message) {

        HashMap<Character, Character> h = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        int ascii = 97;

        for (char c : key.toCharArray()) {

            if (c >= 'a' && c <= 'z' && !h.containsKey(c)) {
                h.put(c, (char) ascii);
                ascii++;
            }
        }

        for (char c : message.toCharArray()) {

            if (c >= 'a' && c <= 'z')
                sb.append(h.get(c));
            else
                sb.append(' ');
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter key: ");
        String key = sc.nextLine();

        System.out.print("Enter message: ");
        String message = sc.nextLine();

        System.out.println("Decoded message: " + decodeMessage(key, message));
    }
}