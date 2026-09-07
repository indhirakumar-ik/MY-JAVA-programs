package indhirakumar;

class alphabetPattern{
	void pattern(int n) {
		String[] a={"A","B","C","D","E"};
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(a[i]);
			}System.out.println();
		}
	}
}

class fibanocci{
	void fib(int n) {
		int first=0,second=1;
		int next=0;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				next=first+second;
				first=second;
				second=next;
				System.out.print(second+" ");
			}System.out.println();
		}
	}
}

class stAlpha{
	void pattern(int n) {
		String name="ABCDE";
		for(int i=0;i<name.length();i++) {
			char c=name.charAt(i);
			for(int j=0;j<=i;j++) {
				System.out.print(c);
			}System.out.println();
		}
	}
}

class facto{
	void fact(int n) {
		int c=1;
		int b=0;
		for(int i=1;i<=n;i++) {
			b=b+c*i;
			System.out.println(b);
		}
	}
}

public class Mpattern {

	public static void main(String[] args) {
		int n=5;
		alphabetPattern alpha=new alphabetPattern();
		fibanocci fib=new fibanocci();
		facto f=new facto();
		f.fact(5);
		
		}

}
