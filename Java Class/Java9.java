// import javax.swing.table.TableCellEditor;
// import java.awt.*;
// import java.util.Scanner;

//Method of overwriting.
//class Animal {
//    public void eat() {
//        System.out.println("Pizza");
//    }
//    void data(){
//        System.out.println("Hello");
//    }
//}
//class Dog extends Animal {
//    public void eat() {
//        System.out.println("Beriyani");
//    }
//    void sleep(){
//        System.out.println("Sleep");
//    }
//}
//class Cat extends Animal {
//    public void eat() {
//        System.out.println("Milk");
//    }
//}
//public class Java9 {
//    public static void main(String[] args) {
//        Animal s1=new Dog();
//     s1.eat(); // Upper casting overloading.
//        Animal s1=new Dog();
//        Dog s2=(Dog)s1; // Lower casting overloading.
//        s2.eat();
//        s2.sleep();
//        s2.data();
//        Cat s3=new Cat();
//        s3.eat();
//    }
//}
//  ABSTRACTIONS:
//  Jise bhi class me abstract hoga us class me object nahi hoga .
//abstract class Animal {
//    abstract void eat();
//}
//class Cat extends Animal {
//    void eat() {
//        System.out.println("Cat eat");
//    }
//}
//public class Java9 {
//    public static void main(String[] args) {
//        Cat s1=new Cat();
//        s1.eat();
//    }
//}
//abstract class Payment{
//    abstract void pay(int amount);
//    void success(){
//        System.out.println("Success");
//    }
//}
//class UPIpayment extends Payment{
//    void pay(int amount){
//        System.out.println("Paying "+amount);
//    }
//}
//class NetBankPayment extends Payment{
//    void pay(int Balance){
//        System.out.println("Paying "+Balance);
//    }
//}
//public class Java9 {
//    public static void main(String[] args) {
//        Payment obj = new UPIpayment();
//        obj.pay(25000);
//        obj.success();
//        Payment obj2 = new UPIpayment();
//        obj2.pay(2600);
//        obj2.success();
//    }
//}
import java.util.Scanner;

abstract class Shape {
    abstract void area();
}

class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    void area() {
        System.out.println("Area of Circle: " + (3.14 * radius * radius));
    }
}

class Rectangle extends Shape {
    double length, breadth;

    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    void area() {
        System.out.println("Area of Rectangle: " + (length * breadth));
    }
}

public class Java9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Circle
        System.out.print("Enter Radius: ");
        double radius = input.nextDouble();
        Circle c = new Circle(radius);
        c.area();

        // Rectangle
        System.out.print("Enter Length: ");
        double length = input.nextDouble();

        System.out.print("Enter Breadth: ");
        double breadth = input.nextDouble();

        Rectangle r = new Rectangle(length, breadth);
        r.area();

        input.close();
    }
}

