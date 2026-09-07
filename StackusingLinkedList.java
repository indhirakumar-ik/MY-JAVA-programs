public class StackusingLinkedList {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head=null;
    void push(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head =newNode;
    }
    void pop(){
        System.out.println(head.data);
        head=head.next;
    }
    void peek(){
        System.out.println(head.data);
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-> null");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        StackusingLinkedList s1=new StackusingLinkedList();
        s1.push(10);
        s1.push(14);
        s1.push(13);
        s1.push(12);
        s1.peek();
        s1.pop();
        s1.pop();
        s1.display();
        s1.pop();
        s1.display();
    }
}
