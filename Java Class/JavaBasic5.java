//public class JavaBasic5 {
//     //static int data=20;  // It is used without obj with obj.
//    int data =20;
//    public static void main(String[] args) {
//        int a=5;
//        JavaBasic5 obj = new JavaBasic5();
//        int b=10;
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(obj.data);
//    }
//}
//public class JavaBasic5 {
//    static void sum() {
//        System.out.println("I am Harsh Golhani");
//    }
//    public static void main(String[] args) {
//        JavaBasic5 obj=new JavaBasic5();
//        obj.sum();
//    }
//}
//class Car {
//    static String name = "Hello";
//
//    static void sum() {
//        System.out.println(name);
//    }
//}
//
//public class JavaBasic5 {
//    public static void main(String[] args) {
//        Car obj = new Car();
//        //obj.sum();     // works, but not recommended for static method
//        // OR directly
//        Car.sum();     // ✅ preferred way
//    }
//}
//WAP TO PRINT STUDENT DETAILS.
import java.util.Scanner;

class Student {
    int roll;
    String name;
    float marks;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter roll: ");
        roll = sc.nextInt();
        sc.nextLine();  // clear newline
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter marks: ");
        marks = sc.nextFloat();
    }

    void display() {
        System.out.println("Roll: " + roll );
        System.out.println("Name :"+name);
        System.out.println("Marks :"+marks);
        System.out.println("------Next Student Details--------");
    }
}

public class JavaBasic5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Student[] s = new Student[n];  // array of Student objects

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of student " + (i + 1) + ":");
            s[i] = new Student();  // create new object for each student
            s[i].input();
        }

        System.out.println("\n--- Student Details ---\n");
        for (int i = 0; i < n; i++) {
            s[i].display();
        }
    }
}
