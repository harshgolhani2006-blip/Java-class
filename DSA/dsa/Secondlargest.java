import java.util.*;
public class Secondlargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int max = arr[0];
        int secondMax = Integer.MIN_VALUE;
        for(int i=1; i<n; i++){
            if(arr[i]>max){
                secondMax = max;
                max = arr[i];
            }else if(arr[i]>secondMax && arr[i]!=max){
                secondMax = arr[i];
            }else if(arr[i]==max){
                continue;
            }
        }
        System.out.println("Second largest: " + secondMax);
    }
}