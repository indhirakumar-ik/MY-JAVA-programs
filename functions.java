import java.util.Scanner;
class functions{
    void evenorodd(int num){
        if(num%2==0){
            System.out.println("this is even");
        }else{
            System.out.println("this is odd");
        }
    }
    String passorfail(int mark){
        if(mark>35){
            return "pass";
        }else{
            return "fail";
        }
    }
    public static void main(String[] args){
        functions obj=new functions();
        Scanner scan=new Scanner(System.in);
        int number=scan.nextInt();
        String name=scan.next();
        String name1=scan.next();
        int mark=scan.nextInt();
        String themark=obj.passorfail(mark);
        System.out.println(themark);
        obj.evenorodd(number);
        System.out.println(name);
        System.out.println(name1);

    }
}