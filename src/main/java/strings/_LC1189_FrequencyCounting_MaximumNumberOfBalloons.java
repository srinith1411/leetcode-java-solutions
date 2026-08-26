import java.util.Scanner;

class _LC1189_FrequencyCounting_MaximumNumberOfBalloons {

    public static int maxNumberOfBalloons(String text) {

        // 1. Create separate counts for the required letters
        int b = 0, a = 0, l = 0, o = 0, n = 0;

        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);

            // 2. Track exactly which letter you found
            if (current == 'b') b++;
            if (current == 'a') a++;
            if (current == 'l') l++;
            if (current == 'o') o++;
            if (current == 'n') n++;
        }

        // 3. 'l' and 'o' are needed twice per balloon
        l = l / 2;
        o = o / 2;

        // 4. Return the minimum count
        int min = b;

        if (a < min) min = a;
        if (l < min) min = l;
        if (o < min) min = o;
        if (n < min) min = n;

        return min;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the text: ");
        String text = sc.nextLine();

        int result = maxNumberOfBalloons(text);

        System.out.println("Maximum number of balloons: " + result);

        sc.close();
    }
}