package indhirakumar;

class stack{
	int n;
	int arr[]=new int[10];
	stack(){
		n=-1;
	}
	void push(int a) {
		if(n==9) {
			System.out.println("program stops");
		}else {
			arr[++n]=a;
			System.out.println(arr[n]);
		}
	}
}

public class StackClass {

	public static void main(String[] args) {
			stack s1=new stack();
			for(int i=1;i<=20;i++) {
				s1.push(i);
			}
	}

}
