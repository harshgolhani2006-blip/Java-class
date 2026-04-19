import java.util.*;
public class HeadTail {
    static void headTail(String str,int n){
        if(n == 0){
            System.out.println(str);
            return;
        }
        headTail(str+"H",n-1);
        headTail(str+"T",n-1);
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of coins");
        int n = sc.nextInt();
        headTail("",n);
    }
}
