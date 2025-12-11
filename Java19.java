import java.util.Scanner;

//Multi-Threading:one language at a one time using multiple statement is called...
//Get name of processor.
//class MyThread extends Thread{
//    public void run(){
//        System.out.println(Thread.currentThread().getName());
//    }
//}
//class Java19{
//    public static void main(String[] args){
//        MyThread t1 = new MyThread();
//        System.out.println(Thread.currentThread().getName());
//        t1.start();
//    }
//}
//here stop thread.
//class MyThread extends Thread{
//    public void run(){
//        for(int i=0;i<=5;i++){
//            System.out.println(i+"T1");
//        }
//    }
//}
//class Java19{
//    public static void main(String[] args){
//        MyThread t1 = new MyThread();
//        t1.start();
//        for(int i=0;i<=5;i++){
//            System.out.println(i+"T2");
//          try {
//              t1.join();
//          }catch (Exception e){
//          }
//        }
//    }
//}
//timers.
//class MyThread extends Thread{
//    public void run(){
//        for(int i=0;i<=5;i++){
//            System.out.println(i+"T1");
//        }
//        try {
//            Thread.sleep(1000);
//        } catch (Exception e) {}
//        }
//    }
//class Java19 {
//    public static void main(String[] args) {
//        MyThread t1 = new MyThread();
//        t1.start();
//        for (int i = 0; i <= 5; i++) {
//            System.out.println(i + "T2");
//            try {
//                Thread.sleep(1000);
//            } catch (Exception e) {}
//        }
//    }
//}
//Downloading with timer.
//class MyThread extends Thread{
//    public void run(){
//        for(int i=0;i<=10;i++){
//            System.out.println("Downloading file..."+(i*10));
//            System.out.println("timer:"+i);
//        }
//        try {
//            Thread.sleep(2000);
//        } catch (Exception e) {}
//    }
//}
//class Java19 {
//    public static void main(String[] args) {
//         MyThread t1 = new MyThread();
//        t1.start();
//            try {
//                Thread.sleep(2000);
//            } catch (Exception e) {}
//        }
//    }
//Multi threading problem.
class Bank {
    int balance = 1000000;

  synchronized   void withdraw(int amount) {        //synchronized : it is used solved the threading problem.
        System.out.println(Thread.currentThread().getName() + " is trying to withdraw...");

        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " withdrawal successful!");
            balance -= amount;
            System.out.println("Remaining Balance: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " – Not enough balance.");
        }
    }
}

class MyThread extends Thread {
    Bank bank;
    MyThread(Bank b) { this.bank = b; }

    public void run() {
        bank.withdraw(1000000);
    }
}

public class Java19 {
    public static void main(String[] args) {
        Bank bank = new Bank();

        MyThread t1 = new MyThread(bank);
        MyThread t2 = new MyThread(bank);

        t1.setName("Roshni");
        t2.setName("Shraddha");

        t1.start();
        t2.start();
    }
}
