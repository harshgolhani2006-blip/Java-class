//Set interference
//Hash Set //isme order mantain  rahta hai
import javax.swing.*;
import java.util.*;

//public class Java15 {
//    public static void main(String[] args) {
//        HashSet<Integer> set = new HashSet<>();
//        set.add(11);
//        set.add(5);
//        set.add(6);
//        set.add(10);
//        //set.contains(10);
//        System.out.println(set);
//    }
//}
//public  class Java15 {
//    public static void main(String[] args) {
//        int arr[] = {1, 2, 4, 3,2};
//        HashSet<Integer> set = new HashSet<>();
//        for (int x : arr) {
//            set.add(x);
//        }
//        for (int i = 0; i < arr.length; i++) {
//            set.add(arr[i]);
//        }
//        System.out.println(arr.length);
//        if(arr.length==set.size()){
//            System.out.println("True");
//        }else{
//            System.out.println("False");
//        }
//    }
//}
//print intersection element .
//public class Java15 {
//    public static void main(String[] args) {
//        int arr1[] = {1, 2, 3, 4, 5};
//        int arr2[] = {1, 2, 4};
//        HashSet<Integer> set = new HashSet<>();
//        for(int x : arr1){
//            set.add(x);
//        }
//        System.out.println(set);
//        HashSet<Integer> result = new HashSet<>();
//        for(int y : arr2){
//            if(set.contains(y)) {
//                result.add(y);
//            }
//        }
//        System.out.println(result);
//    }
//}
//print union set element
//public class Java15 {
//    public static void main(String[] args) {
//        int arr1[] = {1, 2, 3, 4, 5};
//        int arr2[] = {6, 7, 8};
//        HashSet<Integer> set = new HashSet<>();
//        for (int x : arr1) {
//            set.add(x);
//        }
//        for (int x : arr2) {
//            set.add(x);
//        }
//        System.out.println(set);
//    }
//}
//Remove duplicate element.
//public class Java15 {
//    public static void main(String[] args) {
//        int arr1[]={1,2,3,4};
//        int arr2[]={1,2};
//        HashSet<Integer>set=new HashSet<>();
//        for(int x:arr1){
//            set.add(x);
//        }
//        for(int y:arr2){
//            set.remove(y);
//        }
//        System.out.println(set);
//    }
//}
//LinkedHashSet. // isme order  Maintain nhi  rahta hai.
//public class Java15 {
//    public static void main(String[] args) {
//        LinkedHashSet<Integer> Set = new LinkedHashSet<>();
//        Set.add(7);
//        Set.add(8);
//        Set.add(9);
//        Set.add(5);
//        System.out.println(Set);
//    }
//}
//tree is used to sort by default.
public class Java15 {
    public static void main(String[] args) {
       TreeSet<Integer> set= new TreeSet();
       set.add(10);
       set.add(1);
       set.add(2);
       set.add(31);
       set.add(32);
       set.add(33);
    System.out.println(set);
    }
}