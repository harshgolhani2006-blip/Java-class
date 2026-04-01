//Peak Index in Mountain Array.
import java.util.Scanner;

//class SolutionA{
//     public int peakIndexInMountainArray(int[] arr) {
//      int    left=0;
//      int   rigth=arr.length-1;
//         while(left<rigth){
//            int mid=left+(rigth-left)/2;
//             if(arr[mid]>arr[mid+1]){
//                 rigth=mid;
//             }else{
//                 left=mid+1;
//             }
//         }
//         return left;
//     }
// }
//public class Java24 {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter array length: ");
//        int n = scan.nextInt();
//
//        int[] arr = new int[n];
//        System.out.println("Enter the elements of the array:");
//
//        for (int i = 0; i < n; i++) {
//            arr[i] = scan.nextInt();
//        }
//
//        SolutionA s = new SolutionA();
//        int peakIndex = s.peakIndexInMountainArray(arr);
//
//        System.out.println("Peak index is: " + peakIndex);
//
//        scan.close();
//    }
//}
class SolutionB{
    public int peakIndexInMountainArray(int[] arr){
        int low=0;
        int high=arr.length-1;
        while(low<high){
            int mid=(low+high)/2;
            if(arr[mid]<arr[mid+1]){
                low=mid+1;
            }else{
                high=mid;
            }
        }
        return low;
    }
}
public class Java24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter array length: ");
        int n = scan.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        SolutionB s = new SolutionB();
        int peakIndex = s.peakIndexInMountainArray(arr);

        System.out.println("Peak index is: " + peakIndex);

        scan.close();
    }
}