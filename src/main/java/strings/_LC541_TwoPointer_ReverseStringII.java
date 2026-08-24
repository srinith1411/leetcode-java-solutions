import java.util.Scanner;

public class _LC541_TwoPointer_ReverseStringII {

    public static String reverseStr(String s, int k) {

    char c[]=s.toCharArray();

    for(int i=0;i<c.length;i+=2*k)
{

    int left=i;
    int right=Math.min(i+k-1,c.length-1);

    while(left<right){

        char t=c[left];
        c[left]=c[right];
        c[right]=t;
        left++;
        right--;    
    }
}

    return new String(c);
}  
  public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");

        String s = sc.nextLine();

        System.out.print("Enter k: ");

        int k = sc.nextInt();

        System.out.println(reverseStr(s, k));

        sc.close();

    }
}