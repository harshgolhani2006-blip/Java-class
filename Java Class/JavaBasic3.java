//✅ Print the length of a String
//class JavaBasic3 {
//    public static void main(String[] args) {
//        String str = "abc";
//
//        System.out.println("Length = " + str.length());
//    }
//}

//Palindrome Program
//class JavaBasic3{
//    public static void main(String[] args) {
//        String str = "abcba";
//        boolean isPalindrome = true;
//
//        // Check characters from both ends
//        for (int i = 0; i < str.length() / 2; i++) {
//            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
//                isPalindrome = false;
//                break;
//            }
//        }
//
//        // Output
//        if (isPalindrome) {
//            System.out.println(str + " is a palindrome");
//        } else {
//            System.out.println(str + " is not a palindrome");
//        }
//    }
//}
//Reverse-Based Palindrome Program
//class JavaBasic3{
//    public static void main(String[] args) {
//        String str = "Hello";
//        String rev = "olleH";
//
//        // reverse the string
//        for (int i = str.length() - 1; i >= 0; i--) {
//            rev += str.charAt(i);
//        }
//
//        // compare original and reversed string
//        System.out.println(str.equals(rev) ? "Palindrome" : "Not Palindrome");
//    }
//}
//String All Function
//class StringMethodsDemo {
//    public static void main(String[] args) {
//
//        String str = "  Java Programming  ";
//
//        // 1️⃣ length()
//        System.out.println("1. Length: " + str.length());
//
//        // 2️⃣ trim()
//        String trimmed = str.trim();
//        System.out.println("2. After trim: '" + trimmed + "'");
//
//        // 3️⃣ toLowerCase() and toUpperCase()
//        System.out.println("3. Lowercase: " + trimmed.toLowerCase());
//        System.out.println("   Uppercase: " + trimmed.toUpperCase());
//
//        // 4️⃣ charAt()
//        System.out.println("4. Character at index 2: " + trimmed.charAt(2));
//
//        // 5️⃣ substring()
//        System.out.println("5. Substring (0,4): " + trimmed.substring(0, 4));
//
//        // 5️⃣.1 matches() examples (digit check)
//        String str1 = "12345";
//        System.out.println("   Only digits ('12345'): " + str1.matches("[0-9]+"));
//
//        String str2 = "12a45";
//        System.out.println("   Only digits ('12a45'): " + str2.matches("[0-9]+"));
//
//        String str3 = "";
//        System.out.println("   Only digits (empty string): " + str3.matches("[0-9]+"));
//
//        // 6️⃣ equals() and equalsIgnoreCase()
//        String s1 = "Java";
//        String s2 = "java";
//        System.out.println("6. equals(): " + s1.equals(s2));
//        System.out.println("   equalsIgnoreCase(): " + s1.equalsIgnoreCase(s2));
//
//        // 7️⃣ contains()
//        System.out.println("7. Contains 'Pro': " + trimmed.contains("Pro"));
//
//        // 8️⃣ indexOf()
//        System.out.println("8. Index of 'a': " + trimmed.indexOf('a'));
//
//        // 9️⃣ replace()
//        System.out.println("9. Replace 'Java' with 'Python': " + trimmed.replace("Java", "Python"));
//
//        // 🔟 split()
//        String[] words = trimmed.split(" ");
//        System.out.println("10. Split words:");
//        for (String word : words) {
//            if (!word.isEmpty())
//                System.out.println("   " + word);
//        }
//
//        // 💡 Bonus: Reverse String using StringBuilder
//        String reversed = new StringBuilder(trimmed).reverse().toString();
//        System.out.println("\nBonus → Reversed String: " + reversed);
//    }
//}
//comparing two string.
// class JavaBasic3 {
//
//    public static void main(String[] args) {
//        String str = "Java";
//        String str1 = "Java";
//
//        System.out.println(str.equals(str1));
//        System.out.println(str == str1);
//
//        System.out.println("hello");
//    }
//}

//class JavaBasic3 {
//    public static void main(String[] args) {
//        String s1 = "Java";
//        String s2 = "Ja" + "va";  // compiler optimization (compile-time)
//        String s3 = "Ja";
//        String s4 = s3 + "va";    // runtime concatenation
//
//        System.out.println(s1 == s2);
//        System.out.println(s1 == s4);
//        System.out.println(s1.equals(s4));
//    }
//}
//Print word line to next line
// class JavaBasic3 {
//     public static void main(String[] args) {
//         String str = "Java is fun";
//         String[] parts = str.split(" ");
//
//         for (String word : parts) {
//             System.out.println(word);
//         }
//     }
// }
//function .
class JavaBasic3 {
    public static void main(String[] args) {

        // 1️⃣ Split Example
        String str = "hello java cpp";
        String arr[] = str.split(" ");

        for (String s : arr) {
            System.out.println(s);
        }

        System.out.println("----------------");

        // 2️⃣ Palindrome Example
        String a = "abc";
        String rev = "";

        for (int i = a.length() - 1; i >= 0; i--) {
            rev += a.charAt(i);
        }

        if (a.equals(rev)) {
            System.out.println("ji haii (Palindrome)");
        } else {
            System.out.println("nhi hai (Not Palindrome)");
        }

        System.out.println("----------------");

        // 3️⃣ == vs equals()
        String s1 = new String("hello");
        String s2 = new String("hello");

        System.out.println(s1 == s2);        // false (different objects)
        System.out.println(s1.equals(s2));   // true (same content)

        System.out.println("----------------");

        // 4️⃣ trim() + equals()
        String s3 = "hello java";
        String s4 = "   hello java   ";

        System.out.println(s3 == s4);             // false
        System.out.println(s3.equals(s4));        // false
        System.out.println(s3.equals(s4.trim())); // true

        System.out.println("----------------");

        // 5️⃣ String Methods
        System.out.println(s3.length());        // length()
        System.out.println(s3.charAt(1));       // charAt()
        System.out.println(s3.toUpperCase());   // toUpperCase()
        System.out.println(s3.indexOf("z"));    // indexOf()
        System.out.println(s3.substring(2));    // substring()
        System.out.println(s3.substring(1, 3)); // substring(start, end)
        System.out.println(s3.trim());          // trim()

        // 6️⃣ split() (correct way to print array)
        String words[] = s3.split(" ");
        for (String w : words) {
            System.out.println(w);
        }

        System.out.println("----------------");

        // 7️⃣ Check vowel or not
        char c = 'i';
        System.out.println("Is vowel: " + "aeiouAEIOU".contains(c + ""));
    }
}
