import java.util.Scanner;
class factorial{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        int factorial=1;
        for(int i=1;i<=num;i++){
            factorial=factorial*i;
        }System.out.println(factorial);
    }
}