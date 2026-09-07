package indhirakumar;
import java.util.Scanner;


abstract class cars{
	abstract void carName(int price,String model);
	void carGarage() {
		System.out.println("Welcome to our car garrage");
		System.out.println("We have new modern cars");
	}
}
class BMW extends cars{
	int carprice;
	String model;
	void carName(int carprice,String model) {
		this.carprice=carprice;
		this.model=model;
		if(this.carprice>=4500000) {
			System.out.println("the model is "+model);
			System.out.println("You can buy the car");
		}else {
			System.out.println("but cannot sell to you");
		}
	}
}



public class classOjects1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		/*BMW b1=new BMW();
		b1.carGarage();
		System.out.print("Give your money :");
		int price=scan.nextInt();
		System.out.print("give your model :");
		String model=scan.next();
		b1.carName(price,model);*/
		int java=scan.nextInt();
		int cpp=scan.nextInt();
		int python=scan.nextInt();
		if(java>=100) {
			System.out.println("java      "+java);
		}else {
			System.out.println("java     "+"0"+java);
		}
		if(cpp>=100) {
			System.out.println("cpp      "+cpp);
		}else {
			System.out.println("cpp     "+"0"+cpp);
		}
		if(python>=100) {
			System.out.println("python      "+python);
		}else {
			System.out.println("python     "+"0"+python);
		}
		
		
		
		
	}

}
