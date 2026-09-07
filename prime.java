import java.util.Scanner;
class prime{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        if(num/1==num && num/num==1){
            System.out.println("this is a prime numer");
        }else{
            System.out.println("this is not a prime numer");
        }
    }
}