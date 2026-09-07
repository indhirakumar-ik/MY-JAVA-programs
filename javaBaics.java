package indhirakumar;
import java.util.Scanner;
class name{
	void name(String a){
		String b=" ";
		System.out.println("your reverse order is");
		for(int i =a.length()-1;i>=0;i--) {
			char c=a.charAt(i);
			System.out.print(c);
		}
		
	}
}
public class javaBaics {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter your name:");
	String my_name=scan.next();
	name n=new name();
	n.name(my_name);
	
		}

}
