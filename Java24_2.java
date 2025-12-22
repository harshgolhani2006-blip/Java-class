import java.util.Scanner;

//Search in Rotated  Sorted Array.
class SolutionC {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            // Prevent potential integer overflow
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            // Check if the left half is sorted
            if (nums[left] <= nums[mid]) {
                // Check if the target is within the sorted left half
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1; // Target is in the left half
                } else {
                    left = mid + 1; // Target is in the right half
                }
            }
            // Otherwise, the right half must be sorted
            else {
                // Check if the target is within the sorted right half
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1; // Target is in the right half
                } else {
                    right = mid - 1; // Target is in the left half
                }
            }
        }

        // Target not found
        return -1;
    }
}
public class Java24_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of array:");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("Enter the element to be searched:");
        int target = scan.nextInt();
        SolutionC sol = new SolutionC();
        int ans = sol.search(arr, target);
        System.out.println("Searching element index number:"+ans);
    }
}