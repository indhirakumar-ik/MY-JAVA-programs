package indhirakumar;

import java.util.Scanner;
interface playable{
	void play();
	static void things(){
		System.out.println("this is playable stoor you can uy everythings you want");
		
	}
}
class guitar implements playable{
	public void play() {
		System.out.println("this is guitar");
	}
}
class piano implements playable{
	public void play() {
		System.out.println("this is piano");
	}
}

interface ooty{
	String places="kotagiri";
	int people=50000;
	void kodanad();
}
class fingerpost implements ooty{
	public void kodanad() {
		System.out.println("this is kodanad");
	}
}
public class classObject1 {

	public static void main(String[] args) {
		fingerpost f1=new fingerpost();
		f1.kodanad();
		System.out.println(f1.places);
		guitar g1=new guitar();
		piano p1=new piano();
		p1.play();
		g1.play();
		playable p=new playable() {
			public void play() {
				System.out.println("hello");
			};
		};
		p.play();
		playable p2=()->{
			System.out.println("hi");
		};
		p2.play();
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		double c=a/b;
		System.out.println("division of a,b is "+c);
		int x=1;
		String y="20";
		System.out.println("my name is \"indhirakumar\" helloeveryone");
		System.out.println("hello \n everyone \t iam ik \b iam 19 years old \r i comming from \f nilgiri" );
		String text = "This is the first part.\f\rThis is the second part, on a 'new page'.";
        System.out.println(text);
        int d=10,e=20,f=30,g=40;
        System.out.println(Math.max(d,e));
        System.out.println(Math.sqrt(f));
        double h=23.456622;
        System.out.println(Math.round(h));
        int i=(int)(Math.random()*100);
        System.out.println(i);
        
        
        
	}

}