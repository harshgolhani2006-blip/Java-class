package Src.p1.p2;
public class B {
    public void sleep() {
        System.out.println("Sleeping");
    }

    private void sleep2() {
        System.out.println("sleeping2");
    }

    public void callSleep2() {   // Public method calling private method
        sleep2();
    }
    void eat() {          // default
        System.out.println("Eating");
    }

    public void callEat() {
        eat();            // default  call
    }
}