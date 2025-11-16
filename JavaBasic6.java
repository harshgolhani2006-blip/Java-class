//import java.awt.geom.Area;
//import java.util.Scanner;

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
//import java.util.Scanner;
//
//public class JavaBasic6 {
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        double balance = 0.0;
//        boolean accountCreated = false;
//
//        while (true) {
//
//            System.out.println("\n===== BANK SYSTEM MENU =====");
//            System.out.println("1. Create Account");
//            System.out.println("2. Deposit Money");
//            System.out.println("3. Withdraw Money");
//            System.out.println("4. Check Balance");
//            System.out.println("5. Exit");
//            System.out.print("Enter your choice: ");
//
//            int choice = sc.nextInt();
//
//            switch (choice) {
//
//                case 1:
//                    if (accountCreated) {
//                        System.out.println("Account already created!");
//                    } else {
//                        System.out.print("Enter initial balance: ");
//                        balance = sc.nextDouble();
//
//                        if (balance < 0) {
//                            System.out.println("Balance cannot be negative!");
//                            balance = 0;
//                        } else {
//                            accountCreated = true;
//                            System.out.println("Account created successfully!");
//                        }
//                    }
//                    break;
//
//                case 2:
//                    if (!accountCreated) {
//                        System.out.println("Create an account first!");
//                        break;
//                    }
//                    System.out.print("Enter deposit amount: ");
//                    double dep = sc.nextDouble();
//
//                    if (dep > 0) {
//                        balance += dep;
//                        System.out.println("Deposited successfully!");
//                    } else {
//                        System.out.println("Invalid deposit amount!");
//                    }
//                    break;
//
//                case 3:
//                    if (!accountCreated) {
//                        System.out.println("Create an account first!");
//                        break;
//                    }
//                    System.out.print("Enter amount to withdraw: ");
//                    double w = sc.nextDouble();
//
//                    if (w > 0 && w <= balance) {
//                        balance -= w;
//                        System.out.println("Withdrawal successful!");
//                    } else {
//                        System.out.println("Invalid or insufficient balance!");
//                    }
//                    break;
//
//                case 4:
//                    if (!accountCreated) {
//                        System.out.println("Create an account first!");
//                    } else {
//                        System.out.println("Current Balance: ₹" + balance);
//                    }
//                    break;
//
//                case 5:
//                    System.out.println("Thank you for using the Bank System!");
//                    sc.close();
//                    return;
//
//                default:
//                    System.out.println("Invalid choice! Try again.");
//            }
//        }
//    }
//}
//WAP TO CREATE A CLASS CAR WITH FIELDS BRAND MOBEL AND PRICE.
//import java.util.Scanner;
//
//class Car {
//    String brand;
//    String model;
//    String color;
//    int year;
//    long price;
//
//    void input(Scanner sc) {
//        System.out.print("Enter Brand: ");
//        brand = sc.nextLine();
//
//        System.out.print("Enter Model: ");
//        model = sc.nextLine();
//
//        System.out.print("Enter Color: ");
//        color = sc.nextLine();
//
//        System.out.print("Enter Year: ");
//        year = sc.nextInt();
//
//        System.out.print("Enter Price: ");
//        price = sc.nextLong();
//        sc.nextLine(); // clear buffer
//    }
//
//    void display() {
//        System.out.println("Brand: " + brand);
//        System.out.println("Model: " + model);
//        System.out.println("Color: " + color);
//        System.out.println("Year: " + year);
//        System.out.println("Price: " + price);
//    }
//}
//
//public class JavaBasic6 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("How many cars do you want to enter? ");
//        int n = sc.nextInt();
//        sc.nextLine(); // clear buffer
//
//        Car[] cars = new Car[n];
//
//        System.out.println("\n========= ENTER CAR DETAILS =========\n");
//
//        for (int i = 0; i < n; i++) {
//            System.out.println("\n--- Car " + (i + 1) + " ---");
//            cars[i] = new Car();
//            cars[i].input(sc);
//        }
//
//        System.out.println("\n========= DISPLAYING CAR DETAILS =========\n");
//
//        for (int i = 0; i < n; i++) {
//            System.out.println("\n--- Car " + (i + 1) + " ---");
//            cars[i].display();
//        }
//
//        sc.close();
//    }
//}
//WAP TO CREATE A CLASS CIRCLE WITH RADIUS AND CALCULATE THE AREA OF CIRCLE AND CIRCUMFERENCE OF CIRCLE.
//import java.util.Scanner;
//
//class Circle {
//    double radius;
//
//    void input() {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter radius: ");
//        radius = sc.nextDouble();
//    }
//
//    double area() {
//        return Math.PI * radius * radius;
//    }
//
//    double circumference() {
//        return 2 * Math.PI * radius;
//    }
//
//    void display() {
//        System.out.println("Area of Circle = " + area());
//        System.out.println("Circumference of Circle = " + circumference());
//    }
//}
//
//public class JavaBasic6 {
//    public static void main(String[] args) {
//        Circle c = new Circle();
//        System.out.println("\n========= ENTER CIRCLE DETAILS =========\n");
//        c.input();
//        System.out.println("\n========= DISPLAYING CIRCLE DETAILS =========\n");
//        c.display();
//    }
//}
//
 //WAP TO CREATE A CLASS BOOK WITH TITTLE AUTHOR AND PRICE .
//import java.util.Scanner;
//
//class Book {
//    String title;
//    String author;
//    int pages;
//    double price;
//
//    void input() {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter Book Title: ");
//        title = sc.nextLine();
//
//        System.out.print("Enter Author Name: ");
//        author = sc.nextLine();
//
//        System.out.print("Enter Number of Pages: ");
//        pages = sc.nextInt();
//
//        System.out.print("Enter Price: ");
//        price = sc.nextDouble();
//    }
//
//    void applyDiscount() {
//        price = price - (price * 0.10);   // 10% discount
//    }
//
//    void display() {
//        System.out.println("\n---- BOOK DETAILS ----");
//        System.out.println("Title: " + title);
//        System.out.println("Author: " + author);
//        System.out.println("Pages: " + pages);
//        System.out.println("Final Price after 10% discount: " + price);
//    }
//}
//
//public class JavaBasic6 {
//    public static void main(String[] args) {
//        Book b = new Book();
//        b.input();
//        b.applyDiscount();
//        b.display();
//    }
//}
// WAP TO EMPLOYEE SALARY DEATAILS.
//import java.util.Scanner;
//
//class Employee {
//    String name;
//    int id;
//    double salary;
//
//    void input(Scanner sc) {
//        System.out.print("Enter Employee Name: ");
//        name = sc.nextLine();
//
//        System.out.print("Enter Employee ID: ");
//        id = sc.nextInt();
//
//        System.out.print("Enter Employee Salary: ");
//        salary = sc.nextDouble();
//        sc.nextLine(); // clear buffer
//    }
//
//    void showBeforeIncrement() {
//        System.out.println("Name: " + name);
//        System.out.println("ID: " + id);
//        System.out.println("Salary Before Increment: " + salary);
//    }
//
//    void increment() {
//        salary = salary + (salary * 0.05); // 5% increment
//    }
//
//    void showAfterIncrement() {
//        System.out.println("Salary After 5% Increment: " + salary);
//        System.out.println("----------------------------------------");
//    }
//}
//
//public class JavaBasic6 {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("How many employees? ");
//        int n = sc.nextInt();
//        sc.nextLine(); // clear buffer
//
//        Employee[] emp = new Employee[n];
//
//        System.out.println("\n========= ENTER EMPLOYEE DETAILS =========");
//
//        for (int i = 0; i < n; i++) {
//            System.out.println("\n--- Employee " + (i + 1) + " ---");
//            emp[i] = new Employee();
//            emp[i].input(sc);
//        }
//
//        System.out.println("\n========= EMPLOYEE SALARY DETAILS =========");
//
//        for (int i = 0; i < n; i++) {
//            System.out.println("\n--- Employee " + (i + 1) + " ---");
//            emp[i].showBeforeIncrement();
//            emp[i].increment();
//            emp[i].showAfterIncrement();
//        }
//
//        sc.close();
//    }
//}
//wap to create movie with name rating and release year create 5 object and display movie released after  20
//import java.util.Scanner;
//
//class Movie {
//    String name;
//    double rating;
//    int year;
//
//    void input(Scanner sc) {
//        System.out.print("Enter Movie Name: ");
//        name = sc.nextLine();
//
//        System.out.print("Enter Rating: ");
//        rating = sc.nextDouble();
//
//        System.out.print("Enter Release Year: ");
//        year = sc.nextInt();
//        sc.nextLine(); // clear buffer
//    }
//
//    void display() {
//        System.out.println("Movie Name: " + name);
//        System.out.println("Rating: " + rating);
//        System.out.println("Release Year: " + year);
//        System.out.println("----------------------------------");
//    }
//}
//
//public class JavaBasic6 {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        Movie[] movies = new Movie[5];
//
//        System.out.println("===== ENTER DETAILS OF 5 MOVIES =====");
//
//        for (int i = 0; i < 5; i++) {
//            System.out.println("\n--- Movie " + (i + 1) + " ---");
//            movies[i] = new Movie();
//            movies[i].input(sc);
//        }
//
//        System.out.println("\n===== MOVIES RELEASED AFTER 2020 =====\n");
//
//        for (int i = 0; i < 5; i++) {
//            if (movies[i].year > 2020) {
//                movies[i].display();
//            }
//        }
//
//        sc.close();
//    }
//}
//class Movie {
//    String name;
//    double rating;
//    int year;
//
//    Movie(String name, double rating, int year) {
//        this.name = name;
//        this.rating = rating;
//        this.year = year;
//    }
//
//    void display() {
//        System.out.println("Movie Name: " + name);
//        System.out.println("Rating: " + rating);
//        System.out.println("Release Year: " + year);
//        System.out.println("-----------------------------");
//    }
//}
//
//public class JavaBasic6 {
//    public static void main(String[] args) {
//
//        // Creating 5 movie objects
//        Movie m1 = new Movie("Avengers Endgame", 9.0, 2019);
//        Movie m2 = new Movie("KGF 2", 8.5, 2022);
//        Movie m3 = new Movie("Pushpa", 7.8, 2021);
//        Movie m4 = new Movie("Pathaan", 7.0, 2023);
//        Movie m5 = new Movie("Jawan", 7.5, 2023);
//
//        Movie[] movies = {m1, m2, m3, m4, m5};
//
//        System.out.println("Movies Released After 2020:\n");
//
//        for (Movie m : movies) {
//            if (m.year > 2020) {   // condition
//                m.display();
//            }
//        }
//    }
//}
//WAP to create a clalculator.
//import java.util.Scanner;
//
//class Calculate {
//
//    double add(double a, double b) {
//        return a + b;
//    }
//
//    double subtract(double a, double b) {
//        return a - b;
//    }
//
//    double multiply(double a, double b) {
//        return a * b;
//    }
//
//    double divide(double a, double b) {
//        if (b == 0) {
//            System.out.println("Cannot divide by zero!");
//            return 0;
//        }
//        return a / b;
//    }
//}
//
//public class JavaBasic6 {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        Calculate calc = new Calculate();
//
//        System.out.print("Enter first number: ");
//        double n1 = sc.nextDouble();
//
//        System.out.print("Enter second number: ");
//        double n2 = sc.nextDouble();
//
//        System.out.println("\n---- CHOOSE OPERATION ----");
//        System.out.println("1. Add");
//        System.out.println("2. Subtract");
//        System.out.println("3. Multiply");
//        System.out.println("4. Divide");
//        System.out.print("Enter your choice: ");
//        int choice = sc.nextInt();
//
//        double result = 0;
//
//        switch (choice) {
//            case 1:
//                result = calc.add(n1, n2);
//                System.out.println("Result = " + result);
//                break;
//
//            case 2:
//                result = calc.subtract(n1, n2);
//                System.out.println("Result = " + result);
//                break;
//
//            case 3:
//                result = calc.multiply(n1, n2);
//                System.out.println("Result = " + result);
//                break;
//
//            case 4:
//                result = calc.divide(n1, n2);
//                System.out.println("Result = " + result);
//                break;
//
//            default:
//                System.out.println("Invalid choice!");
//        }
//
//        sc.close();
//    }
//}
//WAP TO LAPTOP DETAILS.
import java.util.Scanner;

class Laptop {
    String brand;
    int ram;
    double price;

    // Constructor
    Laptop(String brand, int ram, double price) {
        this.brand = brand;
        this.ram = ram;
        this.price = price;
    }

    // Display method
    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("RAM: " + ram + " GB");
        System.out.println("Price: " + price);
        System.out.println("----------------------------");
    }
}

public class JavaBasic6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many laptops? ");
        int n = sc.nextInt();
        sc.nextLine(); // clear buffer

        Laptop[] arr = new Laptop[n];

        System.out.println("\n======= ENTER LAPTOP DETAILS =======");

        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Laptop " + (i + 1) + " ---");

            System.out.print("Enter Brand: ");
            String brand = sc.nextLine();

            System.out.print("Enter RAM (GB): ");
            int ram = sc.nextInt();

            System.out.print("Enter Price: ");
            double price = sc.nextDouble();
            sc.nextLine(); // clear buffer

            // Create object using constructor
            arr[i] = new Laptop(brand, ram, price);
        }

        System.out.println("\n======= LAPTOP DETAILS =======\n");

        for (int i = 0; i < n; i++) {
            System.out.println("Laptop " + (i + 1) + ":");
            arr[i].display();
        }

        sc.close();
    }
}
