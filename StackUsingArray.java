public class StackUsingArray {

    int max;
    int [] arr;
    int top;
    StackUsingArray(int data){
        max=data;
        arr=new int[data];
        top=-1;
    }

    void push(int data){
        if(top==max-1){
            System.out.println("overflow");
            return;
        }
        top++;
        arr[top]=data;
        System.out.println("sucessfully pushed");
    }

    void pop(){
        System.out.println(arr[top]);
        top--;
    }


    public static void main(String[] args) {
        StackUsingArray s1=new StackUsingArray(2);
        s1.push(10);
        s1.push(11);
        s1.push(12);
        s1.pop();
    }
}
