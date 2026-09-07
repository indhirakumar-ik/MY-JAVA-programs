package indhirakumar;

import java.util.Scanner;

class prime{
	void prime1(){
		int n=5;
	for(int i=1;i<=n;i++) {
		int m=i*i;
		System.out.println(m);
	}
	}
	
	int number() {
		return 10;
	}
}

class evenOroddinArray{
	int number=10;
	evenOroddinArray(){
		int arr[]= {1,2,3,4,5,6,7,8};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.println("Even number "+arr[i]);
			}else {
				System.out.println("Odd number "+arr[i]);
			}
		}
	}
}

class countPositiveNegativeNumbers{
	countPositiveNegativeNumbers(){
		int positive=0,negative=0,zeros=0;
		int arr[]= {1,2,3,55,1-3,-4,0,0};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>=1) {
				positive++;
			}else if(arr[i]<0) {
				negative++;
			}else {
				zeros++;
			}
		}
		System.out.println("positive counts "+positive);
		System.out.println("negative counts "+negative);
		System.out.println("zeros counts "+zeros);
	}
}

class numberPalindrome{
	numberPalindrome(int a){
		int b=0;
		int n=a;
		while(a>0) {
			int rem=a%10;
			b=b*10+rem;
			a=a/10;
		}if(n==b) {
			System.out.println("number palindrom");
		}else {
			System.out.println("not palindrome");
		}
		System.out.println(b);
	}
}

public class series {

	public static void main(String[] args) {
		evenOroddinArray e1=new evenOroddinArray();
		prime p1=new prime();
		p1.prime1();
		int a=p1.number();
		System.out.println(a);
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		numberPalindrome n1=new numberPalindrome(n);
		countPositiveNegativeNumbers c1=new countPositiveNegativeNumbers();
		String first="i";
		String second="ik";
		int m=1;
		switch(m) {
		case 1:
			System.out.println("this is 1");
			break;
		case 2:
			System.out.println("this is 2");
			break;
		default:
			System.out.println("looking");
		}
		
		System.out.println((m>0)? "greater":"smaller");
		String number=(m>0)?"greater":"smaller";
		System.out.println(number);
	}

}
