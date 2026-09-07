package indhirakumar;

import java.util.Scanner;


class arm{
	void arm1(int a) {
		int n=a;
		int original=a;
		double k=0;
		while(0<n) {
			int rem=n%10;
			k=k+Math.pow(rem,3);
			n=n/10;
		}if(k==original) {
			System.out.println("This is a armstrong number");
		}else {
			System.out.println("This is not a armstrong number");
		}
	}
}

class palindrome1{
	palindrome1(String a){
		String name="";
		for(int i=a.length()-1;i>=0;i--) {
			char c=a.charAt(i);
			name=name+c;
		}System.out.println(name);
	}
}
class divisibleby{
	void divisible(){
		int n=9;
		for(int i=1;i<=n;i++) {
			if(3*i==n) {
				System.out.println("divisible by 3");
			}
		}
		System.out.println(Math.max(9,3));
	}
}

public class multiplyBy3and7 {

	public static void main(String[] args) {
		divisibleby d1=new divisibleby();
		d1.divisible();
		arm a=new arm();
		a.arm1(163);
		palindrome1 p1=new palindrome1("doctor");
		Scanner scan=new Scanner(System.in);
		
		//check wheather the character is number,alphabhet or specal character
		System.out.println("enter your character");
		char c=scan.next().charAt(0);
		if(Character.isLetter(c)) {
			System.out.println("Letter");
		}else if(Character.isDigit(c)) {
			System.out.println("Digit");
		}else {
			System.out.println("Special character");
		}
	}

}
