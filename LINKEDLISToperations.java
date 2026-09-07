public class LINKEDLISToperations{

    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    Node head=null;

    void add(int value){
        Node newNode=new Node(value);
        newNode.next=head;
        head=newNode;
    }

    void insert(int value,int position){
        Node newnode=new Node(value);
        Node temp=head;
        for(int i=0;i<position-1;i++){
            temp=temp.next;
            
        }
        newnode.next = temp.next;
        temp.next = newnode;
    }

    void delete(int value){
        Node temp=head;
        for(int i=0;i<value-1;i++){
            temp=temp.next;
        }
            temp.next=temp.next.next;
    }

    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
        
    }

    void reverse(){
        Node prev=null;
        Node current=head;
        Node next;
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        head=prev;
        
    }
    public static void main(String[] args) {
        LINKEDLISToperations l1=new LINKEDLISToperations();
        l1.add(10);
        l1.add(11);
        l1.add(12);
        l1.add(13);
        l1.display();
        l1.add(30);
        l1.display();
        l1.insert(25, 2);
        l1.delete(3);
        l1.display();
        l1.reverse();
        l1.display();
    }
}