//RESEARCHTION.
//PRINT ARRAYLIST.

//import java.util.ArrayList;
//
//public class Java12 {
//    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(5);
//        list.add(10);
//        list.add(1,30);
//        list.add(2,60);
//        //System.out.println(list.get(1));   // Only one index seen in this.
//        System.out.print(list);
//    }
//}
//PRINT LINKLIST.
//class Node {
//    int data;
//    Node next;
//    public Node(int data) {
//        this.data = data;
//        this.next = null;
//    }
//}
//
//class MyList {
//    Node head;
//
//    public void addToLast(int data) {
//        Node newNode = new Node(data);
//
//        if (head == null) {
//            head = newNode;
//            return;
//        }
//
//        Node curr = head;
//        while (curr.next != null) {
//            curr = curr.next;
//        }
//        curr.next = newNode;
//    }
//
//    public void print() {
//        Node curr = head;
//        System.out.print("List of linklist:-");
//        while (curr != null) {
//            System.out.print(curr.data + " ");
//            curr = curr.next;
//        }
//        System.out.println();
//    }
//}
//
//public class Java12 {
//    public static void main(String[] args) {
//        MyList mylist = new MyList();
//        mylist.addToLast(10);
//        mylist.addToLast(20);
//        mylist.addToLast(30);
//        mylist.addToLast(40);
//        mylist.addToLast(50);
//        mylist.print();
//    }
//}
//Arraylist.
//import java.util.ArrayList;
//import java.util.List;
//
//public class Java12{
//    public static void main(String[] args) {
//
//        ArrayList<Integer> list = new ArrayList<>();
//
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        list.add(40);
//        list.add(50);
//
//        System.out.println(list);
//    }
//}
// Array List.all function.
//import java.util.ArrayList;
//
//public class Java12 {
//    public static void main(String[] args) {
//
//        ArrayList<Integer> list = new ArrayList<>();
//
//        // 1. Add elements
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        System.out.println("After add: " + list);
//
//        // 2. Add element at index
//        list.add(1, 15); // insert 15 at index 1
//        System.out.println("After add at index: " + list);
//
//        // 3. Get element
//        int x = list.get(2);
//        System.out.println("Get index 2: " + x);
//
//        // 4. Set element (update)
//        list.set(2, 25); // replace index 2 value
//        System.out.println("After update: " + list);
//
//        // 5. Remove by index
//        list.remove(1); // remove value at index 1
//        System.out.println("After remove index 1: " + list);
//
//        // 6. Remove by value
//        list.remove(Integer.valueOf(30));
//        System.out.println("After remove value 30: " + list);
//
//        // 7. Check if element exists
//        System.out.println("Contains 20? " + list.contains(20));
//
//        // 8. Size of ArrayList
//        System.out.println("Size: " + list.size());
//
//        // 9. Loop through ArrayList
//        System.out.print("List elements: ");
//        for(int val : list) {
//            System.out.print(val + " ");
//        }
//        System.out.println();
//
//        // 10. Clear all elements
//        list.clear();
//        System.out.println("After clear: " + list);
//    }
//}
import java.util.ArrayList;
import java.util.Scanner;

public class Java12{
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- ArrayList Operations ---");
            System.out.println("1. Add Multiple element");
            System.out.println("2. Add element at index");
            System.out.println("3. Remove element");
            System.out.println("4. Update element");
            System.out.println("5. Search element");
            System.out.println("6. Print ArrayList");
            System.out.println("7. Clear ArrayList");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("How many nodes you want to add? ");
                    int n = sc.nextInt();
                    System.out.println("Enter " + n + " values:");
                    for (int i = 0; i < n; i++) {
                        int x = sc.nextInt();
                        list.add(x);
                    }
                    System.out.println(n + " nodes added successfully!");
                    break;


                case 2:
                    System.out.print("Enter index: ");
                    int idx = sc.nextInt();
                    System.out.print("Enter value: ");
                    int value = sc.nextInt();
                    if (idx >= 0 && idx <= list.size()) {
                        list.add(idx, value);
                        System.out.println("Added at index!");
                    } else {
                        System.out.println("Invalid index!");
                    }
                    break;

                case 3:
                    System.out.print("Enter value to remove: ");
                    int rem = sc.nextInt();
                    if (list.contains(rem)) {
                        list.remove(Integer.valueOf(rem));
                        System.out.println("Removed!");
                    } else {
                        System.out.println("Value not found!");
                    }
                    break;

                case 4:
                    System.out.print("Enter index to update: ");
                    int updateIndex = sc.nextInt();
                    if (updateIndex >= 0 && updateIndex < list.size()) {
                        System.out.print("Enter new value: ");
                        int newVal = sc.nextInt();
                        list.set(updateIndex, newVal);
                        System.out.println("Updated!");
                    } else {
                        System.out.println("Invalid index!");
                    }
                    break;

                case 5:
                    System.out.print("Enter value to search: ");
                    int search = sc.nextInt();
                    if (list.contains(search)) {
                        System.out.println("Found at index: " + list.indexOf(search));
                    } else {
                        System.out.println("Not found!");
                    }
                    break;

                case 6:
                    System.out.println("ArrayList: " + list);
                    break;

                case 7:
                    list.clear();
                    System.out.println("ArrayList cleared!");
                    break;

                case 8:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 8);
    }
}
