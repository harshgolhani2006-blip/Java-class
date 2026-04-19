import java.util.*;
public class GridShortpart {
    public static void grid(String str,int row,int col){
        if(row == 1 && col == 1){
            System.out.println(str);
            return;
        }
        if (row>1) grid(str + "D",row-1,col);
        if (col>1) grid(str + "R",row,col-1);
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int r = sc.nextInt();
        System.out.println("Enter the number of columns");
        int c = sc.nextInt();
        grid("",r,c);
    }
}