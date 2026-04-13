// wap to user input x, n and calculate x^n using recursion
 import java.util.*;

// public class power {

//     // recursive function
//     public static int power(int x, int n) {
//         if (n == 0) {
//             return 1;
//         }
//         return x * power(x, n - 1);
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the value of x: ");
//         int x = sc.nextInt();

//         System.out.print("Enter the value of n: ");
//         int n = sc.nextInt();

//         int result = power(x, n);

//         System.out.println(x + " raised to the power of " + n + " is: " + result);
//     }
// }

// wap to user input and print the reverse of number using recursion.
// public class reverseNumber {
//     // recursive function to reverse a number
//     int rev = 0;
//     public static int reverse(int num, int rev) {
//         if (num == 0) {
//             return rev;
//         }
//         rev = rev * 10 + num % 10;
//         return reverse(num / 10, rev);
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a number: ");
//         int num = sc.nextInt();

//         int reversedNumber = reverse(num, 0);

//         System.out.println("Reversed number: " + reversedNumber);
//     }
// }

//wap to user input and print the sum of digits of a number using recursion.
// public class sumOfNumber {
//     // recursive function to calculate the sum of digits
//     public static int sumOfDigits(int num) {
//         if (num == 0) {
//             return 0;
//         }
//         return num % 10 + sumOfDigits(num / 10);
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a number: ");
//         int num = sc.nextInt();

//         int sum = sumOfDigits(num);

//         System.out.println("Sum of digits: " + sum);
//     }   
// }

// wap to user input and count the number of digits in a number using recursion.
// public class CountOfNumber {
//     // recursive function to count the number of digits
//     public static int countDigits(int num) {
//         if (num == 0) {
//             return 0;
//         }
//         return 1 + countDigits(num / 10);
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a number: ");
//         int num = sc.nextInt();

//         int count = countDigits(num);

//         System.out.println("Number of digits: " + count);
//     }
// }

// wap to user input two numbers and calculate their GCD using recursion.
//  public class GCD {
//     // recursive function to calculate GCD
//     public static int gcd(int a, int b) {
//         if (b == 0) {
//             return a;
//         }
//         return gcd(b, a % b);
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the first number: ");
//         int num1 = sc.nextInt();

//         System.out.print("Enter the second number: ");
//         int num2 = sc.nextInt();

//         int result = gcd(num1, num2);

//         System.out.println("GCD of " + num1 + " and " + num2 + " is: " + result);
//     }
//  }

//wap to user input and count the number of zeros in a number using recursion.
// public class CountOfZero {
//     // recursive function to count the number of zeros
//     public static int countZeros(int num) {
//         if (num == 0) {
//             return 1; // Count the zero itself
//         }
//         if (num < 10) {
//             return 0; // Base case for single-digit numbers other than zero
//         }
//         int lastDigit = num % 10;
//         int count = (lastDigit == 0) ? 1 : 0; // Increment count if last digit is zero
//         return count + countZeros(num / 10); // Recur for the remaining digits
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a number: ");
//         int num = sc.nextInt();

//         int zeroCount = countZeros(num);

//         System.out.println("Number of zeros: " + zeroCount);
//     }
// }

// wap to user input gives the array and count the number in the array using recursion.
//  public class CountOfArray {
//     // recursive function to count the number of elements in an array
//     public static int countElements(int[] arr, int index) {
//         if (index == arr.length) {
//             return 0; // Base case: end of the array
//         }
//         return 1 + countElements(arr, index + 1); // Count current element and recur for the rest
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the size of the array: ");
//         int size = sc.nextInt();

//         int[] arr = new int[size];

//         System.out.println("Enter the elements of the array:");
//         for (int i = 0; i < size; i++) {
//             arr[i] = sc.nextInt();
//         }

//         int count = countElements(arr, 0);

//         System.out.println("Number of elements in the array: " + count);
//     }
//  }

// wap to user input gives the array and count the sum of the elements in the array using recursion.
//  public class SumOfArray {
//     // recursive function to calculate the sum of elements in an array
//     public static int sumOfElements(int[] arr, int index) {
//         if (index == arr.length) {
//             return 0; // Base case: end of the array
//         }
//         return arr[index] + sumOfElements(arr, index + 1); // Add current element and recur for the rest
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the size of the array: ");
//         int size = sc.nextInt();

//         int[] arr = new int[size];

//         System.out.println("Enter the elements of the array:");
//         for (int i = 0; i < size; i++) {
//             arr[i] = sc.nextInt();
//         }

//         int sum = sumOfElements(arr, 0);

//         System.out.println("Sum of elements in the array: " + sum);
//     }
//  }

// wap to user input gives the array and calculate the maximum element in the array using recursion.
// public class MaxOfArray {
//     // recursive function to find the maximum element in an array
//     public static int maxElement(int[] arr, int index) {
//         if (index == arr.length - 1) {
//             return arr[index]; // Base case: last element is the maximum
//         }
//         int maxInRest = maxElement(arr, index + 1); // Recur for the rest of the array
//         return Math.max(arr[index], maxInRest); // Return the maximum of current element and max in rest
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the size of the array: ");
//         int size = sc.nextInt();

//         int[] arr = new int[size];

//         System.out.println("Enter the elements of the array:");
//         for (int i = 0; i < size; i++) {
//             arr[i] = sc.nextInt();
//         }

//         int max = maxElement(arr, 0);

//         System.out.println("Maximum element in the array: " + max);
//     }
// }

// // wap to user input gives the array and calculate the minimum element in the array using recursion.
// public class MinOfArray {
//     // recursive function to find the minimum element in an array
//     public static int minElement(int[] arr, int index) {
//         if (index == arr.length - 1) {
//             return arr[index]; // Base case: last element is the minimum
//         }
//         int minInRest = minElement(arr, index + 1); // Recur for the rest of the array
//         return Math.min(arr[index], minInRest); // Return the minimum of current element and min in rest
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the size of the array: ");
//         int size = sc.nextInt();

//         int[] arr = new int[size];

//         System.out.println("Enter the elements of the array:");
//         for (int i = 0; i < size; i++) {
//             arr[i] = sc.nextInt();
//         }

//         int min = minElement(arr, 0);

//         System.out.println("Minimum element in the array: " + min);
//     }
// }

// wap to user input gives array and change the element of the array using recursion.
//  public class ChangeOfArray{
//     // recursive function to change the elements of an array
//     public static void changeArray(int[] arr, int index, int newValue) {
//         if (index == arr.length) {
//             return; // Base case: end of the array
//         }
//         arr[index] = newValue; // Change current element to new value
//         changeArray(arr, index + 1, newValue); // Recur for the rest of the array
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the size of the array: ");
//         int size = sc.nextInt();

//         int[] arr = new int[size];

//         System.out.println("Enter the elements of the array:");
//         for (int i = 0; i < size; i++) {
//             arr[i] = sc.nextInt();
//         }

//         System.out.print("Enter the new value to change all elements: ");
//         int newValue = sc.nextInt();

//         changeArray(arr, 0, newValue);

//         System.out.println("Array after changing elements:");
//         for (int i = 0; i < size; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
//  }

// wap to user input gives array and calculate the average of the elements in the array using recursion.
// public class AverageOfArray {
//     // recursive function to calculate the average of elements in an array
//     public static double average(int[] arr, int index, int sum) {
//         if (index == arr.length) {
//             return (double) sum / arr.length; // Base case: end of the array, return average
//         }
//         sum += arr[index]; // Add current element to sum
//         return average(arr, index + 1, sum); // Recur for the rest of the array
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the size of the array: ");
//         int size = sc.nextInt();

//         int[] arr = new int[size];

//         System.out.println("Enter the elements of the array:");
//         for (int i = 0; i < size; i++) {
//             arr[i] = sc.nextInt();
//         }

//         double avg = average(arr, 0, 0);

//         System.out.println("Average of elements in the array: " + avg);
//     }
// }

// wap to user input given array and calculate the even and odd number in the array using recursion.
// public class EvenOddOfArray {
//     // recursive function to count even and odd numbers in an array
//     public static void countEvenOdd(int[] arr, int index, int evenCount, int oddCount) {
//         if (index == arr.length) {
//             System.out.println("Number of even elements: " + evenCount);
//             System.out.println("Number of odd elements: " + oddCount);
//             return; // Base case: end of the array
//         }
//         if (arr[index] % 2 == 0) {
//             evenCount++; // Increment even count if current element is even
//         } else {
//             oddCount++; // Increment odd count if current element is odd
//         }
//         countEvenOdd(arr, index + 1, evenCount, oddCount); // Recur for the rest of the array
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the size of the array: ");
//         int size = sc.nextInt();

//         int[] arr = new int[size];

//         System.out.println("Enter the elements of the array:");
//         for (int i = 0; i < size; i++) {
//             arr[i] = sc.nextInt();
//         }

//         countEvenOdd(arr, 0, 0, 0);
//     }
// }

// wap to user input given array and calculate the even sum in the array using recursion.
public class EvenSumOfArray {
    // recursive function to calculate the sum of even numbers in an array
    public static int evenSum(int[] arr, int index) {
        if (index == arr.length) {
            return 0; // Base case: end of the array
        }
        int currentEvenSum = (arr[index] % 2 == 0) ? arr[index] : 0; // Add current element to sum if it's even
        return currentEvenSum + evenSum(arr, index + 1); // Recur for the rest of the array
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int sumOfEven = evenSum(arr, 0);

        System.out.println("Sum of even elements in the array: " + sumOfEven);
    }
}