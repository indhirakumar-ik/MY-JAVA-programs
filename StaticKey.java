package indhirakumar;

class gameplay{
	static int a=0;
	int b=0;
	void game() {
		a=a+1;
		b=b+1;
		System.out.println("value of a  "+a);
		System.out.println("value of b  "+b);
	}
}


public class StaticKey {

	public static void main(String[] args) {
		System.out.println(gameplay.a);
		gameplay.a=2;
		gameplay.a=5;
		gameplay g1=new gameplay();
		gameplay g2=new gameplay();
		gameplay g3=new gameplay();
		g1.game();
		g2.game();
		g3.game();
		
	}

}
