import java.util.Scanner;
import java.util.Arrays;

class SolutionD{

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int m = nums1.length;
        int n = nums2.length;

        int low = 0, high = m;

        while (low <= high) {

            int i = (low + high) / 2;
            int j = (m + n + 1) / 2 - i;

            int left1  = (i == 0) ? Integer.MIN_VALUE : nums1[i - 1];
            int right1 = (i == m) ? Integer.MAX_VALUE : nums1[i];

            int left2  = (j == 0) ? Integer.MIN_VALUE : nums2[j - 1];
            int right2 = (j == n) ? Integer.MAX_VALUE : nums2[j];

            if (left1 <= right2 && left2 <= right1) {

                if ((m + n) % 2 == 1) {
                    return Math.max(left1, left2);
                }

                return (Math.max(left1, left2)
                        + Math.min(right1, right2)) / 2.0;
            }
            else if (left1 > right2) {
                high = i - 1;
            }
            else {
                low = i + 1;
            }
        }
        return 0.0;
    }
}

public class Java24_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 🔹 Input first array
        System.out.print("Enter size of nums1: ");
        int m = sc.nextInt();
        int[] nums1 = new int[m];

        System.out.println("Enter elements of nums1:");
        for (int i = 0; i < m; i++) {
            nums1[i] = sc.nextInt();
        }

        // 🔹 Input second array
        System.out.print("Enter size of nums2: ");
        int n = sc.nextInt();
        int[] nums2 = new int[n];

        System.out.println("Enter elements of nums2:");
        for (int i = 0; i < n; i++) {
            nums2[i] = sc.nextInt();
        }

        // 🔹 Print array size and elements
        System.out.println("\nSize of nums1: " + nums1.length);
        System.out.println("nums1 elements: " + Arrays.toString(nums1));

        System.out.println("Size of nums2: " + nums2.length);
        System.out.println("nums2 elements: " + Arrays.toString(nums2));

        SolutionD sol = new SolutionD();
        double median = sol.findMedianSortedArrays(nums1, nums2);

        System.out.println("\nMedian: " + median);

        sc.close();
    }
}
