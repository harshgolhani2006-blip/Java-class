//Palindrome.
//public class JavaBasic2 {
//    public static void main(String[] args) {
//        String str = "madam";
//        int count = 0;
//
//        for (int i = 0; i < str.length() / 2; i++) {
//            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
//                count++;
//                break;
//            }
//        }
//
//        if (count == 0) {
//            System.out.println("Palindrome");
//        } else {
//            System.out.println("Not Palindrome");
//        }
//    }
//}
//✅ 1️⃣ Print each character of a string
//public class JavaBasic2 {
//    public static void main(String[] args) {
//        String str = "hello";
//
//        for (int i = 0; i < str.length(); i++) {
//            System.out.println(str.charAt(i));
//        }
//    }
//}
// Print all characters + print last character
//public class JavaBasic2 {
//    public static void main(String[] args) {
//
//        String str = "hello";
//
//        // Print all characters one by one
//        for (int i = 0; i < str.length(); i++) {
//            System.out.println(str.charAt(i));
//        }
//
//        // Print last character
//        System.out.println("Last character: " + str.charAt(str.length() - 1));
//    }
//}
//3️⃣ String concat example (with and without storing)
//public class JavaBasic2 {
//    public static void main(String[] args) {
//        String str = "hello";
//
//        // Without storing — does NOT change original
//        str.concat("hii");
//        System.out.println(str); // Output: hello
//
//        // Storing — changes original
//        str = str.concat("hii");
//        System.out.println(str); // Output: hellohii
//    }
//}
//4️⃣ Print array + array length
//public class JavaBasic2 {
//    public static void main(String[] args) {
//        int arr[] = {1, 2, 4567, 45};
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//
//        System.out.println("Length: " + arr.length);
//    }
//✅ 1️⃣ Scanner Input Example (int, float, string)
//import java.util.*;
//
//public class JavaBasic2 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter int value:");
//        int a = sc.nextInt();
//        System.out.println("You entered: " + a);
//
//        System.out.println("Enter float value:");
//        float b = sc.nextFloat();
//        System.out.println("You entered: " + b);
//
//        sc.nextLine(); // Clear buffer
//
//        System.out.println("Enter full string:");
//        String str = sc.nextLine();
//        System.out.println("You entered: " + str);
//    }
//}
//✅ 2️⃣ Scanner Input All Types (int, double, word, full line)
//import java.util.*;
//
//public class JavaBasic2 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter integer: ");
//        int a = sc.nextInt();
//
//        System.out.print("Enter double: ");
//        double b = sc.nextDouble();
//
//        System.out.print("Enter single word: ");
//        String c = sc.next();  // single word
//
//        sc.nextLine(); // buffer clear
//
//        System.out.print("Enter full line: ");
//        String d = sc.nextLine();  // full sentence
//
//        System.out.println("Integer: " + a);
//        System.out.println("Double: " + b);
//        System.out.println("Word: " + c);
//        System.out.println("Line: " + d);
//    }
//}

//✅ 3️⃣ Reverse a String using char array
//public class JavaBasic2 {
//    public static void main(String[] args) {
//        String str = "hello";
//
//        char[] ch = str.toCharArray();
//
//        for (int i = ch.length - 1; i >= 0; i--) {
//            System.out.println(ch[i]);
//        }
//    }
//}

//✅ 4️⃣ String Comparison + charAt + printing
//public class JavaBasic2 {
//    public static void main(String[] args) {
//
//        String s1 = "hello";
//        String s2 = "hello";
//
//        System.out.println(s1 == s2);  // true (same pool object)
//
//        String s3 = new String("hello");
//        String s4 = new String("hello");
//
//        System.out.println(s3 == s4); // false (different objects)
//
//        System.out.println(s1.charAt(0)); // h
//
//        // Print forward
//        for (int i = 0; i < s1.length(); i++) {
//            System.out.println(s1.charAt(i));
//        }
//
//        // Print reverse
//        for (int i = s1.length() - 1; i >= 0; i--) {
//            System.out.println(s1.charAt(i));
//        }
//    }
//}

//✅ 5️⃣ Array examples + type casting
public class JavaBasic2 {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5};

        for (int x : arr) {
            System.out.println(x);
        }

        System.out.println("First element: " + arr[0]);

        // Widening conversion (auto)
        byte a = 5;
        short b = a;
        int c = b;

        // Narrowing conversion (casting)
        short s = 130;
        byte t = (byte) s;
        System.out.println( "byte="+t); // Output will overflow
    }
}