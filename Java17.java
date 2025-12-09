//import java.util.ArrayList;
//import java.util.Scanner;
//import java.util.ListIterator;

import java.util.Arrays;
import java.util.Scanner;

//if t=14 then remove small list in t and print list.
//public class Java17 {
//    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(40);
//        list.add(5);
//        list.add(3);
//        list.add(10);
//        list.add(20);
//        list.add(3);
//        ListIterator<Integer>it = list.listIterator();
//
//        int target;
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter Target Number");
//        target = sc.nextInt();
//
//        if (!list.contains(target)) {
//            System.out.println("Target value NOT found in list!");
//            System.out.println("List remains same: " + list);
//            return;   // Stop program
//        }
//        while(it.hasNext()){
//          if(it.next()<target){
//              it.remove();
//          }
//        }
//        System.out.println(list);
//    }
//}
//Exception Handling
//public class Java17 {
//    public static void main(String[] args) {
//        System.out.println("Hello World");
//        //Integer.
//        try {
//            int a = 10;
//            int b=0;
//            int c=a/b;
//            System.out.println(c);
//        }catch (Exception e){
//            System.out.println(e);
//        }
//        System.out.println("Bye!");
//        int a=5;
//       int b=2;
//        int b=0;
//        int c=a/b; //get error.
//        System.out.println(c);
        // System.out.println("Bye!");
        //Array.
//        int arr[]={1,2,3};
//        System.out.println(arr[3]);  error
//        try{
//            int arr[]={1,2,3,4};
//            System.out.println(arr[4]);
//        }catch(Exception e){
//            System.out.println(e);
//        }
//        System.out.println("Bye World");
        //String.
//        String str = null;
//        System.out.println(str.length());
//        try{
//            String str=null;
//            System.out.println(str.length());
//        }catch(Exception e){
//            System.out.println(e);
//        }
//        System.out.println("Bye! World");
//    }
//}
//User input .
//import java.util.Scanner;
//
//public class Java17 {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("=== Exception Handling with User Input ===");
//        // 1. Arithmetic Exception (Division)
//        try {
//            System.out.print("Enter number a: ");
//            int a = sc.nextInt();
//
//            System.out.print("Enter number b: ");
//            int b = sc.nextInt();
//
//            int c = a / b;   // may cause divide by zero
//            System.out.println("Result = " + c);
//
//        } catch (Exception e) {
//            System.out.println("Arithmetic Error: " + e);
//        }
//        // 2. Array Index Exception
//        try {
//            int arr[] = {10, 20, 30, 40};
//
//            System.out.print("Enter array index (0-3): ");
//            int index = sc.nextInt();
//
//            System.out.println("Value = " + arr[index]);
//
//        } catch (Exception e) {
//            System.out.println("Array Error: " + e);
//        }
//        // 3. Null Pointer Exception
//        try {
//            String str = null;
//
//            System.out.print("Enter 1 to use null string: ");
//            int ch = sc.nextInt();
//
//            if (ch == 1) {
//                System.out.println(str.length()); // NullPointerException
//            } else {
//                str = "Harsh";
//                System.out.println("String length: " + str.length());
//            }
//
//        } catch (Exception e) {
//            System.out.println("String Error: " + e);
//        }
//
//        System.out.println("=== Program Finished ===");
//    }
//}
//Voter code.
//import java.util.*;
//
//public class Java17 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        try {
//            System.out.print("Enter your age: ");
//            int age = sc.nextInt();
//
//            if (age >= 18)
//                System.out.println("Eligible to vote.");
//            else
//                System.out.println("Not eligible to vote.");
//
//        } catch (Exception e) {
//            System.out.println("Please enter a valid age!");
//        }
//    }
//}
//cal sum of 3 number in pairs.
//import java.util.Scanner;
//
//public class Java17 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter size of array: ");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//
//        System.out.println("Enter " + n + " elements:"); // fixed this line
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        boolean flag = false;
//        System.out.println("Triplets with sum = 3:");
//        for (int i = 0; i < n - 2; i++) {
//            for (int j = i + 1; j < n - 1; j++) {
//                for (int k = j + 1; k < n; k++) {
//                    if (arr[i] + arr[j] + arr[k] == 3) {
//                        System.out.println("(" + arr[i] + ", " + arr[j] + ", " + arr[k] + ")");
//                        flag = true;
//                    }
//                }
//            }
//        }
//        if (!flag) {
//            System.out.println("No triplets found with sum = 3");
//        }
//    }
//}
// thrown exception
//public class Java17 {
//    public static void main(String[] args) {
//
//        try {
//            throw new Exception("Manually thrown exception!");
//        } catch (Exception e) {
//            System.out.println("Caught: " + e);
//        }
//
//        System.out.println("Program continues...");
//    }
//}
//2. Throw Exception Based on Condition
//public class Java17 {
//    public static void main(String[] args) {
//
//        int age = 15;
//
//        try {
//            if (age < 18) {
//                throw new ArithmeticException("Not eligible for vote");
//            }
//            System.out.println("Eligible for vote!");
//        } catch (ArithmeticException e) {
//            System.out.println(e.getMessage());
//        }
//    }
//}
//3. Throw Inside User-Defined Method
public class Java17 {

    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Age is less than 18");
        } else {
            System.out.println("Valid age");
        }
    }

    public static void main(String[] args) {

        try {
            checkAge(12);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Done");
    }
}


