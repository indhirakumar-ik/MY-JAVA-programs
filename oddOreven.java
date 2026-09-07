package indhirakumar;

import java.util.Scanner;

public class oddOreven {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		
		if(0<n) {
			if(n%2==0) {
				System.out.println("even");
			}
		}
		else if(n%2!=0){
			System.out.println("odd");
		}
		else {
			System.out.println("cannot divisible by zero");
		}
	}

}
