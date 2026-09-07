public class linkedList {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    Node head=null;
    int count=0;
    
        void add(int value){
            Node newNode=new Node(value);
            newNode.next=head;
            head=newNode;
            count++;
        }
        
        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
            System.out.println("null");
        }
        
        void insertAtposition(int data,int position){
            Node temp=head;
            if(0>position){
                System.out.println("invalid index cannot insert");
                return;
            }
            Node newNode=new Node(data);
            for(int i=0;i<position-1;i++){
                temp=temp.next;
            }
            newNode.next=temp.next;
            temp.next=newNode;
        }

        void deleteAtposition(int position){
            Node temp =head;
            for(int i=0;i<position-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            
        }

        void reverse(){
            Node prev=null;
            Node curr=head;
            Node next=null;
            while(curr!=null){
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            head=prev;
        }

    public static void main(String[] args) {
        linkedList l1=new linkedList();
        l1.add(10);
        l1.add(11);
        l1.add(12);
        l1.add(13);
        l1.add(14);
        l1.insertAtposition(102, 3);
        l1.display();
        l1.deleteAtposition(3);
        l1.display();
        l1.add(30);
        l1.add(40);
        l1.display();
        l1.display();
        l1.insertAtposition(100, 4);
        l1.display();
        


    }

}
