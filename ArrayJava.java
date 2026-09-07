package indhirakumar;
import java.util.Scanner;
import java.util.Arrays;

class Array{
	void insert(int length,int values) {
		length++;
		int[] arr=new int[length];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=5;
		arr[4]=6;
		for(int i:arr) {
			System.out.print("["+i+"]");
		}
		for(int i=length-1;i>3;i--) {
			arr[i]=arr[i-1];
			length++;
		}
		for(int i:arr) {
			System.out.println(i);
		}
		arr[3]=4;
		for(int i:arr) {
			System.out.print("new array ["+i+"]");
		}
		System.out.println(Arrays.toString(arr));
	}
}

public class ArrayJava {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Array a=new Array();
		a.insert(5,6);
		
	}

}
