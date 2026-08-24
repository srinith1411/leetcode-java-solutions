import java.util.*;

public class _LC392_TwoPointer_IsSubsequence {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter string s:");
        String s=sc.nextLine();

        System.out.println("Enter string t:");
        String t=sc.nextLine();

        if(s.length()>t.length()){
            System.out.println("Result: false");
            sc.close();
            return;
        }

        int i=0;

        for(int j=0;j<t.length();j++){

            if(i<s.length() && t.charAt(j)==s.charAt(i)){ // i<s.length() is important to avoid index out of bounds exception if(s.length()==0)
                i++;
            }
        }

        if(i==s.length()){
            System.out.println("Result: true");
        }
        else{
            System.out.println("Result: false");
        }

        sc.close();

    }
}