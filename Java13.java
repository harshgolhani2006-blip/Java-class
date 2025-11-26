//import java.util.HashMap;
//import java.util.Scanner;

//Concept of Hashmap.
//import java.util.HashMap;
//class Java13 {
//    public static void main(String[] arg) {
//        HashMap<Integer,Integer> map = new HashMap<>();
//        map.put(1, 10);
//        map.put(2, 20);
//        System.out.println(map.get(3));
//        System.out.println(map.getOrDefault(3, 10));
//        System.out.println(map.containsKey(3));
//        for(int x:map.keySet()){
//            System.out.println(x);
//        }
//    }
//}
//Frequency.
//import java.util.Scanner;
//import java.util.HashMap;
//class Java13 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        HashMap<Integer, Integer> map = new HashMap<>();
//        System.out.print("Enter the number you want to write: ");
//        int n = sc.nextInt();
//
//        System.out.println("Enter " +n+ " Number:");
//        for (int i = 0; i < n; i++) {
//            int num = sc.nextInt();
//
//            // update frequency
//            map.put(num, map.getOrDefault(num, 0) + 1);
//        }
//        System.out.println("\n--- Frequency of each number ---");
//        for (int key : map.keySet()) {
//            System.out.println(key + " -> " + map.get(key));
//        }
//    }
//}
// First repeating character print.
//class Java13 {
//    public static void main(String[] args){
//        String str="abdcbaba";
//        HashMap<Character,Integer> map=new HashMap<>();
//        for(char ch:str.toCharArray()){
//            map.put(ch,map.getOrDefault(ch,0)+1);
//        }
//        System.out.println(map);
//        for(char ch:str.toCharArray()){
//            if(map.get(ch)==1){
//                System.out.println(ch);
//                break;
//            }
//        }
//    }
//}
//Two Sum of 9.
//import java.util.Scanner;
//import java.util.HashMap;
//public class Java13 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the size of the array: ");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        System.out.print("Enter the elements of the array: ");
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        int target = 9;
//        HashMap<Integer, Integer> map = new HashMap<>();
//
//        for (int i = 0; i < n; i++) {
//
//            int diff = target - arr[i];
//            if (map.containsKey(diff)) {
//                System.out.println("Index 1: " + map.get(diff) + ", Index 2: " +i);
//                //System.out.println("Index 2: " + i);
//                return;
//            }
//            map.put(arr[i], i);
//        }
//        System.out.println("Not found");
//    }
//}
// palindrome ..
import java.util.HashMap;
import java.util.Scanner;

public class Java13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        HashMap<Character, Integer> map = new HashMap<>();

        // Count frequency of each character
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Count how many characters have odd frequency
        int odd = 0;
        for (int val : map.values()) {
            if (val % 2 != 0) odd++;
        }

        if (odd > 1)
            System.out.println("Cannot form a palindrome");
        else
            System.out.println("Can form a palindrome");
    }
}
