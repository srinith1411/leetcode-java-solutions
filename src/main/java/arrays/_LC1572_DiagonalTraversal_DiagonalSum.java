import java.util.Scanner;

public class _LC1572_DiagonalTraversal_DiagonalSum {

    public static int diagonalSum(int[][] mat) {

        int s = 0;

        for (int i = 0; i < mat.length; i++) {

            s = s + mat[i][i];
            s = s + mat[i][mat.length - 1 - i];

        }

        if (mat.length % 2 == 1) {

            s = s - mat[mat.length / 2][mat.length / 2];
        }

        return s;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter matrix size: ");
        int n = sc.nextInt();

        int[][] mat = new int[n][n];

        System.out.println("Enter matrix elements:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Diagonal Sum: " + diagonalSum(mat));

        sc.close();
    }
} 
    

