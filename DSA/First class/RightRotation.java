//Array

 // Wapn to array  element traverser.
// import java.util.*;
// public class javaarray {
//     public static void main(String[] args){
//         Scanner  sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         int [] arr=new int[n];
//     for( int i=0;i<n;i++){
//         arr[i]=sc.nextInt();

//     }
//     for(int i=0;i<n;i++){
//         System.out.println(arr[i]+" ");
//     }
//     }
// }



// wap max min differe.
// import java.util.*;
// public class javaarray {
//     public static void main(String[] args){
//         Scanner  sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         int [] arr=new int[n];
//     for( int i=0;i<n;i++){
//         arr[i]=sc.nextInt();

//     }
//     for(int i=0;i<n;i++){
//         System.out.println(arr[i]+" ");

//     }
//     int max=arr[0];
//     int min=arr[0];
//     for(int i=1;i<n;i++){
// max= Math.max(max,arr[i]);
// min=Math.min(min,arr[i]);
//     }
//     System.out.println();
//     System.out.println(max-min);
//     }
// }

// wap to target index find.
// import java.util.*;

// public class javaarray {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         // array size
//         int n = sc.nextInt();
//         int[] arr = new int[n];

//         // input array
//         for(int i = 0; i < n; i++){
//             arr[i] = sc.nextInt();
//         }

//         // print array
//         for(int i = 0; i < n; i++){
//             System.out.print(arr[i] + " ");
//         }

//         System.out.println();

//         // target input
//         int target = sc.nextInt();

//         // find index
//         int index = -1;
//         for(int i = 0; i < n; i++){
//             if(arr[i] == target){
//                 index = i;
//                 break;
//             }
//         }

//         // output
//         if(index != -1){
//             System.out.println("Index of target: " + index);
//         } else {
//             System.out.println("Target not found");
//         }
//     }
// }

//wap to print array in right rotation.
import java.util.*;

public class RightRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        // input
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        // right rotation by 1
        int last = arr[n - 1];   // last element save

        for(int i = n - 1; i > 0; i--){
            arr[i] = arr[i - 1]; // shift right
        }

        arr[0] = last; // last element ko front me daal diya

        // print result
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

//wap to inverse .
// wp to reverse.0