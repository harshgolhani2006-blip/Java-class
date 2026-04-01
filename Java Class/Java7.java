//class car{
//    public car(){
//        System.out.println("car constructor");
//    }
//    public car(int i){
//        System.out.println(i);
//    }
//    public car(int i,int j){
//        System.out.println(i);
//        System.out.println(j);
//    }
//}
//public class Java7 {
//    public static void main(String[] args) {
//        car c1 = new car();
//        car c2 = new car(45);
//        car c3 = new car(23,34);
//    }
//}
// Inheritance.
//class Animal {
//    void eat(){
//        System.out.println("Animal");
//    }
//}
//class Dog extends Animal {
//    void bark(){
//        System.out.println("hehe");
//    }
//}
//class puppy extends Dog {
//    void sleep(){
//        System.out.println("koi kam nhi");
//    }
//}
//public class Java7 {
//    public static void main(String[] args) {
//        Dog s1= new Dog();
//        s1.eat();
//        puppy s2= new puppy();
//        s2.bark();
//        s2.sleep();
//    }
//}
//Supper position vs this position.
class parent{
    int x=100;
    parent(){
        System.out.println("Parent constructor: x="+x);
    }
}
class child extends parent{
    int x=200;
    child(){
        // this.x refer to childs x
        System.out.println("Child constructor this.x: x="+ this.x);
        //Super.x refers to parent's x
        System.out.println("Child constructor super.x: x="+super.x);
    }
    void show(){
        int x=300;
        System.out.println("Local x="+x);
        System.out.println("this.x="+this.x);
        System.out.println("Super.x= "+super.x);
    }
}

public class Java7{
    public static void main(String[] args) {
        child c = new child(); // call parent then child constructor.
        c.show();
    }
}