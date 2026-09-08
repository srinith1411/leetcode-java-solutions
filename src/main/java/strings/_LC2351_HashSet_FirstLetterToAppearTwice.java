import java.util.HashSet;
import java.util.Scanner;

public class _LC2351_HashSet_FirstLetterToAppearTwice {

    public static char repeatedCharacter(String s) {

        HashSet<Character> h = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (h.contains(ch)) {
                return ch;
            }

            h.add(ch);
        }

        return '\u0000';
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        char result = repeatedCharacter(s);

        System.out.println("First repeated character: " + result);

        sc.close();
    }
}





 // HashMap<Character,Integer> h=new HashMap<>();
    // HashMap<Character,Integer> h1=new HashMap<>();

    // for(int i=0;i<s.length();i++){

    //     char c=s.charAt(i);

    //     h.put(c,h.getOrDefault(c,0)+1);
    //     if(h.get(c)==2){
    //         h1.put(c,i);
    //     }
    // }

    // System.out.println(h1);


    //     char ans='\u0000';
    //     int min=Integer.MAX_VALUE;

    //     for(int i=0;i<s.length();i++){

    //         if(h.get(s.charAt(i))>=2 && h1.get(s.charAt(i))<min){
    //             ans=s.charAt(i);
    //             System.out.println(ans);
    //             min=h1.get(s.charAt(i));
    //             System.out.println(h1.get(s.charAt(i)));
    //             System.out.println(min);
    //         }

    //     }

    //     return ans;