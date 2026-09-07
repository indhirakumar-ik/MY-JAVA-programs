public class doubleLL {
    class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    Node head=null;
    void insertAtFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        head.prev=newNode;
        newNode.next=head;
        head=newNode;
    }

    void insertAtLast(int data){
        Node newNode=new Node(data);
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.prev=temp;
    }

    void BackwarTraversel(){
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.prev;
        }
    }

    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        doubleLL d1=new doubleLL();
        d1.insertAtFirst(11);
        d1.insertAtFirst(12);
        d1.insertAtFirst(13);
        d1.insertAtFirst(14);
        d1.insertAtFirst(15);
        d1.display();
        d1.insertAtLast(10);
        d1.display();
        d1.BackwarTraversel();
    }
}
