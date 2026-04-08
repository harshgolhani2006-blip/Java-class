import java.util.*;
// public class Main {

//     public static void main(String[] args) {
//         String str = "Hello, World!";
//         System.out.println(str);
//         System.out.println(str.length());
//         System.out.println(str.charAt(0));
//         System.out.println(str.charAt(7));
//         System.out.println(str.indexOf('o'));
//         System.out.println(str.indexOf('o', 5));
//     }
// }
//wap to reverse a string .
// public class Stringreverse {

//         public static void main(String[] args) {
//             String str = "Hello, World!";
//             String reversedStr = reverseString(str);
//             System.out.println("Original String: " + str);
//             System.out.println("Reversed String: " + reversedStr);
//         }

//         public static String reverseString(String str) {
//             StringBuilder reversed = new StringBuilder();
//             for (int i = str.length() - 1; i >= 0; i--) {
//                 reversed.append(str.charAt(i));
//             }
//             return reversed.toString();
//         }
// }
//wap to check whether the string is palindrome or not.
// public class palindrome {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a string: ");
//         String str = sc.nextLine();

//         String rev = "";

//         // reverse string using loop
//         for (int i = str.length() - 1; i >= 0; i--) {
//             rev = rev + str.charAt(i);
//         }

//         // check palindrome
//         if (str.equals(rev)) {
//             System.out.println("Palindrome");
//         } else {
//             System.out.println("Not Palindrome");
//         }

//         sc.close();
//     }
// }
// wap to check whether the two strings are anagrams or not.
// public class Anagram {

//     public static boolean areAnagrams(String str1, String str2) {
//         // remove spaces + lowercase
//         str1 = str1.replaceAll("\\s", "").toLowerCase();
//         str2 = str2.replaceAll("\\s", "").toLowerCase();

//         // check length
//         if (str1.length() != str2.length()) {
//             return false;
//         }

//         // convert to char array
//         char[] arr1 = str1.toCharArray();
//         char[] arr2 = str2.toCharArray();

//         // sort
//         Arrays.sort(arr1);
//         Arrays.sort(arr2);

//         // compare
//         return Arrays.equals(arr1, arr2);
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter first string: ");
//         String str1 = sc.nextLine();

//         System.out.print("Enter second string: ");
//         String str2 = sc.nextLine();

//         if (areAnagrams(str1, str2)) {
//             System.out.println("Anagram");
//         } else {
//             System.out.println("Not Anagram");
//         }

//         sc.close();
//     }
// }

public class CountChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        // convert to lowercase (optional)
        str = str.toLowerCase();

        // count using array
        int count[] = new int[26];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                count[ch - 'a']++;
            }
        }

        // print result
        for (int i = 0; i < 26; i++) {
            if (count[i] > 0) {
                char ch = (char)(i + 'a');
                System.out.print(ch + "" + count[i] + " ");
            }
        }

        sc.close();
    }
}