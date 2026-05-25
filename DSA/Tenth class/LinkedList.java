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
    }
}