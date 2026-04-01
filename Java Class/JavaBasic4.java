//public class JavaBasic4 {
//    public static void main(String[] args) {
//        String str="Hello"; //mouteable nahi hai inmouteable hai..
//        String str1="h";
//
//        for(char ch:str.toCharArray()){
//            str1=str1+ch;
//        }
//        System.out.println(str1);
//    }
//}
//public class JavaBasic4 {
//    public static void main(String[] args) {
//        // 1.Builder:-
//        StringBuilder str = new StringBuilder("Hello World");   //mouteable hai.
//        System.out.println("Intial String: "+ str);
//        // 2.Apprnd :-
//        str.append("Bye world");
//        System.out.println("String appended: "+ str);
//        // 3.Insert :-
//        str.insert(1, "hello");
//        System.out.println("String after insert: "+ str);
//        // 4.Replace:-
//        str.replace(2, 3, "world");
//        System.out.println("String replaced: "+ str);
//        // 5.Delete :-
//        str.delete(2, 3);
//        System.out.println("String deleted: "+ str);
//        // 6.Reverse :-
//        str.reverse();
//        System.out.println("String reversed: "+ str);
//        // 7.Length :-
//        System.out.println("Length: "+ str.length());
//        // 8.Capacity :-
//        System.out.println("Capacity: "+ str.capacity());
//    }
//}
// Wap to reverse at a place.
//public class JavaBasic4 {
//    public static void main(String[] args) {
//        String str = "I Love Java";
//        System.out.println(str);
//        String a[]=str.split(" ");
//        StringBuilder result=new StringBuilder();
//        for(String i: a){
//            StringBuilder data=new StringBuilder(i);
//            result.append(data.reverse().append(" "));
//        }
//        System.out.println(result);
//    }
//}
// String compressed
//public class JavaBasic4 {
//    public static void main(String[] args) {
//    String str="aabbcc";
//    StringBuilder result=new StringBuilder();
//    int count=1;
//    for(int i=1;i<str.length();i++){
//        if(str.charAt(i)==str.charAt(i-1)){
//            count++;
//        }else {
//            result.append(str.charAt(i - 1)).append(count);
//            count = 1;
//        }
//    }
//    result.append(str.charAt(str.length()-1)).append(count);
//    System.out.println(result);
//    }
//}