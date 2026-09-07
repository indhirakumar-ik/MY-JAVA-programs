
public class StudentManagement {
    public static void main(String[] args) {
        StudentManagement s1=new StudentManagement();
        s1.add(7239, "Indhirakumar", 9);
        s1.add(7240, "Suhail", 10);
        s1.add(7241, "Pranesh", 9);
        s1.delete(7239);
        s1.display();
    }
    class Node{
        int reg_no;
        String name;
        int cgpa;
        Node next;
        Node(int reg_no,String name,int cgpa){
            this.reg_no=reg_no;
            this.name=name;
            this.cgpa=cgpa;
            this.next=null;
        }
    }

    Node head=null;

    void add(int reg_no,String name,int cgpa){
        Node newNode=new Node(reg_no, name, cgpa);
        newNode.next=head;
        head=newNode;
    }

    void display(){
        Node temp=head;
        if(temp==null){
            System.out.println("No student added");
            return;
        }
        while (temp!=null) {
            System.out.println("name : "+temp.name);
            System.out.println("Register number : "+temp.reg_no);
            System.out.println("student cgpa : "+temp.cgpa);
            temp=temp.next;
        }
    }

    void search(int reg_no){
        Node temp=head;
        while(temp!=null){
            if(temp.reg_no==reg_no){
                System.out.println("name : "+temp.name);
                System.out.println("Register number : "+temp.reg_no);
                System.out.println("student cgpa : "+temp.cgpa);
                return;
            }
            temp=temp.next;
        }
    }

    void update(int reg_no,String name,int cgpa,int  targetregno){
        Node temp=head;

        if(temp==null){
            add(reg_no, name, cgpa);
        }

        while(temp!=null){
            System.out.println(temp.name);
            if(targetregno==temp.reg_no){
                temp.reg_no=reg_no;
                temp.name=name;
                temp.cgpa=cgpa;
                return;
            }
            temp=temp.next;
        }
    }

    void delete(int reg_no){
        Node temp=head;
        if(temp==null){
            System.out.println("No student is added");
            return;
        }
        while(temp.next!=null){
            if(temp.next.reg_no==reg_no){
                temp.next=temp.next.next;
                return;
            }
            temp=temp.next;
        }

    }

}
