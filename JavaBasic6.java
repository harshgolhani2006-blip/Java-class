import java.awt.geom.Area;
import java.util.Scanner;

//class car{
//    car(int a){
//        System.out.println("Hello world");
//    }
//}
//class JavaBasic6{
//    public static void main(String args[]){
//        car s1=new car(5);
//        car s2=new car(6);
//    }
//}
//class car {
//    int a;
//    String name;
//
//    car(int a, String name) {
//        this.a = a;
//        this.name = name;
//        System.out.println("a" + " " + a);
//        System.out.println("name" + " " + name);
//    }
//}
//class JavaBasic6 {
//    public static void main(String[] args) {
//        car s1 = new car(1, "Jack");
//        car s2 = new car(2,"Jill");
//        car s3 = new car(3, "James");
//    }
//}
//WAP TO CALCULATE THE PERIMETER AND AREA OF RECTANGLE.
//import java.util.Scanner;
//class Rectangle{
//    double length;
//    double breadth;
//
//    //constructor to initialize length and breadth.
//    Rectangle(double l,double b){
//        length=l;
//        breadth=b;
//    }
//    //Method to calculate area.
//    double getArea(){
//        return length*breadth;
//    }
//    //Method to calculate perimeter.
//    double getPerimeter(){
//        return 2*(length+breadth);
//    }
//    //Method to display results.
//    void display(){
//        System.out.println("length: "+length);
//        System.out.println("breadth: "+breadth);
//        System.out.println("area: "+getArea());
//        System.out.println("perimeter: "+getPerimeter());
//    }
//    //Main Method
//    public static void main(String[] args){
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter the length of rectangle:");
//        int length = scan.nextInt();
//        System.out.println("Enter the breadth of rectangle:");
//        int breadth = scan.nextInt();
//        Rectangle rect = new Rectangle(length,breadth);
//        Area area = new Area();
//        rect.display();
//  }
//}
//Wap to bank detail.
import java.util.Scanner;

public class JavaBasic6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = 0.0;
        boolean accountCreated = false;

        while (true) {

            System.out.println("\n===== BANK SYSTEM MENU =====");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    if (accountCreated) {
                        System.out.println("Account already created!");
                    } else {
                        System.out.print("Enter initial balance: ");
                        balance = sc.nextDouble();

                        if (balance < 0) {
                            System.out.println("Balance cannot be negative!");
                            balance = 0;
                        } else {
                            accountCreated = true;
                            System.out.println("Account created successfully!");
                        }
                    }
                    break;

                case 2:
                    if (!accountCreated) {
                        System.out.println("Create an account first!");
                        break;
                    }
                    System.out.print("Enter deposit amount: ");
                    double dep = sc.nextDouble();

                    if (dep > 0) {
                        balance += dep;
                        System.out.println("Deposited successfully!");
                    } else {
                        System.out.println("Invalid deposit amount!");
                    }
                    break;

                case 3:
                    if (!accountCreated) {
                        System.out.println("Create an account first!");
                        break;
                    }
                    System.out.print("Enter amount to withdraw: ");
                    double w = sc.nextDouble();

                    if (w > 0 && w <= balance) {
                        balance -= w;
                        System.out.println("Withdrawal successful!");
                    } else {
                        System.out.println("Invalid or insufficient balance!");
                    }
                    break;

                case 4:
                    if (!accountCreated) {
                        System.out.println("Create an account first!");
                    } else {
                        System.out.println("Current Balance: ₹" + balance);
                    }
                    break;

                case 5:
                    System.out.println("Thank you for using the Bank System!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}