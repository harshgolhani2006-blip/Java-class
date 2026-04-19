import java.util.*;
public class countSubString {
    static int subString(String ans, String str) {
        if (str.isEmpty()) {
            return 1;
        }
        char ch = str.charAt(0);
        //include
        int l = subString(ans + ch, str.substring(1));
        //exclude
        int r = subString(ans, str.substring(1));
        return l+r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        System.out.println(subString("", str));

    }
}