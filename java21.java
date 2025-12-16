import java.util.HashMap;
import java.util.Scanner;
//
//public class java21 {
//
//    // Method to find majority element
//    static int majorityElement(int[] nums) {
//        HashMap<Integer, Integer> map = new HashMap<>();
//
//        for (int i : nums) {
//            map.put(i, map.getOrDefault(i, 0) + 1);
//
//            if (map.get(i) > nums.length / 2) {
//                return i;
//            }
//        }
//        return -1;
//    }
//
//    // main method
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter the number of elements in the array: ");
//        int n = sc.nextInt();
//
//        int[] arr = new int[n];
//
//        System.out.println("Enter the elements in the array:");
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        int result = majorityElement(arr);
//        System.out.println("Majority Element: " + result);
//    }
//}
import java.util.HashMap;

import java.util.Scanner;

class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int ans = 0;

        for (int i : nums) {
            if (count == 0) {
                ans = i;
            }
            if (i == ans) {
                count++;
            } else {
                count--;
            }
        }
        return ans;
    }
}

public class java21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Solution obj = new Solution();
        int result = obj.majorityElement(arr);

        System.out.println("Majority Element is: " + result);
    }
}

