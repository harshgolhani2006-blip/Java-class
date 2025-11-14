
//Empolyee and manager(single level inheritance).
//class Employee{
//    void work(){
//        System.out.println("Employees are in working");
//    }
//}
//class Manager extends Employee{
//    void Donework(){
//        System.out.println("Employeses are not work in a correct time ");
//    }
//}
//public class Java8{
//    public static void main(String[] args) {
//        Manager m = new Manager();
//        m.work();
//        m.Donework();
//    }
//}
//Person Student Monitor(Multi-level inheritance)
//class person{
//    void displayName(){
//        System.out.println("Name: Harsh Golhani");
//    }
//}
//class student extends person{
//    void displayclass(){
//        System.out.println("Class: Life");
//    }
//}
//class Monitors extends student {
//    void checkclass(){
//        System.out.println("Gods are check the class is silent");
//    }
//}
//public class Java8 {
//    public static void main(String[] args) {
//        Monitors m = new Monitors();
//        m.displayName();
//        m.displayclass();
//        m.checkclass();
//    }
//}
//Shape and circle(single-level inheritance).
//class Shape{
//    void draw(){
//        System.out.println("Drawing a first shape.");
//    }
//}
//class Circle extends Shape{
//    void MakeShape(){
//        System.out.println("Make circle in my first shape.");
//    }
//}
//public class Java8 {
//    public static void main(String[] args) {
//          Circle  shape = new Circle();
//        shape.draw();
//        shape.MakeShape();
//    }
//}
//Device Laptop gaminglaptop(multi-level inheritance).
//class Device {
//    void powerOn() {
//        System.out.println("Power On");
//    }
//}
//
//class Laptop extends Device {
//    void hp() {
//        System.out.println("This is the laptop");
//    }
//}
//
//class GamingLaptop extends Laptop {  // Now extends Laptop, not Device
//    void playGame() {
//        System.out.println("This laptop is best for gaming");
//    }
//}
//
//public class Java8 {
//    public static void main(String[] args) {
//
//        GamingLaptop g = new GamingLaptop();
//        g.powerOn();   // from Device
//        g.hp();        // from Laptop
//        g.playGame();  // own method
//    }
//}
//Book and Novels(single-level inheritance.
//class Book{
//    void readBook(){
//        System.out.println("Reading Book");
//    }
//}
//class Novel extends Book{
//    void readNovel(){
//        System.out.println("Reading Novel");
//    }
//}
//public class Java8 {
//    public static void main(String[] args) {
//        Novel N=new Novel();
//        N.readBook();
//        N.readNovel();
//    }
//}
//FUNCTION OVERLAODING CONCEPT IS BELOW.
//class Java {
//    void add(int a) {
//        System.out.println(a);
//    }
//
//    void add(int a, int b) {
//        System.out.println(a + b);
//    }
//
//    void add(int a, int b, int c) {
//        System.out.println(a + b + c);
//    }
//
//    public static void main(String[] args) {
//        Java j = new Java();
//        j.add(1, 2, 3);
//    }
//}
//METHOD OF OVERLAODING.
