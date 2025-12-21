//Longest Substring Without Repeating Characters
import java.util.Arrays;
import java.util.Scanner;
class solution2{
    public int lengthOfLongestSubstring(String s) {
        int[] index = new int[128];
        int left=0;
        int maxLength=0;

        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);

            //Move left pointer if character repeated
            left=Math.max(left,index[ch]);

            maxLength=Math.max(maxLength,right-left+1);

            //store next index.
            index[ch]=right+1;
        }

        return maxLength;
    }
}
public class Java23_3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string:");
        String str=sc.next();
        solution2 obj = new solution2();
     int result= obj.lengthOfLongestSubstring(str);
     System.out.println(result+"Length of string:");
    }
        }