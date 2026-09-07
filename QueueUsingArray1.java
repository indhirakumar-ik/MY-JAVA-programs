import java.io.EOFException;
import java.util.EmptyStackException;

public class QueueUsingArray1 {
    int arr[];
    int last=-1;
    int a;
    QueueUsingArray1(int length){
        int a=length;
        arr=new int[a];
    }
    void enque(int value){
        last++;
        arr[last]=value;
        System.out.println("element inserted");
    }
    void dequeue(){

        if(last<0){
            throw new ArrayIndexOutOfBoundsException("Array idex out of bound");
        }
        int temp=arr[0];
        System.out.println(temp);
        for(int i=1;i<=last;i++){
            arr[i-1]=arr[i];
        }
        last--;
    }
    public static void main(String[] args) {
        QueueUsingArray1 q1=new QueueUsingArray1(3);
        q1.enque(1);
        q1.enque(2);
        q1.enque(3);
        q1.dequeue();
        q1.dequeue();
        q1.dequeue();
        q1.dequeue();
    }
}
