import java.util.*;

class _LC1299_BasicTraversal_ReplaceElements {

    public static int[] replaceElements(int[] a) {

        for(int i=0;i<a.length;i++){

            int max=-1;

            for(int j=i+1;j<a.length;j++){

                if(a[j]>max)
                    max=a[j];
            }
            a[i]=max;
        }

        return a;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter " + n + " array elements:");

        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }

        int[] result = replaceElements(a);

        System.out.println("Array after replacing elements:");

        for(int i=0;i<result.length;i++){
            System.out.print(result[i] + " ");
        }

        sc.close();
    }
}