public class DOUBLElinkedList{
    class Node{
        int data;
        Node prev;
        Node next;
        Node(int data){
            this.data=data;
            this.prev=null;
            this.next=null;
        }
    }
    Node head=null;
    void insert(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }

        newNode.next=head;
        head.prev=newNode;
        head=newNode;

    }

    

    void display(){
        Node temp=head;
        System.out.print("Null<->");
        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("Null");
    }
    

    public static void main(String[] args) {
        DOUBLElinkedList d1=new DOUBLElinkedList();
        d1.insert(10);
        d1.insert(11);
        d1.insert(12);
        d1.insert(13);
        d1.insert(14);
        d1.insert(15);
        d1.display();

    }
}