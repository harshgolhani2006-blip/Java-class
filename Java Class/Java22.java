import java.util.Arrays;
import java.util.EnumSet;
// SortColor.
//public class Java22 {
//    public static void main(String[] args) {
//        int arr[] = {0,2,1};
//
//        int low = 0, mid = 0, high = arr.length - 1;
//
//        while (mid <= high) {
//            if (arr[mid] == 0) {
//                // swap arr[low] and arr[mid]
//                int temp = arr[low];
//                arr[low] = arr[mid];
//                arr[mid] = temp;
//
//                low++;
//                mid++;
//            }
//            else if (arr[mid] == 1) {
//                mid++;
//            }
//            else { // arr[mid] == 2
//                // swap arr[mid] and arr[high]
//                int temp = arr[mid];
//                arr[mid] = arr[high];
//                arr[high] = temp;
//
//                high--;
//            }
//        }
//
//        // Print sorted array
//        for (int i : arr) {
//            System.out.print(i + " ");
//        }
//    }
//}
//class solution{
//    public void sortColor(int[] nums){
//    int c1=0;
//        int c2=0;
//        int c3=0;
//        for(int i:nums){
//            if(i==0){
//                c1++;
//            }else if(i==1){
//                c2++;
//            }else if(i==2){
//                c3++;
//            }
//        }
//        int idx=0;
//       for(int i=0;i<c1;i++){
//           nums[idx]=0;
//           idx++;
//       }
//       for(int i=0;i<c2;i++){
//           nums[idx]=1;
//           idx++;
//       }
//       for(int i=0;i<c3;i++){
//           nums[idx]=2;
//           idx++;
//       }
//    }
//}
//public class Java22 {
//    public static void main(String[] args) {
//        int[] arr = {0, 1, 2, 1, 0};
//
//        solution s = new solution();
//        s.sortColor(arr);
//
//        for (int i : arr) {
//            System.out.print(i + " ");
//        }
//    }
//}
import java.util.Arrays;
class Solution1{
    public void sortColors(int[] num) {
        int low = 0, mid = 0, high = num.length - 1;

        while (mid <= high) {
            if (num[mid] == 0) {
                int temp = num[low];
                num[low] = num[mid];
                num[mid] = temp;
                low++;
                mid++;
            } else if (num[mid] == 1) {
                mid++;
            } else { // num[mid] == 2
                int temp = num[mid];
                num[mid] = num[high];
                num[high] = temp;
                high--;
            }
        }
    }
}
public class Java22 {
    public static void main(String[] args) {
        Solution1 h = new Solution1();
        int[] arr = {1, 0, 1, 0, 2};
        h.sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }
}
