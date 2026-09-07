package indhirakumar;

import java.util.Scanner;

public class twoSum1 {

	public static void main(String[] args) {
		int a[][]=new int[4][3];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.println("enter your number"+i+""+j);
				a[i][j]=sc.nextInt();
			}
		}
		
		for(int[] i:a) {
			for(int j:i) {
				System.out.println(j);
			}
		}
		int n=5;
		System.out.println(++n);

	}}
