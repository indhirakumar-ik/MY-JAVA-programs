package indhirakumar;

import java.util.Scanner;


public class calculatorApk {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		char c;
		do {
			System.out.print("Enter your first number :");
			int a=scan.nextInt();
			System.out.print("enter your second number :");
			int b=scan.nextInt();
			System.out.print("Enter your operation :");
			char operator=scan.next().charAt(0);
			if(operator =='+') {
				System.out.println("Result"+(a+b));
			}else if(operator=='-') {
				System.out.println("Result"+(a-b));
			}else if(operator=='*') {
				System.out.println("Result"+(a*b));
			}else if(operator=='/') {
				System.out.println("Result"+(a/b));
			}else {
				System.out.println("error");
			}
			System.out.print("if continue or not (y/n):");
			c=scan.next().charAt(0);
		}while(c=='y'||c=='Y');
		
		System.out.println("calculator closed");

}}
