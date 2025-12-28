import java.util.Scanner;

public class Java24_4 {

    // Function to find longest palindromic substring
    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 2)
            return s;

        int start = 0;
        int maxLen = 1;

        for (int i = 0; i < s.length(); i++) {
            // Odd length palindrome
            int len1 = expandFromCenter(s, i, i);

            // Even length palindrome
            int len2 = expandFromCenter(s, i, i + 1);

            int len = Math.max(len1, len2);

            if (len > maxLen) {
                start = i - (len - 1) / 2;
                maxLen = len;
            }
        }
        return s.substring(start, start + maxLen);
    }

    // Helper function
    private static int expandFromCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length()
                && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        String result = longestPalindrome(s);
        System.out.println("Longest Palindromic Substring: " + result);
    }
}
