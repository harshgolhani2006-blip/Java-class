import java.util.Scanner;

// public class pattern {
//     public static void main(String[] args) {
//      Scanner sc = new Scanner(System.in);
//      System.out.print("Enter the value of n :");
//         int n = sc.nextInt();
//      for(int i=1;i<=n;i++){
//         for(int j=1;j<=i;j++){
//             System.out.print("*");
//         }
//         System.out.println();
//      }
//     }
// }

// public class secondPattern{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the value of n :");
//         int n = sc.nextInt();
//         for(int i=0;i<=n-1;i++){
//             for(int j=i;j<=n-1;j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }
// public class ThirdPattern {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter value of n :");
//         int n = sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n;j++){
//                 if(i==1 || i==n || j==1 || j==n){
//                     System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }
// public class ForthPattern {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter value of n : ");
//         int n = sc.nextInt();
//         for(int i=n;i>=1;i--){  // inverted pyramid only
//             for(int j=i;j<n;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<(2*i-1);j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//     }
// }
import java.util.Scanner;

public class FifthPattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n : ");
        int n = sc.nextInt();

        // Upper part
        for(int i = 1; i <= n; i++){
            for(int j = i; j < n; j++){
                System.out.print(" ");  
            }
            for(int j = 1; j <= (2*i - 1); j++){
                System.out.print("*");  
            }
            System.out.println();
        }

        // Lower part
        for(int i = n-1; i >= 1; i--){
            for(int j = i; j < n; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= (2*i - 1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}