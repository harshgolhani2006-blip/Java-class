import java.util.Scanner;
public class Binary {
    static void binary(String str,int n){
        if(n == 0){
            System.out.println(str);
            return;
        }
        binary(str +"0",n-1);
        binary(str +"1",n-1);

    }
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of bits:");
        int n = sc.nextInt();
        binary("",n);
    }
}
