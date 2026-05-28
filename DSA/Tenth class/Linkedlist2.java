//wap to check whether the linked list is palindrome or not
import java.util.*;
// class Node{
//     int data;
//     Node next;
//     Node(int data){
//         this.data=data;
//         this.next=null;
//     }
// }
// class Linkedlist2{
//     Node head;
//     void insert(int data){
//         Node newnode=new Node(data);
//         if(head==null){
//             head=newnode;
//             return;
//         }
//         Node temp=head;
//         while(temp.next!=null){
//             temp=temp.next;
//         }
//         temp.next=newnode;
//     }
//     boolean isPalindrome(){
//         Stack<Integer> s=new Stack<>();
//         Node temp=head;
//         while(temp!=null){
//             s.push(temp.data);
//             temp=temp.next;
//         }
//         temp=head;
//         while(temp!=null){
//             if(temp.data!=s.pop()){
//                 return false;
//             }
//             temp=temp.next;
//         }
//         return true;
//     }
//     public static void main(String[] args) {
//         Linkedlist2 ll=new Linkedlist2();
//         ll.insert(1);
//         ll.insert(2);
//         ll.insert(3);
//         ll.insert(2);
//         ll.insert(1);
//         System.out.println(ll.isPalindrome());
//     }
// }

//wap to check whether the linked list is palindrome or not without using stack
// class Node{
//     int data;
//     Node next;
//     Node(int data){
//         this.data=data;
//         this.next=null;
//     }
// }
// class Linkedlist2{
//     Node head;
//     void insert(int data){
//         Node newnode=new Node(data);
//         if(head==null){
//             head=newnode;
//             return;
//         }
//         Node temp=head;
//         while(temp.next!=null){
//             temp=temp.next;
//         }
//         temp.next=newnode;
//     }
//     void display(){
//         Node temp=head;
//         while(temp!=null){
//             System.out.print(temp.data+" ");
//             temp=temp.next;
//         }
//         System.out.println();
//     }
//     boolean isPalindrome(){
//         if(head==null || head.next==null){
//             return true;
//         }
//         Node slow=head;
//         Node fast=head;
//         while(fast!=null && fast.next!=null){
//             slow=slow.next;
//             fast=fast.next.next;
//         }
//         Node prev=null;
//         Node curr=slow;
//         while(curr!=null){
//             Node next=curr.next;
//             curr.next=prev;
//             prev=curr;
//             curr=next;
//         }
//         Node left=head;
//         Node right=prev;
//         while(right!=null){
//             if(left.data!=right.data){
//                 return false;
//             }
//             left=left.next;
//             right=right.next;
//         }
//         return true;
//     }
//     void reverse(){
//         Node prev=null;
//         Node curr=head;
//         while(curr!=null){
//             Node next=curr.next;
//             curr.next=prev;
//             prev=curr;
//             curr=next;
//         }
//         head=prev;
//     }
//     void reverseinGroups(int key){
//         Node prev=null;
//         Node curr=head;
//         Node next=null;
//         int count=0;
//         while(curr!=null && count<key){
//             next=curr.next;
//             curr.next=prev;
//             prev=curr;
//             curr=next;
//             count++;
//         }
//         if(next!=null){
//             head.next=next;
//             reverseinGroups(key);
//         }
//         head=prev;
//     }
//     public static void main(String[] args) {
//         Linkedlist2 ll=new Linkedlist2();
//         ll.insert(1);
//         ll.insert(2);
//         ll.insert(3);
//         ll.insert(2);
//         ll.insert(1);
//         System.out.println(ll.isPalindrome());
//         ll.reverse();
//         ll.display();
//             ll.reverseinGroups(4);
//             ll.display();
//     }
// }

//wap to reverse the print two list then add the two list and return the result as a new list
// class Node{
//     int data;
//     Node next;
//     Node(int data){
//         this.data=data;
//         this.next=null;
//     }
// }
// class Linkedlist2{
//     Node head;
//     void insert(int data){
//         Node newnode=new Node(data);
//         if(head==null){
//             head=newnode;
//             return;
//         }
//         Node temp=head;
//         while(temp.next!=null){
//             temp=temp.next;
//         }
//         temp.next=newnode;
//     }
//     void display(){
//         Node temp=head;
//         while(temp!=null){
//             System.out.print(temp.data+" ");
//             temp=temp.next;
//         }
//         System.out.println();
//     }
//     Linkedlist2 addTwoLists(Linkedlist2 l1, Linkedlist2 l2){
//         Linkedlist2 result=new Linkedlist2();
//         Node temp1=l1.head;
//         Node temp2=l2.head;
//         int carry=0;
//         while(temp1!=null || temp2!=null || carry!=0){
//             int sum=carry;
//             if(temp1!=null){
//                 sum+=temp1.data;
//                 temp1=temp1.next;
//             }
//             if(temp2!=null){
//                 sum+=temp2.data;
//                 temp2=temp2.next;
//             }
//             carry=sum/10;
//             result.insert(sum%10);
//         }
//         return result;
//     }
//     public static void main(String[] args) {
//         Linkedlist2 l1=new Linkedlist2();
//         l1.insert(2);
//         l1.insert(4);
//         l1.insert(3);
//         Linkedlist2 l2=new Linkedlist2();
//         l2.insert(5);
//         l2.insert(6);
//         l2.insert(4);
//         Linkedlist2 result=l1.addTwoLists(l1, l2);
//         result.display();
//     }
// }
 
//wap to rmove duplicates from a sorted linked list
// class Node{
//     int data;
//     Node next;
//     Node(int data){
//         this.data=data;
//         this.next=null;
//     }
// }
// class Linkedlist2{
//     Node head;
//     void insert(int data){
//         Node newnode=new Node(data);
//         if(head==null){
//             head=newnode;
//             return;
//         }
//         Node temp=head;
//         while(temp.next!=null){
//             temp=temp.next;
//         }
//         temp.next=newnode;
//     }
//     void display(){
//         Node temp=head;
//         while(temp!=null){
//             System.out.print(temp.data+" ");
//             temp=temp.next;
//         }
//         System.out.println();
//     }
//     void removeDuplicates(){
//         Node temp=head;
//         while(temp!=null && temp.next!=null){
//             if(temp.data==temp.next.data){
//                 temp.next=temp.next.next;
//             }else{
//                 temp=temp.next;
//             }
//         }
//     }
//     public static void main(String[] args) {
//         Linkedlist2 ll=new Linkedlist2();
//         ll.insert(1);
//         ll.insert(1);
//         ll.insert(2);
//         ll.insert(3);
//         ll.insert(3);
//         ll.display();
//         ll.removeDuplicates();
//         ll.display();
//     }
// }


//wap to divide a linked list into two halves
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class Linkedlist2{
    Node head;
    void insert(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    void divide(){
        if(head==null || head.next==null){
            return;
        }
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node secondHalf=slow.next;
        slow.next=null;
        Linkedlist2 firstList=new Linkedlist2();
        firstList.head=head;
        Linkedlist2 secondList=new Linkedlist2();
        secondList.head=secondHalf;
        System.out.println("First half:");
        firstList.display();
        System.out.println("Second half:");
        secondList.display();
    }
    public static void main(String[] args) {
        Linkedlist2 ll=new Linkedlist2();
        ll.insert(1);
        ll.insert(2);
        ll.insert(3);
        ll.insert(4);
        ll.insert(5);
        ll.insert(6);
        ll.display();
        ll.divide();
    }
}