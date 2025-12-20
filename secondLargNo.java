import java.util.Arrays;
public class secondLargNo {

	public static void main(String[] args) {
		int a[]= {10,20,90,60,50,70};
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}System.out.println("first largest number :"+max);
		
		int arr[]= {20,60,90,50};
		Arrays.sort(arr);
		System.out.println("second largest number :"+arr[arr.length-2]);
		
	}
}