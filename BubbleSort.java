package indhirakumar;
import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter how much of element of you stored");
		int n=scan.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter your element no "+i);
			int element=scan.nextInt();
			arr[i]=element;
		}
		System.out.println("Your Array is");
		for(int a:arr) {
			System.out.print(a+" ");
		}
		System.out.println();
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("Your sorted Array is");
		for(int a:arr) {
			System.out.print(a+" ");
		}
		System.out.println();
		int l=0;
		int r=n-1;
		System.out.println("Enter your target");
		int target=scan.nextInt();
		int mid=0;
		while(l<=r) {
			mid=(l+r)/2;
			if(arr[mid]==target) {
				break;
			}else if(arr[mid]<target) {
				l=mid+1;
			}else {
				r=mid-1;
			}
		}
		if(arr[mid]==target) {
			System.out.println("element was found");
		}else {
			System.out.println("element was not found");
		}
	}

}
