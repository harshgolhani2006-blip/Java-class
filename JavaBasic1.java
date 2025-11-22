//class Java1 {
//    public static void main(String[] args) {
//        StringBuilder s1 = new StringBuilder("hello");
//        s1.insert(3, "bye"); // add other in middle string .
//        System.out.println(s1);
//        System.out.println(s1.append(false)); // with false.
//        System.out.println(s1);  // with false.
//    }
//}
// using of scanner.
//import java.util.Scanner;
//class JavaBasic1 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter value of a: ");
//        int a = sc.nextInt();
//        System.out.print("Enter value of b: ");
//        int b = sc.nextInt();
//
//        System.out.println("a="+a);
//        System.out.println("b="+b);
//        int sum = a + b;
//        System.out.println( "Sum is :"+sum);
//
//    }
//}
//Conversion concept .
//import java.util.Scanner;
//
//public class JavaBasic1{
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        // 1. byte → int
//        System.out.print("Enter a byte value: ");
//        byte b = sc.nextByte();
//        int i1 = b;
//        System.out.println("byte → int : " + i1);
//
//        // 2. int → byte
//        System.out.print("Enter an int value: ");
//        int a = sc.nextInt();
//        byte b2 = (byte) a;
//        System.out.println("int → byte : " + b2);
//
//        // 3. double → int
//        System.out.print("Enter a double value: ");
//        double d = sc.nextDouble();
//        int i2 = (int) d;
//        System.out.println("double → int : " + i2);
//
//        // 4. char → int
//        System.out.print("Enter a character: ");
//        char ch = sc.next().charAt(0);
//        int i3 = ch;
//        System.out.println("char → int : " + i3);
//
//        // 5. int → char
//        System.out.print("Enter an int (0–127): ");
//        int num = sc.nextInt();
//        char ch2 = (char) num;
//        System.out.println("int → char : " + ch2);
//
//        // 6. String → int
//        System.out.print("Enter a number (String): ");
//        String s1 = sc.next();
//        int n1 = Integer.parseInt(s1);
//        System.out.println("String → int : " + n1);
//
//        // 7. String → double
//        System.out.print("Enter a decimal number (String): ");
//        String s2 = sc.next();
//        double d2 = Double.parseDouble(s2);
//        System.out.println("String → double : " + d2);
//
//        // 8. boolean → String
//        System.out.print("Enter true/false: ");
//        boolean bool = sc.nextBoolean();
//        String s3 = String.valueOf(bool);
//        System.out.println("boolean → String : " + s3);
//    }
//}
//  print n time of  number using  for looop.
//import java.util.Scanner;
//class JavaBasic1{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter number(0 to n) value of n :");
//        int n = sc.nextInt();
//        for(int i=0;i<=n;i++){
//            System.out.println(i);
//        }
//    }
//}
// print Even number
//import java.util.Scanner;
//class JavaBasic1{
//    public static void main(String[] args){
//        Scanner sc= new Scanner(System.in);
//        System.out.print("Enter a value of n :");
//        int n=sc.nextInt();
//        for (int i = 1; i <= n; i++) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//        }
//    }
//}
//Print odd Number.
//import java.util.Scanner;
//public class JavaBasic1 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a value of n: ");
//        int n = sc.nextInt();
//        for (int i = 1; i <= n; i++) {
//            if(i%2!=0) {
//                System.out.println(i);
//            }
//        }
//    }
//}
// check even and odd number .
//import java.util.Scanner;
//public class JavaBasic1 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a Number :");
//        int number = sc.nextInt();
//        if (number % 2 == 0) {
//            System.out.println("It is an Even Number");
//            } else {
//                System.out.println("It is an Odd Number");
//        }
//    }
//}
//Add number byte .
//public class JavaBasic1 {
//    public static void main(String[] args) {
//        byte a=3;
//        System.out.println( "a="+a);
//        byte b=4;
//        System.out.println("b="+b);
//        int  c=a+b;
//        System.out.println("Addition of a and b= "+c);
//    }
//}
//print this patter
// [*
// *  *
// *  *  *
// *  *  *  *
// *  *  *  *  * ]
//public class JavaBasic1 {
//    public static void main(String[] args) {
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print(" * ");
//            }
//            System.out.println(" ");
//        }
//    }
//}
//print  this pattern
// [ *  *  *  *  *
// *  *  *  *
// *  *  *
// *  *
// *
//public class JavaBasic1 {
//    public static void main(String[] args) {
//        for (int i = 0; i < 5; i++) {
//            for (int j = 5; j > i; j--) {
//                System.out.print(" * ");
//            }
//            System.out.println(" ");
//        }
//    }
//}
//print this
// [*****
//*****
//*****
//*****
//*****]
//public class JavaBasic1 {
//    public static void main(String[] args) {
//        int n=5;
//
//        for(int i=0;i<n;i++){
//            for(int j=0;j<n;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}
//print this pattern
//       [ *
//        ***
//        *****
//        *******
//        *********
//        ]
 public class JavaBasic1 {
    public static void main(String[] args) {
        int n=5;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
