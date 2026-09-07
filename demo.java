package indhirakumar;
import java.util.Scanner;
public class demo {

	public static void main(String[] args) {
		monkey obj=new monkey();
		obj.animal1("cat");
		
	}

}
class animal{
	void animal1(String b) {
		if(b.equals("husky")) {
			System.out.println("this is husky");
		}else {
			System.out.println("not an husky");
		}
		System.out.println("this animal can eat");
	}
}
class monkey extends animal{
	void monkey() {
		System.out.println("monkey can jump");
	}
}
class dog extends animal{
	void dog() {
		System.out.println("dog is barks");
	}
}
class puppy extends dog{
	void puppy() {
		System.out.println("puppy is cute");
	}
}
