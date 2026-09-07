package indhirakumar;

class Recursion{
	public static int number(int n) {
		if(n==10) {
			return 1;
		}else {
			number(n+1);
			return n;
		}
	}
}
class factorial{
	void fact(int n){
		if(n==0) {
			System.out.println(1);
		}else {
			n=n*n;
			System.out.println(n);
			fact(n-1);
		}
	}
}

public class RecursionJava {
	public static void main(String[] args) {
		Recursion a1=new Recursion();
		System.out.println(a1.number(1));
		factorial f1=new factorial();
		f1.fact(5);
		
	}

}
