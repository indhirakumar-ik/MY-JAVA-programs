import java.util.Scanner;
class student{
    void passorfail(int mark){
        if(mark>35){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }
    }
    void sum(){
        int a=10;
        int b=20;
        System.out.println(a+b);
    }
    void addition(int a,int b){
        System.out.println(a+b);
    }
    int sales(int money){
        int soap_price=40;
        int give=money-40;
        return give;
    }
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int mark=scan.nextInt();
        student obj=new student();
        obj.passorfail(mark);
        obj.sum();
        int a=10,b=20;
        obj.addition(a,b);
        int balance=obj.sales(50);
        System.out.println(balance);
    }
}