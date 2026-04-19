import java.util.*;
public class fibonacci {
    static int fibo(int x){
        if(x==0){
            return 0;
        }
        if(x==1){
            return 1;
        }
        return fibo(x-1) + fibo(x-2);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int x = sc.nextInt();
        System.out.println(fibo(x));
    }
}