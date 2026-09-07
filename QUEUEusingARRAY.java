public class QUEUEusingARRAY {
    int arr[];
    int front=0;
    int last=-1;
    int a;
    QUEUEusingARRAY(int data){
        a=data;
        arr=new int[a];
    }

    void enque(int data){
        if(last==a-1){
            throw new ArrayIndexOutOfBoundsException("Array out of bound");
        }
        last++;
        arr[last]=data;
        System.out.println("element inserted");
    }

    void dequeue(){
        if(front==0&&last==-1||last<front){
            System.out.println("queue is empty");
            return;
        }

        System.out.println(arr[front]);
        front++;
    }

    public static void main(String[] args) {
        QUEUEusingARRAY q1=new QUEUEusingARRAY(4);
        q1.enque(12);
        q1.enque(14);
        q1.enque(13);
        q1.dequeue();
    }

}

