import java.util.*;
public class subString {
    static void subString(String ans,String str){
        if(str.isEmpty()){
            System.out.print(ans+" ");
            return;
        }
        char ch = str.charAt(0);
        //include
        subString(ans+ch,str.substring(1));
        //exclude
        subString(ans,str.substring(1));

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        subString("",str);
    }
}