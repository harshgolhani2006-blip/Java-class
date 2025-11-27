import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//Sorted String
//class Student1 implements Comparable<Student1>{
//    String name;
//    int RollNo;
//    public Student1(String name, int RollNo) {
//        this.name = name;
//        this.RollNo = RollNo;
//    }
//    public int compareTo(Student1 s1) {
//        return this.RollNo - s1.RollNo;
//    }
//    public String toString() {
//        return this.name + " " + this.RollNo;
//    }
//}
//public class Java14 {
//    public static void main(String[] args) {
//        ArrayList<Student1>List = new ArrayList<Student1>();
//        List.add(new Student1("Jack", 1));
//        List.add(new Student1("John", 2));
//        Collections.sort(List);
//        System.out.println(List);
//    }
//}

        class Student1 {
            String name;
            int Rollno;

            public Student1(int Rollno, String name) {
                this.name = name;
                this.Rollno = Rollno;
            }

            public String toString() {
                return Rollno + "-" + name;
            }
        }

        class NameStored implements Comparator<Student1> {
            public int compare(Student1 s1, Student1 s2) {
                return s1.name.compareTo(s2.name);
            }
        }

        public class Java14 {
            public static void main(String[] args) {

                ArrayList<Student1> List = new ArrayList<>();

                List.add(new Student1(3, "Rohit"));
                List.add(new Student1(1, "Aman"));
                List.add(new Student1(2, "Harsh"));

                System.out.println("Before Sorting : " + List);

                Collections.sort(List, new NameStored());

                System.out.println("After Sorting (By Name) : " + List);
            }
        }
