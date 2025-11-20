//INTERFACE CONCEPT
//interface  A{        // one class one child.
//    abstract void login();
//}
//class B implements A{
//    public void login(){
//        System.out.println("B login");
//    }
//}
//public class Java10 {
//    public static void main(String[] args) {
//        B b = new B();
//        b.login();
//    }
//}
//interface A{
//    abstract void Login();
//}
// interface B{
//    abstract void Login();
//}
//class c implements A,B{
//    public void Login(){
//        System.out.println("Login Successfully");
//    }
//}
//public class Java10 {
//    public static void main(String[] args) {
//        c obj = new c();
//        obj.Login();
//    }
//}
//Create two interface walkable and runnable each should have a method walk() and run() respectedly.
//interface Walkable{
//   abstract void walk();
//}
//interface Runnable{
// abstract   void run();
//}
//class Human implements Walkable,Runnable{
//   public void walk(){
//       System.out.println("walk");
//   }
//   public void run(){
//       System.out.println("run");
//   }
//}
//public class Java10 {
//    public static void main(String[] args){
//        Human h = new Human();
//        h.walk();
//        h.run();
//    }
//}
//Create two interface a and b both interface should  have a method name display().then create class demo.
//interface A{
//    abstract void named_display();
//}
//interface B {
//    abstract void named_display();
//}
//class Demo implements A,B{
//    public void named_display(){
//        System.out.println("Harsh Golhani");
//    }
//}
//public class Java10 {
//    public static void main(String[] args) {
//        Demo c=new c();
//        c.named_display();
//    }
//}
// create interface animal with a makesound .then create a class dog .
//interface Animal{
//    abstract void makeSound();
//}
//class Dog implements Animal{
//    public void makeSound(){
//        System.out.println("Bark");
//    }
//}
//public class Java10{
//    public static void main(String[] args) {
//        Animal animal = new Dog();
//        animal.makeSound();
//    }
//}
//Create shape with  area .then create circle
//import java.util.Scanner;
//
//interface shape {
//    double getArea();
//}
//
//class circle implements shape {
//    double radius;
//
//    circle(double r) {
//        radius = r;
//    }
//
//    public double getArea() {
//        return 3.14 * radius * radius;
//    }
//}
//
//public class Java10 {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter radius: ");
//        double r = sc.nextDouble();
//
//        shape shape = new circle(r);
//
//        double area = shape.getArea();
//        System.out.println("Area = " + area);
//    }
//}
//create interface vehicle with a default mathod start () that prints and create a class car that impe.
interface vehicle{
    // default method.
    abstract void start();
    abstract void stop();
}
class Car implements vehicle{
    // car does not override start(),so default method is run.
    public void start(){
        System.out.println("Vehicle starting....");
    }
    public void stop(){
        System.out.println("Vehicle stopping....");
    }
}
public class Java10
{
    public static void main(String[] args)
    {
        Car object = new Car();  //create car object
        object.start();  //call default method.
        object.stop();
    }
}