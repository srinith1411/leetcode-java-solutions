import java.util.*;

public class _LC2129_StringSplit_StringBuilder_CapitalizeTheTitle {

static String capitalizeTitle(String title) {
    String w[] = title.split(" ");
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < w.length; i++) {
        if (w[i].length() <= 2) {
            sb.append(w[i].toLowerCase());
        } else {
            sb.append(w[i].substring(0, 1).toUpperCase()
                    + w[i].substring(1).toLowerCase());
        }
        sb.append(" ");
    }
    return sb.toString().trim();
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter title: ");
    String title = sc.nextLine();
    String result = capitalizeTitle(title);
    System.out.println("Capitalized title: " + result);
    sc.close();
}

}