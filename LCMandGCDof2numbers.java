package indhirakumar;

import java.util.Scanner;


public class LCMandGCDof2numbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number 1 :");
		int n1=sc.nextInt();
		System.out.println("Enter your second number 2 :");
		int n2=sc.nextInt();
		int max=0;
		if(n1>n2) {
			max=n1;
		}else {
			max=n2;
		}
		for(int i=1;i<=max;i++) {
			if(max%2==0 && max%1==0) {
				System.out.println("the number is"+i);
				break;
			}
		max++;
		}
	}

}
