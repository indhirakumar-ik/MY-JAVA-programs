import java.util.Scanner;
class fibonacci{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter your range");
        int range=10;
        int first=0;
        int second=1;
        int next;
            for(int i=0;i<range;i++){
                System.out.println(first);
                next=first+second;
                first=second;
                second=next;
            }
        }
    }