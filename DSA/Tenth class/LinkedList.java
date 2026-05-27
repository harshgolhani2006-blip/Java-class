import java.util.List;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
class LinkedList{
    Node head;
    void insert(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    void addAtBeginning(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    void deleteAtBeginning(int key){
        Node temp = head, prev = null;
        if(temp != null && temp.data == key){
            head = temp.next;
            return;
        }
        while(temp != null && temp.data != key){
            prev = temp;
            temp = temp.next;
        }
        if(temp == null) return;
        prev.next = temp.next;
    }
    void search(int key){
        Node temp = head;
        while(temp != null){
            if(temp.data == key){
                System.out.println("Element found: " + temp.data);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Element not found: " + key);
    }
    void reverse(){
        Node prev = null, current = head, next = null;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }
    void middle(){
        Node slow = head, fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("Middle element: " + slow.data);
    }
        boolean hasLoop(){
            Node slow = head;
             Node fast = head;
            while(fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
                if(slow == fast){
                    return true;
                }
            }
            return false;
        }
        void nthNode(int n){
            Node temp = head;
            int count = 1;
            while(temp != null){
                if(count == n){
                    System.out.println("Nth node: " + temp.data);
                    return;
                }
                count++;
                temp = temp.next;
            }
            System.out.println("Nth node not found: " + n);
        }
        void merge(LinkedList list1, LinkedList list2){
            Node temp1 = list1.head;
            Node temp2 = list2.head;
            while(temp1 != null && temp2 != null){
                if(temp1.data < temp2.data){
                    insert(temp1.data);
                    temp1 = temp1.next;
                }else{
                    insert(temp2.data);
                    temp2 = temp2.next;
                }
            }
            while(temp1 != null){
                insert(temp1.data);
                temp1 = temp1.next;
            }
            while(temp2 != null){
                insert(temp2.data);
                temp2 = temp2.next;
            }
        }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.display();
        System.out.println();
        list.addAtBeginning(5);
        list.display();
        System.out.println();
        list.deleteAtBeginning(10);
        list.display();
        System.out.println();
        list.search(20);
        System.out.println();
        list.reverse();
        list.display();
        System.out.println();
        list.middle();

       list.head.next.next.next = list.head; // Creating a loop for testing
        if(list.hasLoop()){
            System.out.println("Loop Detected");
        }else{
            System.out.println("Loop not Detected");
        }
        list.nthNode(2);
        list.display();
        list.merge(list, list);
        list.display();
    }
}