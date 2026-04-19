import java.util.*;
public class Step {
    public static void step(String str,int n){
        if(n==0){
            System.out.println(str);
            return;
        }
        if(n<0){
            return;
        }
        step(str+"1",n-1);
        step(str+"2",n-2);
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of steps");
        int n = sc.nextInt();
        step("",n);
    }
}
