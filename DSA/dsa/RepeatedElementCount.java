import java.util.*;
// public class RepeatedElementCount {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for(int i=0; i<n; i++){
//             arr[i] = sc.nextInt();
//         }
//         HashMap<Integer, Integer> map = new HashMap<>();
//         for(int i=0; i<n; i++){
//             map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
//         }
//         for(Map.Entry<Integer, Integer> entry : map.entrySet()){
//             if(entry.getValue() > 1){
//                 System.out.println(entry.getKey() + " is repeated " + entry.getValue() + " times");
//             }
//         }
//     }
// }
// without using hashmap
public class RepeatedElementCount {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int count = 1;
        for(int i=1; i<n; i++){
            if(arr[i] == arr[i-1]){
                count++;
            } else {
                if(count > 1){
                    System.out.println(arr[i-1] + " is repeated " + count + " times");
                }
                count = 1;
            }
        }
        if(count > 1){
            System.out.println(arr[n-1] + " is repeated " + count + " times");
        }
    }
}

