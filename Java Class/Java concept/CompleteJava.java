import java.util.Arrays;
import java.util.Scanner;

//public class CompleteJava {
//    public static void main(String[] args){
//      //  System.out.println("Hello World Java");
//        // println is used for break line and get new line.
//        //Variable
//        String name="Harsh";
//        String neighbour= "Harshit";
//        int age = 30;
//        String Friend ="A";
//        System.out.println(" " +name);
//        System.out.println(" " +neighbour);
//        System.out.println(" " +Friend);
//        System.out.println(" " +age);
//
//    }
//}
//Java Types:- Their are two type : 1-Primitive,2-Non-Primitive/Reference.
// public static void main(String[] args) {
//1 Primitive values:-
//byte-1 [-128 to 127]
//short-2
//int-4  1,2,3,4
//Long-8
//float-4 3.14
//double-8
//char-2  a,b,c
//boolean-1  true/false
//        byte age = 30;
//        int phone = 1234567890;
//        long phone2 = 123456789001l;
//        float pi = 3.14f;
//        char letter = 'A';
//        boolean isAdult = true;
//        System .out .println(age);
//        System .out .println(phone);
//        System .out .println(phone2);
//        System .out .println(pi);
//        System .out .println(letter);
//        System.out.println(isAdult);

// 2 Non Primitive values
//        String name = "Harsh 1";
//        String friend = new String("Harsh");
//        System.out.println(name.length());
//        System.out.println(friend.length());
//        Concatenate: Joinning of two string
//        String name1 = "Harsh";
//        String name2 = "Harshit";
//        String name3 = name1 + " and " + name2;
//        System.out.println(name3);
//CharAt:Specific character print used it .
//        String name = "Harsh";
//        System.out.println(name.charAt(0));
//        System.out.println(name.charAt(1));
//        System.out.println(name.charAt(2));
//        System.out.println(name.charAt(3));
//        System.out.println(name.charAt(4));
// Length
//        String name;
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter your name: ");
//        name = input.nextLine();
//        System.out.println( "length of name is : " +name.length());
// Replace.
//        String name = "Harsh";
//        String name2=  name.replace('a','r');
//        System.out.println(name);
//        System.out.println(name2);
// Substring.
//        String name = "Harsh and Harshit";
//        System.out.println(name.substring(0,4));
//        }
//   }
// Array.
//        int physic = 97;
//        int English = 98;
//        int Maths = 99;
//        int Hindi = 100;
//
//        int [] marks = new int[4];
//        marks[0] = physic;
//        marks[1] = English;
//        marks[2] = Maths;
//        marks[3] = Hindi;
// Without [] is called array .
//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);
//        System.out.println(marks[3]);
//
//        // For find length used
//        System.out.println("Length of array:-"+marks.length);
//
//        // For sort
//        System.out.println(marks[0]);
//        Arrays.sort(marks);
//        System.out.println(marks[0]);
// 2D Array.
//        int [][] finalMarks = {{97,95,96},{45,95,90}};
//        System.out.println(finalMarks[0][0]);
//        System.out.println(finalMarks[1][1]);
//        System.out.println(finalMarks[1][2]);

// Casting . implict Casting :
//        double price = 100;
//        double finalprice = price+18;  // called process.
//
//        System.out.println("The price of your product is: " + price);
//        System.out.println("The final price of your product is: " + finalprice);
//
//        // 2 Explict casting:
//        int p=100;
//        int fp= p + (int)18;   // called process .
//        System.out.println("The price of your product is: " + p);
//        System.out.println("The final price of your product is: " + fp);

//        // Constants:
//        int age =30;
//        age = 31;
//        age = 32;
//
//        float pi =3.14f;
//        pi = 1.14f;   Are Not Constant
//        final float Pi = 3.14f;  // this is comstant.
//        System.out.printf("%.2f%n", Pi);

// Operators : There are four type :
// 1.Arithmetic operators, 2.Assigment operators, 3.Logical operators, 4.Comparision operators

// 1. Arithmetic Operators:-
//        int a =10;
//        int b =10;
//        int sum = a+b;
//        System.out.println(sum);
//        int diff = a-b;
//        System.out.println(diff);
//        int mult = a*b;
//        System.out.println(mult);
//        int div = a/b;
//        System.out.println(div);
//        double a = 10;
//        double b = 20;
//        double module = a%b;
//        System.out.println(module);

// 2.Assigment operators. = etc.

//3. Logical Operators.
//        int num = 10;
//        System.out.println(num);
//        System.out.println(num++); // 1
//        System.out.println(++num);  //2
//        System.out.println(--num);
//        System.out.println(num--);

// Math Class
//        System.out.println(Math.max(5,3));
//        System.out.println(Math.min(5,3));
//        System.out.println((int)(Math.random()*100));

//How to Take input
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Input your age :");
//        int age = sc.nextInt();
//        System.out.println(age);
//        System.out.println("input your name :");
//        String name = sc.next();  // This is only print one words Not a sentence.
//        System.out.println(name);
//        System.out.println("Input your name :");
//        String name2 = sc.nextLine();
//        System.out.println(name2);

// Comparison Operators.
//a == b.
//a != b.
//a < b.
//a > b.
//a <= b.
//a >= b.

// Conditional Statements.
//        boolean isSunUp = true;
//        if (isSunUp){
//            System.out.println("Day");
//        }else{
//            System.out.println("Night");
//        }
//         int age =30;
//         if(age > 18){
//           System.out.println("Can vote");
//         }else{
//             System.out.println("Can  not vote");
//         }
//Logical Operators.
//&&. Both conditions are true .
//        int a = 30;
//        int b = 5;
//
//        if(a < 50 && b < 50)
//        {
//            System.out.println("Both less than 50");
//        }

//||. OR is only check any one statement are true.
//        int a = 60;
//        int b = 40;
//
//        if(a < 50 || b < 50){
//            System.out.println("Atleast one is  less than 50");
//        }

//        Scanner sc = new Scanner(System.in);
//        //pen = 10 ; NoteBook = 40;
//        System.out.println("Enter your Cash:");
//        int cash = sc.nextInt();
//        if (cash < 10) {
//            System.out.println("Cannot Buy anythings");
//            System.out.println("Get More Cash");
//        } else if (cash > 10 && cash < 50) {
//            System.out.println("Can Get 1 Thing");
//        }
//        else {
//            System.out.println("Can Get Both Things");
//        }

// Switch statement.
// 1-monday, 2-Tuesday, 3-Wednesday, 4-Thursday, 5-Friday, 6-Saturday, 7-Sunday.
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the Day: ");
//        int day = sc.nextInt();
//        switch(day){
//            case 1:
//                System.out.println("Monday");
//                break;
//                case 2:
//                    System.out.println("Tuesday");
//                    break;
//                    case 3:
//                        System.out.println("Wednesday");
//                        break;
//                        case 4:
//                        System.out.println("Thursday");
//                        break;
//                        case 5:
//                            System.out.println("Friday");
//                            break;
//                            case 6:
//                                System.out.println("Saturday");
//                                break;
//                                case 7:
//                                    System.out.println("Sunday");
//                                    break;
//                                    default:
//                                        System.out.println("Invalid Day");
//        }
//Loops
// 1.For Loops:
// 100-1
//        for(int i = 0; i <= 100; i++){
//            System.out.println(i);
//        }
//1-100.
//        for(int i = 100; i >=0; i-- ){
//            System.out.println(i);
//        }
// 2. While Loops:
//        int i = 100;
//        while(i >= 0){
//            System.out.println(i);
//            i--;
//        }
//3.do-while loops:
//        int i = 100;
//        do{
//            System.out.println(i);
//            i = i-1;
//        }while(i >= 0);
//        Scanner sc = new Scanner(System.in);
//        int n ;
//        do{
//            System.out.println("Enter Number: ");
//             n = sc.nextInt();
//            System.out.print("Here is your number :");
//            System.out.println(n);
//        }while (n >= 0);
//        System.out.println("End");

// Break & Continue.
//        int i = 0;
//        while (true){
//            if(i==3){
//                i=i+1;
//                continue;
//            }
//            System.out.println(i);
//            i=i+1;
//   if(i>5){
//    break;    // for stop.
//        }
//        }
//Expection Handling.
//Try-Catch-throw.
//        int[] marks = {97, 98, 95};
//        try {
//            System.out.println(marks[6]);
//        } catch (Exception exception) {
//            //do something after catching.
//        }
//                System.out.println("The name is Harsh");
// }
//        }
//Methods
//when only one works are repeated in multiple time then make method .
//class S{
//    public static void printjava(){
//        System.out.println("Hello World");
//            }
//            public static void printname(String name){
//           System.out.println(name);
//            }
//            public static void main(String[] args){
//                printjava();
//                printjava();
//                printjava();
//                printjava();
//                printjava();
//                printjava();
//                printjava();
//                printjava();
//                printname("Harsh");
//                printname("Harsh");
//                printname("Harsh");
//
//            }
//        }
// Number Guessing game.
public class CompleteJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int myNumber = (int)(Math.random()*100);
        int userNumber = 0;
        do{
            System.out.println("Guess my number(1-100) : ");
            userNumber = sc.nextInt();
            if(userNumber == myNumber){
                System.out.println("You guessed it!");
                break;
            }else if(userNumber > myNumber){
                System.out.println("Your number is too large");
            }else{
                System.out.println("Your number is too small");
            }
        }while (userNumber >= 0);
        System.out.println("My number was :");
        System.out.println(myNumber);
    }
}