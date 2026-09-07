package indhirakumar;
import java.util.Scanner;

class digit{
	void dg(int []a) {
		
		int m=0;
		for(int i=0;i<a.length;i++) {
			m=m+a[i];
		}
		System.out.println("count of array "+m);
		
		int count=0;
		int n=m;
		while(n>0) {
			count=count+n%10;
			n=n/10;
		}
		System.out.println("number count "+count);
	}
}

public class two_sum_problem {

	public static void main(String[] args) {
		
		
		digit d1=new digit();
		int[] ar= {1,2,200,100,23};
		d1.dg(ar);
		
		 
		
		/*Scanner scan =new Scanner(System.in);
		int a=scan.nextInt();
		int count=0;
		int arr[]= {0,1,2,3,53,45,6,7,100,7,15,30,9,10};
		int n1=arr[0],n2=arr[0],n3=arr[0];
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				for(int k=i+1;k<arr.length;k++) {
					if(arr[i]+arr[j]+arr[k]==a) {
						 n1=arr[i];
						 n2=arr[j];
						 n3=arr[k];
					}
				}
		}
}System.out.println(n1);
System.out.println(n2);
System.out.println(n3);*/

		
	}
	}
