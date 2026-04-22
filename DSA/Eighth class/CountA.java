 // 👉 Print all subarrays of an array and their sums using recursion
 import java.util.Scanner;
// public class Array {

//     static int totalSum = 0;

//     // function to print subarrays using recursion
//     public static void printSubarrays(int arr[], int start, int end) {
//         if (start == arr.length) {
//             return;
//         }

//         if (end == arr.length) {
//             printSubarrays(arr, start + 1, start + 1);
//             return;
//         }

//         // print current subarray
//         System.out.print("Subarray: ");
//         for (int i = start; i <= end; i++) {
//             System.out.print(arr[i] + " ");
//         }

//         // sum using recursion
//         int sum = sumOfSubarray(arr, start, end);
//         totalSum += sum;  

//         System.out.print(" -> Sum: " + sum);
//         System.out.println();

//         // move end forward
//         printSubarrays(arr, start, end + 1);
//     }

//     // recursive function to calculate sum
//     public static int sumOfSubarray(int arr[], int i, int j) {
//         if (i > j) {
//             return 0;
//         }
//         return arr[i] + sumOfSubarray(arr, i + 1, j);
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the size of array: ");
//         int n = sc.nextInt();

//         int arr[] = new int[n];

//         System.out.println("Enter the elements:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         System.out.println("Subarrays with sum:");
//         printSubarrays(arr, 0, 0);

//         // 👉 print total sum
//         System.out.println("\nTotal Sum of All Subarrays = " + totalSum);
//     }
// }

// wap to binary digit of a number using recursion
// public class BinaryDigit{
//     public static void printBinary(int n) {
//         if (n == 0) {
//             return;
//         }
//         printBinary(n / 2);
//         System.out.print(n % 2);
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n = sc.nextInt();
//         System.out.print("Binary representation: ");
//         printBinary(n);
//     }
// }

// wap to binary digit and print in bits of a number using recursion.
// public class BinaryDigit {

//     public static void printBinary(String str, int n) {
//         if (n == 0) {
//             System.out.println(str);
//             return;
//         }
//        printBinary(str +"0",n-1);
//        printBinary(str +"1",n-1);
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n = sc.nextInt();
//         printBinary("", n);
//     }
// }

// wap to subsequences of a key using recursion.
// public class Subsequences {
//     public static void printSubsequences(String str,int k, String result, int index) {
//         if (index == str.length()) {
//             if (result.length() == k) {
//                 System.out.println(result);
//             }
//             return;
//         }

//         // include the current character
//         printSubsequences(str, k, result + str.charAt(index), index + 1);

//         // exclude the current character
//         printSubsequences(str, k, result, index + 1);
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a string: ");
//         String str = sc.nextLine();
//         System.out.print("Enter the length of subsequences: ");
//         int k = sc.nextInt();
//         System.out.println("Subsequences of length " + k + ":");
//         printSubsequences(str, k, "", 0);
//     }
// }

// wap to create a array and check target max using recursion
// public class checkTarget {
//     public static boolean checkTarget(int arr[], int target, int index) {
//         if (index == arr.length) {
//             return target == 0;
//         }

//         // include the current element
//         if (checkTarget(arr, target - arr[index], index + 1)) {
//             return true;
//         }

//         // exclude the current element
//         return checkTarget(arr, target, index + 1);
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the size of array: ");
//         int n = sc.nextInt();

//         int arr[] = new int[n];
//         System.out.println("Enter the elements:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         System.out.print("Enter the target sum: ");
//         int target = sc.nextInt();

//         boolean result = checkTarget(arr, target, 0);
//         if (result) {
//             System.out.println("There exists a subsequence with the target sum.");
//         } else {
//             System.out.println("No subsequence with the target sum exists.");
//         }
//     }
// }

// wap to check if a substring is palindrome or not using recursion.
// import java.util.Scanner;

// public class checkpalindrome {
//     public static void printSubsequences(String str, String result, int index) {
//         if (index == str.length()) {
//             if (!result.isEmpty()) {
//                 System.out.println(result + " -> " + isPalindrome(result));
//             }
//             return;
//         }

//         // include the current character
//         printSubsequences(str, result + str.charAt(index), index + 1);

//         // exclude the current character
//         printSubsequences(str, result, index + 1);
//     }

//     public static boolean isPalindrome(String s) {
//         int left = 0;
//         int right = s.length() - 1;
//         while (left < right) {
//             if (s.charAt(left) != s.charAt(right)) {
//                 return false;
//             }
//             left++;
//             right--;
//         }
//         return true;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a string: ");
//         String str = sc.nextLine();

//         System.out.println("Subsequences with palindrome check:");
//         printSubsequences(str, "", 0);
//     }
// }

//wap to check the string is divide into two equal parts or not using recursion.
// public class checkStringisDivisible {
    
//     public static boolean isDivisible(String str) {
//         int n = str.length();
        
//         if (n % 2 != 0) {
//             return false; // odd length → not possible
//         }
        
//         String firstHalf = str.substring(0, n / 2);
//         String secondHalf = str.substring(n / 2);
        
//         return firstHalf.equals(secondHalf); // compare both halves
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         System.out.print("Enter a string: ");
//         String str = sc.nextLine();

//         if (isDivisible(str)) {
//             System.out.println("True");
//         } else {
//             System.out.println("False");
//         }
        
//         sc.close(); // good practice
//     }
// }

//based only on length


// public class checkStringisDivisible {
    
//     public static boolean isDivisible(String str) {
//         int n = str.length();
        
//         if (n % 2 != 0) {
//             return false; // odd length → not possible
//         }
        
//         String firstHalf = str.substring(0, n / 2);
//         String secondHalf = str.substring(n / 2);
        
//         return firstHalf.equals(secondHalf); // compare both halves
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         System.out.print("Enter a string: ");
//         String str = sc.nextLine();

//         if (isDivisible(str)) {
//             System.out.println("True");
//         } else {
//             System.out.println("False");
//         }
        
//         sc.close(); // good practice
//     }
// }

// wap to create array and print the subarrays  of the array  and check even odd also using recursion.
// public class checkArrayEO{
//     public static void printSubarrays(int arr[], int start, int end) {
//         if (start == arr.length) {
//             return;
//         }

//         if (end == arr.length) {
//             printSubarrays(arr, start + 1, start + 1);
//             return;
//         }

//         // print current subarray
//         System.out.print("Subarray: ");
//         for (int i = start; i <= end; i++) {
//             System.out.print(arr[i] + " ");
//         }

//         // check even or odd
//         if (arr[end] % 2 == 0) {
//             System.out.print("-> Even");
//         } else {
//             System.out.print("-> Odd");
//         }
//         System.out.println();

//         // move end forward
//         printSubarrays(arr, start, end + 1);
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the size of array: ");
//         int n = sc.nextInt();

//         int arr[] = new int[n];

//         System.out.println("Enter the elements:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         System.out.println("Subarrays with even/odd check:");
//         printSubarrays(arr, 0, 0);
//     }
// }
// wap to create array and print the subarrays  of the array  and check even odd also using recursion.
// public class OddEven{
//     public static void oddEven(int arr[],int i,int sum,String curr){
//         if(i==arr.length){
//             if(sum%2==0){
//                 System.out.println(curr+" -> "+sum+" (Even)");
//             } else {
//                 System.out.println(curr+" -> "+sum+" (Odd)");
//             }
//             return;
//         }
//         // include the current element
//         oddEven(arr, i+1, sum+arr[i], curr+arr[i]);
//         // exclude the current element
//         oddEven(arr, i+1, sum, curr);
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the size of array: ");
//         int n = sc.nextInt();

//         int arr[] = new int[n];
//         System.out.println("Enter the elements:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         System.out.println("Subarrays with their sums:");
//         oddEven(arr, 0, 0, "");
//     }
// }

//wap to create string and claculate the count of "a" in the string using recursion.
// public class CountA {
//     public static int countA(String str, int index) {
//         if (index == str.length()) {
//             return 0;
//         }
//         int count = (str.charAt(index) == 'a') ? 1 : 0;
//         return count + countA(str, index + 1);
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a string: ");
//         String str = sc.nextLine();
//         int result = countA(str, 0);
//         System.out.println("Count of 'a' in the string: " + result);
//     }
// } 

// wap to create string and claculate the count of "a" in the string using recursion.
public class CountA {
    public static int countA(String s, int i,boolean b){
        if(i==s.length()){
            return b?1:0;
        }
        int x = countA(s, i+1 ,b|| s.charAt(i)=='a');
        int y = countA(s, i+1, b);
        return x+y;
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String str = sc.nextLine();
    int result = countA(str, 0, false);
    System.out.println("Count of 'a' in the string: " + result);
    }
}