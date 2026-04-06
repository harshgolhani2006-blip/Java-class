//wap to find the sum of diagonals of a matrix.
import java.util.Scanner;
// public class diagonalsum {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter size of matrix (n x n): ");
//         int n = sc.nextInt();

//         int arr[][] = new int[n][n];

//         // Input matrix
//         System.out.println("Enter elements:");
//         for(int i = 0; i < n; i++){
//             for(int j = 0; j < n; j++){
//                 arr[i][j] = sc.nextInt();
//             }
//         }

//         int primarySum = 0;
//         int secondarySum = 0;

//         // Calculate diagonal sums
//         for(int i = 0; i < n; i++){
//             for(int j = 0; j < n; j++){
//                 if(i == j){
//                     primarySum += arr[i][j];
//                 }
//                 if(i + j == n - 1){
//                     secondarySum += arr[i][j];
//                 }
//             }
//         }

//         System.out.println("Primary Diagonal Sum = " + primarySum);
//         System.out.println("Secondary Diagonal Sum = " + secondarySum);
//     }
// }

//wap to transpose a matrix.

// public class TransposeMatrix {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter number of rows: ");
//         int rows = sc.nextInt();
//         System.out.print("Enter number of columns: ");
//         int cols = sc.nextInt();

//         int arr[][] = new int[rows][cols];

//         // Input matrix
//         System.out.println("Enter elements:");
//         for(int i = 0; i < rows; i++){
//             for(int j = 0; j < cols; j++){
//                 arr[i][j] = sc.nextInt();
//             }
//         }

//         int transpose[][] = new int[cols][rows];
//         for(int i = 0; i < rows; i++){
//             for(int j = 0; j < cols; j++){
//                 transpose[j][i] = arr[i][j];
//             }
//         }
//         System.out.println("Transpose of the matrix:");
//         for(int i = 0; i < cols; i++){
//             for(int j = 0; j < rows; j++){
//                 System.out.print(transpose[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }

// wap to search an element in a matrix.
// public class searchElementInMatrix {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter number of rows: ");
//         int rows = sc.nextInt();
//         System.out.print("Enter number of columns: ");
//         int cols = sc.nextInt();

//         int arr[][] = new int[rows][cols];

//         // Input matrix
//         System.out.println("Enter elements:");
//         for(int i = 0; i < rows; i++){
//             for(int j = 0; j < cols; j++){
//                 arr[i][j] = sc.nextInt();
//             }
//         }

//         System.out.print("Enter element to search: ");
//         int target = sc.nextInt();

//         boolean found = false;
//         for(int i = 0; i < rows; i++){
//             for(int j = 0; j < cols; j++){
//                 if(arr[i][j] == target){
//                     System.out.println("Element found at position: (" + i + ", " + j + ")");
//                     found = true;
//                     break;
//                 }
//             }
//             if(found) break;
//         }

//         if(!found){
//             System.out.println("Element not found in the matrix.");
//         }
//     }
// }

// wap to print the spiral order of a matrix.
// public class spiralorder {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter number of rows: ");
//         int rows = sc.nextInt();
//         System.out.print("Enter number of columns: ");
//         int cols = sc.nextInt();

//         int arr[][] = new int[rows][cols];

//         // Input matrix
//         System.out.println("Enter elements:");
//         for(int i = 0; i < rows; i++){
//             for(int j = 0; j < cols; j++){
//                 arr[i][j] = sc.nextInt();
//             }
//         }

//         System.out.println("Spiral order of the matrix:");
//         int top = 0, bottom = rows - 1, left = 0, right = cols - 1;

//         while(top <= bottom && left <= right){
//             // Traverse from left to right
//             for(int i = left; i <= right; i++){
//                 System.out.print(arr[top][i] + " ");
//             }
//             top++;

//             // Traverse from top to bottom
//             for(int i = top; i <= bottom; i++){
//                 System.out.print(arr[i][right] + " ");
//             }
//             right--;

//             if(top <= bottom){
//                 // Traverse from right to left
//                 for(int i = right; i >= left; i--){
//                     System.out.print(arr[bottom][i] + " ");
//                 }
//                 bottom--;
//             }

//             if(left <= right){
//                 // Traverse from bottom to top
//                 for(int i = bottom; i >= top; i--){
//                     System.out.print(arr[i][left] + " ");
//                 }
//                 left++;
//             }
//         }
//     }

// }

//wap to print the wave order of a matrix.
public class waveorder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int arr[][] = new int[rows][cols];

        // Input matrix
        System.out.println("Enter elements:");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Wave order of the matrix:");
        for(int j = 0; j < cols; j++){
            if(j % 2 == 0){
                // Traverse from top to bottom
                for(int i = 0; i < rows; i++){
                    System.out.print(arr[i][j] + " ");
                }
            } else {
                // Traverse from bottom to top
                for(int i = rows - 1; i >= 0; i--){
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }
}