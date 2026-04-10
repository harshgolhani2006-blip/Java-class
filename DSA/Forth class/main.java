 import java.util.Scanner;
// check the last and first character of the string are same or not
// public class main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the string");
//         String str = sc.nextLine();
//         char first = str.charAt(0);
//         char last = str.charAt(str.length() - 1);
//         if (first == last) {
//             System.out.println("The first and last character are same");
//         } else {
//             System.out.println("The first and last character are not same");
//         }
//     }
// }

// public class recursion {
//     public static void main(String[] args) {
//         String str1="abc";
//         int count = 0;
//         for(int i=0;i<str1.length();i++){
//            for(int j=i;j<str1.length();j++){
//                if(str1.charAt(i)==str1.charAt(j)){
//                    count++;
//                }
//            }
//         }
//         System.out.println("Count: " + count);
//     }
    
// }

// make a string and remove the first letter.
// public class main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the string");
//         String str = sc.nextLine();
//         String newStr = str.substring(1);
//         System.out.println("String after removing first character: " + newStr);
//     }
// }

// wap to print mixture string and number then print the maximum number from the string
// public class main {
//     public static void main(String[] args) {
//         String str = "abc1hdef4g5g6ghi7g8h9";
//         int max = Integer.MIN_VALUE;
//         String numStr = "";
//         for (int i = 0; i < str.length(); i++) {
//             char ch = str.charAt(i);
//             if (Character.isDigit(ch)) {
//                 numStr += ch;
//             } else {
//                 if (!numStr.isEmpty()) {
//                     int num = Integer.parseInt(numStr);
//                     if (num > max) {
//                         max = num;
//                     }
//                     numStr = "";
//                 }
//             }
//         }
//         // Check for the last number in the string
//         if (!numStr.isEmpty()) {
//             int num = Integer.parseInt(numStr);
//             if (num > max) {
//                 max = num;
//             }
//         }
//         System.out.println("The maximum number in the string is: " + max);
//     }
// }

//wap to crepeated string print single charcter 
// public class main {
//     public static void main(String[] args) {
//         String str = "aabbccdd";
//         String result = "";
//         for (int i = 0; i < str.length(); i++) {
//             char ch = str.charAt(i);
//             if (!result.contains(String.valueOf(ch))) {
//                 result += ch;
//             }
//         }
//         System.out.println("String after removing duplicates: " + result);
//     }
// }

// wap to convert the input user string into number and print the multiplication of the number
// public class main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the string");
//         String str = sc.nextLine();
//         int num = 0;
//         for (int i = 0; i < str.length(); i++) {
//             char ch = str.charAt(i);
//             if (Character.isDigit(ch)) {
//                 num = num * 10 + (ch - '0');
//             }
//         }
//         int result = num * num; // Multiplication of the number with itself
//         System.out.println("The multiplication of the number is: " + result);
//     }
// }


// wap to check the string is contain any number then print false otherwise true
// public class main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the string");
//         String str = sc.nextLine();
//         boolean containsNumber = false;
//         for (int i = 0; i < str.length(); i++) {
//             char ch = str.charAt(i);
//             if (Character.isDigit(ch)) {
//                 containsNumber = true;
//                 break;
//             }
//         }
//         if (containsNumber) {
//             System.out.println("False");
//         } else {
//             System.out.println("True");
//         }
//     }
// }

// wap to print the input to user number inreverse using recursion 
// public class main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number");
//         int num = sc.nextInt();
//         printNumber(num);
//     }

//     public static void printNumber(int num) {
//         if (num == 0) {
//             return;
//         }
//         System.out.println(num);
//         printNumber(num - 1);
//     }
// }

// wap to print the input to user number using recursion
// public class main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number");
//         int num = sc.nextInt();
//         printNumber(num);
//     }

//     public static void printNumber(int num) {
//         if (num == 0) {
//             return;
//         }
//         printNumber(num - 1);
//         System.out.println(num);
//     }
// }

// wap to print the input to user number in factorial using recursion
// public class main {
//       public static int factorial(int num) {
//         if (num == 0 || num == 1) {
//             return 1;
//         }
//         return num * factorial(num - 1);
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number");
//         int num = sc.nextInt();
//         int result = factorial(num);
//         System.out.println("The factorial of " + num + " is: " + result);
//     }

  
// }

// wap to print the input to user string in reverse using recursion
// public class main {
//      public static String reverseString(String str) {
//         if (str.isEmpty()) {
//             return str;
//         }
//         return reverseString(str.substring(1)) + str.charAt(0);
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the string");
//         String str = sc.nextLine();
//         String reversedStr = reverseString(str);
//         System.out.println("The reversed string is: " + reversedStr);
//     }
// }

// wap to check the input to user string is palindrome or not using recursion.
 public class main {
     public static boolean isPalindrome(String str) {
         if (str.length() <= 1) {
             return true;
         }
         if (str.charAt(0) != str.charAt(str.length() - 1)) {
             return false;
         }
         return isPalindrome(str.substring(1, str.length() - 1));
     }
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the string");
         String str = sc.nextLine();
         boolean result = isPalindrome(str);
         if (result) {
             System.out.println("The string is a palindrome.");
         } else {
             System.out.println("The string is not a palindrome.");
         }
     }
 }