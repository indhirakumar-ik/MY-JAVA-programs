import java.util.Scanner;
class ik{
    public static void main(String args[]){
        int a=12;
        int count=0;
        for(int i=1;i<=a;i++){
            if(a%a==0 && a%i==0){
                count=count+1;
            }
        }if(count==2){
                System.out.println("this is a primenumer");
            }else{
                System.out.print("this is not a prime numer");
            }
        }
}
