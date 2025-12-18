// Jump Game.
//import java.util.Scanner;
//
//class Solution2 {
//    public boolean canJump(int[] nums) {
//        int aim = nums.length - 1;
//
//        for (int i = nums.length - 1; i >= 0; i--) {
//            if (i + nums[i] >= aim) {
//                aim = i;
//            }
//        }
//        return aim == 0;
//    }
//}
//
//public class Java23 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        // input size
//        System.out.print("Enter the number of elements in the array :");
//        int n = sc.nextInt();
//
//        // input array
//        System.out.print("Enter the elements in the array:");
//        int[] nums = new int[n];
//        for (int i = 0; i < n; i++) {
//            nums[i] = sc.nextInt();
//        }
//
//        Solution2 sol = new Solution2();
//        boolean result = sol.canJump(nums);
//
//        System.out.println(result);
//    }
//}
import java.util.*;
class Solution2{
    public boolean canJump(int[] nums){
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(i>max){
                return false;
            }
            max=Math.max(max,i+nums[i]);
        }
        return true;
    }
}
public class Java23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input size
        System.out.print("Enter the number of elements in the array :");
        int n = sc.nextInt();

        // input array
        System.out.print("Enter the elements in the array:");
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Solution2 sol = new Solution2();
        boolean result = sol.canJump(nums);

        System.out.println(result);
    }
}