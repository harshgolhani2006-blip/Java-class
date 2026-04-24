// wap to fiboneric series with recursion.
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

// public class fibo{
//     public static int Fibo(int n) {
//         if(n == 0 || n == 1) {
//             return n;
//         }
//         return Fibo(n - 1) + Fibo(n - 2);
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number of terms: ");
//         int n = sc.nextInt();
//         System.out.println("Fibonacci series:");
//         for(int i = 0; i < n; i++) {
//             System.out.print(Fibo(i) + " ");
//         }
//         sc.close();
//     }
// }
 
// public class fibo{
//     public static int Fibo(int n,int[] dp){
//         if(n<=1){
//             return n;
//         }if(dp[n] != -1){
//             return dp[n];
//         }
//         dp[n] = Fibo(n-1,dp) + Fibo(n-2,dp);
//         return dp[n];
//     }
//     public static void main(String[] arg){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number of terms: ");
//         int n = sc.nextInt();
//         int[] dp = new int[n+1];
//         Arrays.fill(dp, -1);
//         System.out.println(Fibo(n, dp));
//         sc.close();
//     }
// }

// wap to calcuate how many ways to climb n stairs if you can climb either 1 or 2 stairs at a time.
// public class climbStairs{
//     public static int ClimbStairs (int n,int[] dp){
//         if(n<=1){
//             return 1;
//         }if(dp[n] != -1){
//             return dp[n];
//         }
//         dp[n] = ClimbStairs(n-1,dp) + ClimbStairs(n-2,dp);
//         return dp[n];
//     }
//     public static void main(String[] arg){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number of stairs: ");
//         int n = sc.nextInt();
//         int[] dp = new int[n+1];
//         Arrays.fill(dp, -1);
//         System.out.println(ClimbStairs(n, dp));
//         sc.close();
//     }
// }

// wap to calculate the count of digits in a number using recursion with Optimization.
// public class CountDigits{
//     public static int countDigits(int n){
//         if(n == 0){
//             return 0;
//         }
//         return 1 + countDigits(n / 10);
//     }
//     public static void main(String[] arg){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n = sc.nextInt();
//         System.out.println("Count of digits: " + countDigits(n));
//         sc.close();
//     }
// }

// wap to calculate the sum of digits in a number using recursion with Optimization.
// public class sumOfDigits{
//     public static int sumOfDigit(int n){
//         if(n == 0){
//             return 0;
//         }
//         return (n % 10) + sumOfDigit(n / 10);
//     }
//     public static void main(String[] arg){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n = sc.nextInt();
//         System.out.println("Sum of digits: " + sumOfDigit(n));
//         sc.close();
//     }
// }

//wap to reverse a string using recursion with Optimization.

// public class ReverseString {

//     public static String reverseString(String str) {

//         StringBuilder sb = new StringBuilder(str);
//         return sb.reverse().toString();
//     }

//     public static void main(String[] arg) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a string: ");
//         String str = sc.nextLine();

//         System.out.println("Reversed string: " + reverseString(str));

//         sc.close();
//     }
// }

//wap to string palindrome using recursion with Optimization.
//public class PalindromeString {
//
//    public static boolean isPalindrome(String str) {
//        StringBuilder sb = new StringBuilder(str);
//        return sb.reverse().toString().equals(str);
//    }
//
//    public static void main(String[] arg) {
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter a string: ");
//        String str = sc.nextLine();
//
//        if (isPalindrome(str)) {
//            System.out.println("The string is a palindrome.");
//        } else {
//            System.out.println("The string is not a palindrome.");
//        }
//
//        sc.close();
//    }
//}

import java.util.Scanner;

public class PalindromeString {

    static int[][] dp = new int[100][100];

    // Recursive function to initialize dp with -1
    static void initialize(int i, int j) {

        if (i == 100) {
            return;
        }

        if (j == 100) {
            initialize(i + 1, 0);
            return;
        }

        dp[i][j] = -1;

        initialize(i, j + 1);
    }

    static boolean ways(String str, int start, int end) {

        // Base case
        if (start >= end) {
            return true;
        }

        // Already calculated
        if (dp[start][end] != -1) {
            return dp[start][end] == 1;
        }

        // Check characters
        if (str.charAt(start) == str.charAt(end)) {

            boolean ans = ways(str, start + 1, end - 1);

            dp[start][end] = ans ? 1 : 0;

            return ans;
        }

        dp[start][end] = 0;

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");

        String str = sc.nextLine();

        // Initialize dp without loops
        initialize(0, 0);

        boolean result = ways(str, 0, str.length() - 1);

        if (result) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        sc.close();
    }
}