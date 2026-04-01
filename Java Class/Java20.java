import java.util.ArrayList;
import java.util.List;

//String API.:-filter,map,reduce,limit,skip,sort.
//public class Java20 {
//    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        list.add(6);
//        list.add(7);
//        list.add(8);
//        list.add(9);
//        list.add(10);
//        List<Integer>res= list.stream().filter(n->n>6).toList();
//        System.out.println(res);
//        List<Integer>mapdata=list.stream().map(n->n*2).toList();
//        System.out.println(mapdata);
//        int data= list.stream().reduce(0, (a,b)->a+b);
//        System.out.println(data);
//    }
//}
//print only Odd number.
//public class Java20 {
//    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        list.add(6);
//        list.add(7);
//        list.add(8);
//        list.add(9);
//        list.add(10);
//        List<Integer>res= list.stream().filter(n->n%2!=0).toList();
//        System.out.println(res);
//        List<Integer>mapdata=list.stream().map(n->n*2).toList();
//        System.out.println(mapdata);
//        int data= list.stream().reduce(0, (a,b)->a+b);
//        System.out.println(data);
//    }
////Print even number.
//public class Java20 {
//    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        list.add(6);
//        list.add(7);
//        list.add(8);
//        list.add(9);
//        list.add(10);
//        List<Integer>res= list.stream().filter(n->n%2!=1).toList();
//        System.out.println(res);
//        List<Integer>mapdata=list.stream().map(n->n*2).toList();
//        System.out.println(mapdata);
//        int data= list.stream().reduce(0, (a,b)->a+b);
//        System.out.println(data);
//    }
//]
    //Skip,limit,sort.
public class Java20 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        List<Integer>res= list.stream().filter(n->n%2!=0).toList();
        System.out.println(res);
        List<Integer>mapdata=list.stream().map(n->n*2).toList();
        System.out.println(mapdata);
        int data= list.stream().reduce(0, (a,b)->a+b);
        System.out.println(data);
        List<Integer>skip=list.stream().skip(2).toList();
        System.out.println(skip);
        List<Integer>limit=list.stream().limit(2).toList();
        System.out.println(limit);
        List<Integer>sort=list.stream().sorted((a,b)->a-b).toList();
        System.out.println(sort);
    }
}