import java.util.Scanner;

public class _LC509_Recursion_FibonacciNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n:");
        int n = sc.nextInt();

        int result = fib(n);

        System.out.println("Output: " + result);

        sc.close();
    }

    public static int fib(int n) {

        if (n <= 1) {
            return n;
        }

        return fib(n - 1) + fib(n - 2);
    }
}