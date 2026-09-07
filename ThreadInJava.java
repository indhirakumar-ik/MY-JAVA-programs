package indhirakumar;


class a extends Thread{
	public void run() {
		for(int i=1;i<10;i++) {
			System.out.println("hello everyone");
		}
	}
}
class b extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("iam ik");
		}
	}
}

class c{
	void ik() {
		System.out.println("this is ik");
	}
}
class d{
	void department(){
		System.out.println("AI&DS");
		}
}

public class ThreadInJava {

	public static void main(String[] args) {
		a a1=new a();
		b b1=new b();
		c c1=new c();
		d d1=new d();
		a1.start();
		b1.start();
		c1.ik();
		d1.department();
	}

}
