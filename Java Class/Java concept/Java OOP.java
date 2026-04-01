// class,object,method,this concept.
//class Pen{
//    String color;
//    String type;  // ballpoint; gel
//
//    public void write(){
//        System.out.println("write Somethings");
//    }
//    public void printcolor(){
//       System.out.println(this.color);
//    }
//    public void printtype() {
//        System.out.println(this.type);
//    }
//}
//class StudentA{
//    String name;
//    int age;
//
//    public void printInfo(){
//        System.out.println(this.name);
//        System.out.println(this.age);
//    }
//}
//class JavaOOP{
//    public static void main(String[] args){
//        Pen p1 = new Pen();
//       p1.color = "blue";
//       p1.type = "gel";
//
//       Pen p2 = new Pen();
//       p2.color = "red";
//       p2.type = "ballpoint";
//
//       p1.printcolor();
//       p1.printtype();
//       p2.printcolor();
//       p2.printtype();
//       p1.write();
//       p2.write();
//        StudentA s1 = new StudentA();
//        s1.name = "Harsh";
//        s1.age = 18;
//
//        s1.printInfo();
//    }
//}
       // Contructor and Destructor.
class StudentB {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
//    StudentB(){  // Non perimetric constructor and Default
//        System.out.println("Constructor Called");
//    }
//    StudentB(String name, int age) {  //perametric constructor.
//        this.name = name;
//        this.age = age;
//    }
    StudentB(Student s2) {

    }
}
 class JavaOOP{
    public static void main(String[] args) {
//        StudentB obj = new StudentB();
//       obj.name = "Shraddha";
//       obj.age = 19;
//       obj.printInfo();
//        StudentB s1 = new StudentB("Harsh", 19);
//        s1.printInfo();
        StudentB s1 = new StudentB();
        s1.name = "Harsh";
        s1.age = 19;
        StudentB s2 = new StudentB();
        s2.printInfo();
    }
}
