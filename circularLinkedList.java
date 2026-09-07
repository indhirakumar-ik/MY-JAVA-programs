public class circularLinkedList {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node tail=null;

    void add(int data){
        Node newNode=new Node(data);
        if(tail==null){
            newNode.next=newNode;
            tail=newNode;
            return;
        }
        newNode.next = tail.next;
          tail.next = newNode;
          tail = newNode;
    }

    void display(){
        Node temp=tail;
        do{
            System.out.print(temp.data+"->");
            temp=temp.next;
        }while(temp!=tail);
    }

    public static void main(String[] args) {
        circularLinkedList c1=new circularLinkedList();
        c1.add(10);
        c1.add(12);
        c1.add(13);
        c1.add(14);
        c1.add(15);
        c1.display();
    }
}
