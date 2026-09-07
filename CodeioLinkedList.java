package indhirakumar;

class Nodes{
	int data;
	Nodes next;
	Nodes(int data){
		this.data=data;
		this.next=null;
	}
}

class linked{
	Nodes head=null;
	 void add(int data) {
		Nodes newNode=new Nodes(data);
		newNode.next=head;
		head=newNode;
	}
	
	 void display() {
		Nodes temp=head;
		while(temp!=null) {
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
	}
}

public class CodeioLinkedList {
	
	public static void main(String[] args) {
		linked l1=new linked();
		l1.add(10);
		l1.add(11);
		l1.add(12);
		l1.display();
		
	}

}
